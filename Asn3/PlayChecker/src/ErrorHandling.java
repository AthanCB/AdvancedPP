//icsd14134 - Bonis Athanasios

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;


public class ErrorHandling  extends BaseErrorListener{
    public static final ErrorHandling INSTANCE = new ErrorHandling();
      @Override
   public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
      throws ParseCancellationException {
          error(line,msg);
      }
   //Μέθοδος η οποία καλείται όταν βρίσκει error
   public void error(int line,String msg){
       System.err.println("You have an error in: " + line + " line " + msg);
          System.exit(0);
   }
    
}
