package courriers;

import java.util.ArrayList;
import java.util.Random;

import letter.*;

public class Main {

	/**
	 * @param args
	 * @throws IllegalUrgentLetterException
	 */
	public static void main(String[] args) throws IllegalUrgentLetterException {
		City acity = new City("Lille");
		int nb_lettre;
		int nb_jours = 6;
		for (int i = 0; i < 100; i++) {
			acity.addInhabitant(new Inhabitant("inhabitant" + i, acity, 5000));
		}
		ArrayList<Letter<?>> type_letter =initLetter(acity);

		for (int i = 1; i <= nb_jours; i++) {
			System.out.println(" Day : " + i +"\n");
			acity.distributeLetter();
			nb_lettre = random_number(100)+1;
			for (int j = 0; j < nb_lettre; j++) {
				Inhabitant sender = randomInhabitant(acity);
				Inhabitant receiver = randomInhabitant(acity);
				Letter<?> letter = type_letter.get(random_number(8));
				letter.setReceiver(receiver);
				letter.setSender(sender);
				acity.sendLetter(letter);
			}
			System.out.println("\n");
		}


	}

	/**
	 * return an random number	 
	 * @param int borned
	 * @return int number
	 */
	public static int random_number(int borned) {
		Random random = new Random();
		return random.nextInt(borned);
	}
	/**
	 * return an random Inhabitant	 
	 * @param int borned
	 * @return Inhabitant inhabitant
	 */
	public static Inhabitant randomInhabitant(City city) {
		return city.getInhabitantListe().get(random_number(10));
	}

	/**
	 * initialize the Letter list
	 * @param acity
	 * 
	 */
	public static ArrayList<Letter<?>> initLetter(City acity) {
		ArrayList<Letter<?>> type_letter = new ArrayList<Letter<?>>();
		try {
			SimpleLetter simpleLetter1 = new SimpleLetter(acity
					.getInhabitantListe().get(1), acity.getInhabitantListe()
					.get(2),new TextContent( "blablabla"));
			PromissoryLetter promissoryLetter = new PromissoryLetter(acity
					.getInhabitantListe().get(1), acity.getInhabitantListe()
					.get(5),new AmountContent( 18));

			UrgentLetter urgentLetter1 = new UrgentLetter(simpleLetter1);
			UrgentLetter urgentLetter2 = new UrgentLetter(promissoryLetter);

			RegisteredLetter registeredLetter1 = new RegisteredLetter(
					simpleLetter1);
			RegisteredLetter registeredLetter2 = new RegisteredLetter(promissoryLetter);
			RegisteredLetter registeredLetter3 = new RegisteredLetter(
					urgentLetter1);
			RegisteredLetter registeredLetter4 = new RegisteredLetter(
					urgentLetter2);

			UrgentLetter urgentLetter3;

			urgentLetter3 = new UrgentLetter(registeredLetter1);

			UrgentLetter urgentLetter4 = new UrgentLetter(registeredLetter2);

			type_letter.add(simpleLetter1);
			type_letter.add(promissoryLetter);
			type_letter.add(urgentLetter1);
			type_letter.add(urgentLetter2);
			type_letter.add(urgentLetter3);
			type_letter.add(urgentLetter4);
			type_letter.add(registeredLetter1);
			type_letter.add(registeredLetter2);
			type_letter.add(registeredLetter3);
			type_letter.add(registeredLetter4);

		} catch (IllegalUrgentLetterException e) {		
			e.printStackTrace();
		}
		return type_letter;
	}
}
