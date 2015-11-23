package test;

import static org.junit.Assert.*;

import org.junit.Test;

import letter.SimpleLetter;
import letter.TextContent;

public class SimpleLetterTest extends LetterTest{

	@Test
	public void getCostTest() {
	SimpleLetter letter = new SimpleLetter(inhabitant2,inhabitant1,new TextContent("blabla"));
	assertEquals(1,letter.getCost());
	}

}
