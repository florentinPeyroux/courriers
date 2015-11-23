package letter;

import courriers.*;

public class SimpleLetter extends Letter<TextContent>{

	public SimpleLetter(Inhabitant sender, Inhabitant receiver, TextContent text) {
		super(sender, receiver, text);
		
	}

	@Override
	public void action() {}
	
	public String getMessage(){
		return " simple letter"+ super.getMessage()+" text content ("+this.content.getContent()+")";
	}

	@Override
	public int getCost() {
		return 1;
	}
	
}
