package playchecker;


public class Print extends PlayBaseListener{


       @Override 
       public void enterInit(PlayParser.InitContext ctx) {
		System.out.println("Text begins");
	}

	@Override
        public void exitInit(PlayParser.InitContext ctx) {
		System.out.println("Text ends");
	}
        
        @Override
        public void enterTheatricalplay(PlayParser.TheatricalplayContext ctx) {
		System.out.println("TOKEN: " + ctx.getText() + " recognized.");
	}
        
        

}
