package letter;


public class RegisteredLetter extends Inter {

	public RegisteredLetter(Letter<?> letter) {
		super(letter.getSender(), letter.getReceiver(), letter);
	}

	/**
	 * execute what doing the letter
	 */
	@Override
	public void action() {
		letter.getContent().action();
		this.sender.getCity().sendLetter(new AknowLetter(this));

	}

	/**
	 * return the message display
	 * @return String message
	 */
	public String getMessage() {
		return " registered letter" + super.getMessage() + letter.getContent().getMessage();
	}


	/**
	 * return the letter cost
	 * @return int cost
	 */
	@Override
	public int getCost() {
		return this.letter.getContent().getCost() + 15;
	}

}