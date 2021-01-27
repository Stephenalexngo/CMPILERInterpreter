import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;

import java.io.File;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

import com.udojava.evalex.Expression;

import customfiles.*;

public class Main {

    public static void showTree() throws Exception {
        CharStream cStream = CharStreams.fromFileName("inputtext.txt");
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
        CharStream cStream = CharStreams.fromFileName("inputtext.txt");

        CustomErrorListener customErrorListener = new CustomErrorListener();
        Lexer lexer = new MainLexer(cStream);

        TokenStream tokens = new CommonTokenStream(lexer);

        MainParser parser = new MainParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(customErrorListener);

        ParseTree tree = parser.start();
        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(new MainBaseListener(), tree);

        if(customErrorListener.getErrorList() == 0){
            System.out.println("No Syntax Errors"); // should be in GUI
            return true;
        }

        return false;
    }

    public static void interpret() throws Exception {
        File input_file = new File("inputtext.txt");
        Scanner input = new Scanner(input_file);

        
    }

    public static void main(String[] args) throws Exception {
        // parse(this.input); for GUI
        if(parse()){
            // showTree();
            interpret();
        }
        
        // int y=5;
        // String x = "1+1/" + y;
        // Expression expression = new Expression(x);
        // BigDecimal result = expression.eval(); 
        // System.out.println(result);
    }
}
