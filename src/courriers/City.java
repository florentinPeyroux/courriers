package courriers;

import java.util.*;


import letter.*;

public class City {

	private String name;
	private ArrayList<Inhabitant> inhabitantListe;
	private PostBox postBox;

	public City(String name) {
		this.name = name;
		postBox = new PostBox();
		inhabitantListe = new ArrayList<Inhabitant>();
	}

	public ArrayList<Inhabitant> getInhabitantListe() {
		return inhabitantListe;
	}

	public void setInhabitantListe(ArrayList<Inhabitant> inhabitantListe) {
		this.inhabitantListe = inhabitantListe;
	}

	public PostBox getPostBox() {
		return this.postBox;
	}

	public void setPostBox(PostBox postBox) {
		this.postBox = postBox;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void addInhabitant(Inhabitant inhabitant) {
		inhabitantListe.add(inhabitant);
	}

	public void sendLetter(Letter<?> letter) {
		postBox.add(letter);
		System.out.println(" -> "+letter.getSender().getName()+" mails a" + letter.getMessage() + " to " + letter.getReceiver().getName() + " for a cost of "+ letter.getCost()+ " euros");
		letter.debitBankAccount();

	}

	public void distributeLetter() {
		postBox.distributeLetter();
	}
	 

}