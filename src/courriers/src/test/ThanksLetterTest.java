package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import letter.SimpleLetter;
import letter.TextContent;
import letter.ThanksLetter;

public class ThanksLetterTest extends SimpleLetterTest {

	@Before
	public void initLetter(){
		letter = new ThanksLetter(new SimpleLetter(inhabitant2,inhabitant1,new TextContent("blabla")));
	}
	@Test
	public void getMessagetest() {
		System.out.println(letter.getMessage());
		assertEquals(" thanks letter which is a  simple letter whose content is a text content (thanks for a  simple letter whose content is a text content (blabla))",letter.getMessage());
	}

}
