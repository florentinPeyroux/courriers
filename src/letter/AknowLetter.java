package letter;

public class AknowLetter extends SimpleLetter {

	public AknowLetter(Letter<Contents> letter) {
		
		super(letter.receiver, letter.sender,new TextContent("aknowledgment of receipt for a "+ letter.getMessage()));
	}
	
	
	
	public String getMessage() {
		return "  aknowledgment of receipt which is a "+ super.getMessage();
	}

	@Override
	public void action() {		
	}

}
