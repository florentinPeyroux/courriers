package letter;


public class ThanksLetter extends SimpleLetter {

	public ThanksLetter(Letter<?> letter) {
		
		super(letter.receiver, letter.sender,new TextContent("thanks for a "+ letter.getMessage()));
	}
	
	
	
	public String getMessage() {
		return " thanks letter which is a "+ super.getMessage();
	}

	@Override
	public void action() {		
	}

}
