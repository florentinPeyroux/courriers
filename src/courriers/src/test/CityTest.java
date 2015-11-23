package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import courriers.City;
import courriers.Inhabitant;
import courriers.PostBox;
import letter.SimpleLetter;
import letter.TextContent;

public class CityTest {
	public static City aCity = new City("Lille");
	public static PostBox postBox = new PostBox();
	public static Inhabitant sender = new Inhabitant("Sender", aCity, 100);
	public static Inhabitant receiver = new Inhabitant("Receiver", aCity, 100);


	@Test
	public void setInhabitantListeTest() {
		ArrayList<Inhabitant> inhabitantListe = new ArrayList<Inhabitant>();
		aCity.setInhabitantListe(inhabitantListe);
		assertEquals(inhabitantListe, aCity.getInhabitantListe());
	}

	@Test
	public void setPostBoxTest() {
		aCity.setPostBox(postBox);
		assertEquals(postBox, aCity.getPostBox());
	}

	@Test
	public void setNameBoxTest() {
		aCity.setName("Lens");
		assertEquals("Lens", aCity.getName());
	}

	@Test
	public void addInhabitantTest() {
		Inhabitant inhabitant = new Inhabitant("Truc", aCity, 100);
		aCity.addInhabitant(inhabitant);
		assertTrue(aCity.getInhabitantListe().contains(inhabitant));
	}
	@Test
	public void sendLetterTest() {
		
		SimpleLetter simpleLetter = new SimpleLetter(sender,receiver,new TextContent("blabla"));
		aCity.sendLetter(simpleLetter);
		assertTrue(aCity.getPostBox().getPostBox().contains(simpleLetter));
		assertEquals(simpleLetter.getSender().getBankAccount().getAmount(),99);
	}
	
	@Test
	public void distributeLetterTest() {
		aCity.distributeLetter();
		assertTrue(aCity.getPostBox().getPostBox().isEmpty());
	}
}
