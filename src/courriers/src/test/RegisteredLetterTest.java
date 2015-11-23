package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import letter.RegisteredLetter;
import letter.SimpleLetter;
import letter.TextContent;

public class RegisteredLetterTest extends LetterTest {
	@Before
	public void initLetter() {
		letter = new RegisteredLetter(new SimpleLetter(inhabitant2,inhabitant1,new TextContent("blabla")));
	}
	@Test
	public void costTest() {
		System.out.println(letter.getMessage());
		assertEquals(16,letter.getCost());
	}
	
	@Test
	public void getMessageTest() {
		assertEquals(" registered letter whose content is a simple letter whose content is a text content (blabla)",letter.getMessage());
	}
	
}
