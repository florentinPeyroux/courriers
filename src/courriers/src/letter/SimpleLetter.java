package letter;

import courriers.*;

public class SimpleLetter extends Letter<TextContent> {

	public SimpleLetter(Inhabitant sender, Inhabitant receiver, TextContent text) {
		super(sender, receiver, text);

	}

	/**
	 * execute what doing the letter
	 */
	@Override
	public void action() {
	}

	/**
	 * return the message display
	 * @return String message
	 */
	public String getMessage() {
		return " simple letter" + super.getMessage() + " text content (" + this.content.getContent() + ")";
	}

	/**
	 * return the letter cost
	 * 
	 * @return int cost
	 */
	@Override
	public int getCost() {
		return 1;
	}

}
