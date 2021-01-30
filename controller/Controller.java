package controller;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import com.udojava.evalex.Expression;

import customfiles.*;
import commandfiles.*;
import model.*;
import ui.gui;
import grammarfile.*;

public class Controller {
    public static void showTree(String input) throws Exception {
        CharStream cStream = CharStreams.fromString(input);
        Lexer lexer = new MainLexer(cStream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        MainParser parser = new MainParser(tokenStream);
        parser.removeErrorListeners();
        ParseTree tree = parser.start();

        // Tree Viewer
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        viewer.open();
    }

    public static boolean parse(String input) throws Exception {
        SymbolTableManager.initialize();

        CharStream cStream = CharStreams.fromString(input);

        CustomErrorListener customErrorListener = new CustomErrorListener();
        Lexer lexer = new MainLexer(cStream);

        TokenStream tokens = new CommonTokenStream(lexer);

        MainParser parser = new MainParser(tokens);
        customErrorListener.setParser(parser);
        parser.removeErrorListeners();
        parser.addErrorListener(customErrorListener);

        ParseTree tree = parser.start();
        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(new MyListener(parser), tree);

        if(customErrorListener.getErrorList() == 0){
            gui.console.appendText("No Syntax Errors");
            return true;
        }

        return false;
    }
}
