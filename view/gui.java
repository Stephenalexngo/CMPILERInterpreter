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

import java.io.Console;
import java.util.function.IntFunction;

import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;

public class gui extends Application {

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        CodeArea codeArea = new CodeArea();

        TextArea console = new TextArea();
        console.setEditable(false);

        Button btnCompile = new Button("Compile");
        btnCompile.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                console.appendText("COMPILED \n");
            }
        });

        HBox hbox = new HBox(btnCompile);
        hbox.setAlignment(Pos.BASELINE_CENTER);

        primaryStage.setTitle("CMPILER");

        BorderPane border = new BorderPane();

        Scene scene = new Scene(border, 1000, 800);
        
        
        IntFunction<String> format = (digits -> " %" + digits + "d ");
        codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea,format));
        btnCompile.setPrefSize(80, 30);
        border.setTop(hbox);
        border.setCenter(codeArea);
        border.setBottom(console);
                
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}