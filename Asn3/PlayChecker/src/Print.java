//icsd14134 - Bonis Athanasios

import org.antlr.v4.runtime.tree.ErrorNode;



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
        public void enterAction(PlayParser.ActionContext ctx) {
            System.out.println("TOKEN: " + ctx.getText()+ " recognized.");
                
	}
        
      
        
        

}
