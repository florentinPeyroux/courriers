package letter;

import courriers.Inhabitant;

public class UrgentLetter extends Inter  {

	public UrgentLetter(Letter<?> letter) throws IllegalUrgentLetterException {
					super(letter.getSender(), letter.getReceiver(),letter);
			if(this.letter.getContent().isUrgentLetter()){
				throw new IllegalUrgentLetterException();
			}		
	}

	@Override
	public void action() {
		letter.getContent().action();

	}

	public String getMessage() {
		return "n urgent letter"+ super.getMessage()+ letter.getContent().getMessage();
	}
	
	@Override
	public boolean isUrgentLetter(){
		return true;
	}
	public Inhabitant getSender() {
		return this.sender;
	}


	public Inhabitant getReceiver() {
		return this.receiver;
	}

	@Override
	public int getCost() {
		return 2 * this.letter.getContent().getCost();
	}
	
}

