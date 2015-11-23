package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import courriers.City;
import courriers.Inhabitant;
import courriers.PostBox;
import letter.SimpleLetter;
import letter.TextContent;

public class PostBoxTest {
public static PostBox postBox = new PostBox();
public static Inhabitant inhabitant1 = new Inhabitant("truc",new City("Lille"),5000);
public static Inhabitant inhabitant2 = new Inhabitant("machin",new City("Lille"),5000);
public static SimpleLetter letter = new SimpleLetter(inhabitant2,inhabitant1,new TextContent("blabla"));


	
	@Before 
	public void ajoutLettre(){
		postBox.add(letter);		
	}
	
	@Test
	public void addLetterTest() {
			assertTrue(postBox.getPostBox().contains(letter));
		
	}
	
	@Test
	@After
	public void ditributeLetterTest(){
		postBox.distributeLetter();
		assertTrue(postBox.getPostBox().isEmpty());

	}

}
