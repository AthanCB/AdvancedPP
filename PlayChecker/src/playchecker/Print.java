
package playchecker;


public class Print extends HelloBaseListener{

    Print() {
        
    }

       @Override public void enterInit(HelloParser.InitContext ctx) {
		System.out.println("Text begins");
	}

	@Override public void exitInit(HelloParser.InitContext ctx) {
		System.out.println("Text ends");
	}

	@Override public void enterStat(HelloParser.StatContext ctx) {
		System.out.println("  Recognized " + ctx.ID().getText() + " as ID");
	}
}
