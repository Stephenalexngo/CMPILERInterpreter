package ui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import model.SymbolTableManager;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Collection;
import java.util.Collections;
import java.util.function.IntFunction;

import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;
import org.fxmisc.richtext.model.StyleSpans;
import org.fxmisc.richtext.model.StyleSpansBuilder;
import org.fxmisc.wellbehaved.event.EventPattern;
import org.fxmisc.wellbehaved.event.InputMap;
import org.fxmisc.wellbehaved.event.Nodes;

import controller.*;
import errorfiles.ErrorRepository;

public class gui extends Application {

    private static TextArea console = new TextArea();

    private static final String[] KEYWORDS = new String[] {
        "create", "constant", "return", "print", "scan", "void",
        "func", "main", "if", "else", "else if", "then", "for",
        "up to", "down to", "while",
    };

    private static final String[] VAR_TYPE = new String[]{
        "int", "bool", "float", "String",
    };

    //private static final String[] VAR_NAMES;

    private static final String KEYWORD_PATTERN = "\\b(" + String.join("|", KEYWORDS) + ")\\b";
    private static final String PAREN_PATTERN = "\\(|\\)";
    private static final String BRACE_PATTERN = "\\{|\\}";
    private static final String BRACKET_PATTERN = "\\[|\\]";
    private static final String SEMICOLON_PATTERN = "\\;";
    private static final String STRING_PATTERN = "\"([^\"\\\\]|\\\\.)*\"";
    private static final String COMMENT_PATTERN = "//[^\n]*" + "|" + "/\\*(.|\\R)*?\\*/";
    private static final String VAR_TYPE_PATTERN = "\\b(" + String.join("|", VAR_TYPE) + ")\\b";
    //private static final String VAR_PATTERN = "\\b(" + String.join("|", VAR_NAMES) + ")\\b";
    
    private static final Pattern PATTERN = Pattern.compile(
        "(?<KEYWORD>" + KEYWORD_PATTERN + ")" +
        "|(?<PAREN>" + PAREN_PATTERN + ")" +
        "|(?<BRACE>" + BRACE_PATTERN + ")" +
        "|(?<BRACKET>" + BRACKET_PATTERN + ")" +
        "|(?<SEMICOLON>" + SEMICOLON_PATTERN + ")" +
        "|(?<STRING>" + STRING_PATTERN + ")" +
        "|(?<VARTYPE>" + VAR_TYPE_PATTERN + ")" +
        "|(?<COMMENT>" + COMMENT_PATTERN + ")"
    );

    public static TextArea getTextArea(){
        return console;
    }

    @Override
    public void start(Stage primaryStage) {
        CodeArea codeArea = new CodeArea();

        console.setEditable(false);

        Button btnCompile = new Button("Compile");        

        HBox hbox = new HBox(btnCompile);
        hbox.setAlignment(Pos.BASELINE_RIGHT);

        primaryStage.setTitle("CMPILER");

        BorderPane border = new BorderPane();

        btnCompile.setId("compile");

        String stylesheet = gui.class.getResource("stylesheet.css").toExternalForm();
        String console_style = gui.class.getResource("console_style.css").toExternalForm();

        
        IntFunction<String> format = (digits -> " %" + digits + "d ");
        codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea, format));

        //codeArea.setStyleSpans(0, computeHighlighting(newText));

        codeArea.textProperty().addListener((obs, oldText, newText) -> {
            codeArea.setStyleSpans(0, computeHighlighting(newText));
        });

        btnCompile.setPrefSize(80, 30);

        codeArea.getStylesheets().add(stylesheet);

        InputMap<KeyEvent> im = InputMap.consume(
        EventPattern.keyPressed(KeyCode.TAB), 
            e -> codeArea.replaceSelection("    ")
        );
        Nodes.addInputMap(codeArea, im);

        btnCompile.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                console.appendText("\n ======== COMPILED ======== \n");

                try{
                    if(Controller.parse(codeArea.getText()) && !ErrorRepository.getInstance().getError()){
                        for(int x=0; x<SymbolTableManager.getInstance().getCommands().size(); x++){
                            SymbolTableManager.getInstance().getCommands().get(x).execute();
                        }
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });

        border.setTop(hbox);
        border.setCenter(codeArea);
        border.setBottom(console);

        Scene scene = new Scene(border, 800, 600);

        scene.getStylesheets().add(console_style);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private static StyleSpans<Collection<String>> computeHighlighting(String text) {
        Matcher matcher = PATTERN.matcher(text);
        int lastKwEnd = 0;
        StyleSpansBuilder<Collection<String>> spansBuilder = new StyleSpansBuilder<>();
        while (matcher.find()) {
            String styleClass = matcher.group("KEYWORD") != null ? "keyword"
                    : matcher.group("PAREN") != null ? "paren" : matcher
                            .group("BRACE") != null ? "brace" : matcher
                            .group("BRACKET") != null ? "bracket" : matcher
                            .group("SEMICOLON") != null ? "semicolon" : matcher
                            .group("VARTYPE") != null ? "var_type" : matcher
                            .group("STRING") != null ? "string" : null; /* never happens */
            assert styleClass != null;
            spansBuilder.add(Collections.emptyList(), matcher.start()
                    - lastKwEnd);
            spansBuilder.add(Collections.singleton(styleClass), matcher.end()
                    - matcher.start());
            lastKwEnd = matcher.end();
        }
        spansBuilder.add(Collections.emptyList(), text.length() - lastKwEnd);
        return spansBuilder.create();
    }   
}