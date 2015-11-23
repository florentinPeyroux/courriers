package letter;


public class UrgentLetter extends Inter  {

	public UrgentLetter(Letter<?> letter) throws IllegalUrgentLetterException {
					super(letter.getSender(), letter.getReceiver(),letter);
					//Rise illegalUrgentLetterException if letter content an urgentLetter
			if(this.letter.getContent().isUrgentLetter()){
				throw new IllegalUrgentLetterException();
			}		
	}
	
	/**
	 * execute what doing the letter
	 */
	@Override
	public void action() {
		letter.getContent().action();

	}
	
	/**
	 * return the message display
	 * @return String message
	 */
	public String getMessage() {
		return "n urgent letter"+ super.getMessage()+ letter.getContent().getMessage();
	}
	
	/**
	 * return true if is an urgent letter
	 * @return boolean true
	 */
	@Override
	public boolean isUrgentLetter(){
		return true;
	}

	/**
	 * return the letter cost
	 * @return int cost
	 */
	@Override
	public int getCost() {
		return 2 * this.letter.getContent().getCost();
	}
	
}

