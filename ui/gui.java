package ui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Collection;
import java.util.Collections;
import java.util.function.IntFunction;

import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;
import org.fxmisc.richtext.model.StyleSpans;
import org.fxmisc.richtext.model.StyleSpansBuilder;

import controller.*;

public class gui extends Application {

    private static final String[] KEYWORDS = new String[] {
        "create", "constant", "return", "print", "scan", "void",
        "func", "main", "if", "else", "else if", "then", "for",
        "up to", "down to", "while", "int", "bool", "float", "String",
    };

    //private static final String[] VAR_NAMES;

    private static final String KEYWORD_PATTERN = "\\b(" + String.join("|", KEYWORDS) + ")\\b";
    private static final String PAREN_PATTERN = "\\(|\\)";
    private static final String BRACE_PATTERN = "\\{|\\}";
    private static final String BRACKET_PATTERN = "\\[|\\]";
    private static final String SEMICOLON_PATTERN = "\\;";
    private static final String STRING_PATTERN = "\"([^\"\\\\]|\\\\.)*\"";
    private static final String COMMENT_PATTERN = "//[^\n]*" + "|" + "/\\*(.|\\R)*?\\*/";
    //private static final String VAR_PATTERN = "\\b(" + String.join("|", VAR_NAMES) + ")\\b";
    
    private static final Pattern PATTERN = Pattern.compile(
        "(?<KEYWORD>" + KEYWORD_PATTERN + ")" +
        "|(?<PAREN>" + PAREN_PATTERN + ")" +
        "|(?<BRACE>" + BRACE_PATTERN + ")" +
        "|(?<BRACKET>" + BRACKET_PATTERN + ")" +
        "|(?<SEMICOLON>" + SEMICOLON_PATTERN + ")" +
        "|(?<STRING>" + STRING_PATTERN + ")" +
        "|(?<COMMENT>" + COMMENT_PATTERN + ")"
    );

    @Override
    public void start(Stage primaryStage) {
        CodeArea codeArea = new CodeArea();

        TextArea console = new TextArea();
        console.setEditable(false);

        Button btnCompile = new Button("Compile");        

        HBox hbox = new HBox(btnCompile);
        hbox.setAlignment(Pos.BASELINE_CENTER);

        primaryStage.setTitle("CMPILER");

        BorderPane border = new BorderPane();

        

        String stylesheet = gui.class.getResource("stylesheet.css").toExternalForm();

        
        IntFunction<String> format = (digits -> " %" + digits + "d ");
        codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea, format));
            codeArea.textProperty().addListener((obs, oldText, newText) -> {
        });
        //codeArea.setStyleSpans(0, computeHighlighting(newText));

        codeArea.textProperty().addListener((obs, oldText, newText) -> {
            codeArea.setStyleSpans(0, computeHighlighting(newText));
        });

        btnCompile.setPrefSize(80, 30);

        codeArea.getStylesheets().add(stylesheet);

        btnCompile.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                try{
                    if(Controller.parse(codeArea.getText())){
                        Controller.showTree(codeArea.getText());
                        // interpret();
                    }else{
                        // send error
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
                
                console.appendText("COMPILED \n");
            }
        });

        border.setTop(hbox);
        border.setCenter(codeArea);
        border.setBottom(console);

        Scene scene = new Scene(border, 1000, 800);
                

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