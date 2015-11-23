package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import letter.SimpleLetter;
import letter.TextContent;

public class SimpleLetterTest extends LetterTest{

	@Before
	public void initLetter(){
		letter = new SimpleLetter(inhabitant2,inhabitant1,new TextContent("blabla"));
	}
	
	@Test
	public void getCostTest() {
	assertEquals(1,letter.getCost());
	}

}
