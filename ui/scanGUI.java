package ui;

import java.util.HashMap;

import org.reactfx.value.Val;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import model.FuncClass;
import model.SymbolTableManager;
import model.VarClass;

public class scanGUI {
    
    private String label;
    private String varName;
    private String temp;
    private String currFunc;
    private int depth;

    HashMap<String, FuncClass> funcTable = SymbolTableManager.getInstance().getFuncTable();

    public scanGUI(){}

    public void setScanGUI(String label, String varName, String currFunc, int depth){
        label = label.replace("\"", "");
        this.label = label;
        this.varName = varName;
        this.currFunc = currFunc;
        this.depth = depth;
    }

    public void start(){
        String type = funcTable.get(currFunc).getVarTable().get(varName).getType();
        Stage primaryStage = new Stage();
        HBox hbox = new HBox();
        Label inputLabel = new Label(this.label);
        TextField inputText = new TextField();
        Button btnScan = new Button("Scan");

        primaryStage.setTitle("Scan");
        
        inputText.setPromptText(this.varName);
        
        hbox.setMargin(inputLabel, new Insets(20, 5, 20, 5)); 
        hbox.setMargin(inputText, new Insets(20, 5, 20, 5)); 
        hbox.setMargin(btnScan, new Insets(20, 5, 20, 5));  
        hbox.setAlignment(Pos.CENTER);
        hbox.setId("hbox");

        inputLabel.setId("label");

        ObservableList list = hbox.getChildren();  
        list.addAll(inputLabel, inputText, btnScan);      

        Scene scene = new Scene(hbox, 400, 50);

        btnScan.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                funcTable.get(currFunc).getVarTable().get(varName).setValue(inputText.getText());
                primaryStage.close();
            }
        });

        primaryStage.setScene(scene);
        primaryStage.showAndWait();
    }

    public String getValue(){
        return this.temp;
    }
}
