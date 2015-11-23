package letter;

public class IllegalUrgentLetterException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8244577740437827902L;

	public IllegalUrgentLetterException(){
	System.out.println("Vous ne pouvez aps mettre une urgent letter dans une urgent letter");
	}
}
