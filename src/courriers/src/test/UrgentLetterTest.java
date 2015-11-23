package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import letter.UrgentLetter;
import letter.IllegalUrgentLetterException;
import letter.SimpleLetter;
import letter.TextContent;

public class UrgentLetterTest extends LetterTest {
	@Before
	public void initLetter() throws IllegalUrgentLetterException {
		letter = new UrgentLetter(new SimpleLetter(inhabitant2,inhabitant1,new TextContent("blabla")));
	}
	
	@Test(expected=IllegalUrgentLetterException.class)
	public void urgentLetterExceptionTest() throws IllegalUrgentLetterException {
		@SuppressWarnings("unused")
		UrgentLetter urgentLetter= new UrgentLetter(new UrgentLetter(new SimpleLetter(inhabitant2,inhabitant1,new TextContent("blabla"))));
		
	}
	@Test
	public void getCostTest() {
		assertEquals(2,letter.getCost());
	}

	@Test
	public void isUrgentLetterTest() {
		assertTrue(letter.isUrgentLetter());
	}
}
