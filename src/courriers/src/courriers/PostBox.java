package courriers;

import java.util.ArrayList;

import letter.Letter;

public class PostBox {
	private ArrayList<Letter<?>> postBox;
	private ArrayList<Letter<?>> bag;

	public PostBox() {
		postBox = new ArrayList<Letter<?>>();
		bag = new ArrayList<Letter<?>>();

	}

	public ArrayList<Letter<?>> getPostBox() {
		return postBox;
	}

	/**
	 * distribute the letter in the postBox
	 */
	public void distributeLetter() {
			for (Letter<?> letter : postBox) {
				bag.add(letter);
			}
			postBox.clear();
			for (Letter<?> letter : bag) {
				System.out.println(" <- "+letter.getReceiver().getName()+" receives a" + letter.getMessage() + " from "+letter.getSender().getName());
				letter.action();
			}
	}
	
	/**
	 * post the letter in the postBox
	 * @param Letter<?> letter
	 */
	public void add(Letter<?> letter) {
		postBox.add(letter);
	}
}
