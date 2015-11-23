package letter;

import courriers.Inhabitant;


public class RegisteredLetter extends Inter  {

	public RegisteredLetter(Letter<?> letter) {
		super(letter.getSender(), letter.getReceiver(), letter);
	}

	@Override
	public void action() {
		letter.getContent().action();
		this.sender.getCity().sendLetter(new AknowLetter(this));

	}
	public String getMessage(){
		return " registered letter"+ super.getMessage()+letter.getContent().getMessage();
	}
	
	public Inhabitant getSender() {
		return this.sender;
	}

	public Inhabitant getReceiver() {
		return this.receiver;
	}


	@Override
	public int getCost() {
		return this.letter.getContent().getCost()+15;
	}
	
}