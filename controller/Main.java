package controller;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import customfiles.*;
import commandfiles.*;
import model.*;
import grammarfile.*;

public class Main {

    static ArrayList<ICommand> arrCommand = new ArrayList<ICommand>();
    static ArrayList<String> semanticMessage = new ArrayList<String>();
    static HashMap<String, VarClass> varTable = new HashMap<String, VarClass>();

    public static void showTree() throws Exception {
        CharStream cStream = CharStreams.fromFileName("controller/inputtext.txt");
        Lexer lexer = new MainLexer(cStream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        MainParser parser = new MainParser(tokenStream);
        parser.removeErrorListeners();
        ParseTree tree = parser.start();

        // Tree Viewer
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        viewer.open();
    }

    public static boolean parse() throws Exception {
        // CharStream cStream = CharStreams.fromString(this.input); for GUI
        CharStream cStream = CharStreams.fromFileName("controller/inputtext.txt");

        CustomErrorListener customErrorListener = new CustomErrorListener();
        Lexer lexer = new MainLexer(cStream);

        TokenStream tokens = new CommonTokenStream(lexer);

        MainParser parser = new MainParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(customErrorListener);

        ParseTree tree = parser.start();
        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(new MyListener(parser), tree);

        if(customErrorListener.getErrorList() == 0){
            System.out.println("No Syntax Errors"); // should be in GUI
            return true;
        }

        return false;
    }

    public static void main(String[] args) throws Exception {
        // parse(this.input); for GUI
        if(parse()){
            showTree();
        }
        
        // int y=5;
        // String x = "1+1/" + y;
        // Expression expression = new Expression(x);
        // BigDecimal result = expression.eval(); 
        // System.out.println(result);
    }
}
