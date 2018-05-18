//icsd14134 - Bonis Athanasios
package playchecker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;



public class PlayChecker {

    public static void main(String[] args) {
        try {
            String inputFile = null;
            if (args.length > 0)
                inputFile = args[0];
            
            InputStream inStream;
            
            if (inputFile != null)
                inStream = new FileInputStream(inputFile);
            else
                inStream = System.in;
            
            
            ANTLRInputStream input = new ANTLRInputStream(inStream);
            
            
            PlayLexer lexer = new PlayLexer(input);
            
            
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            
            
            PlayParser parser = new PlayParser(tokens);
            
            
            ParseTree tree = parser.reg();
            
            
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new Print(), tree);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PlayChecker.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PlayChecker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
