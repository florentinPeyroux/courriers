package letter;

import courriers.*;

public abstract class Inter extends Letter<Contents> {
	
	protected LetterContent letter;
	
	public Inter(Inhabitant sender, Inhabitant receiver, Letter<?> letter) {	
		super(sender, receiver, letter.getContent());
		this.letter=new LetterContent(letter);
	}
	
	/**
	 * return the letterContent in the letter
	 * @param LetterContent sender
	 */
	public LetterContent getContent(){
		return this.letter;
	}
	
	/**
	 * set the new sender
	 * @param Inhabitant sender
	 */
	public void setSender(Inhabitant sender) {
		this.sender = sender;		
		Letter<?> letter =this.letter.getContent();
		letter.setSender(sender);
		this.letter.setContent(letter);

	}
	
	/**
	 * set the new receiver
	 * @param Inhabitant receiver
	 */
	public void setReceiver(Inhabitant receiver) {
		this.receiver = receiver;
		Letter<?> letter =this.letter.getContent();
		letter.setReceiver(receiver);
		this.letter.setContent(letter);
	}
}