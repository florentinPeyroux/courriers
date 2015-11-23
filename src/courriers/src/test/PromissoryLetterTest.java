package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import letter.AmountContent;
import letter.PromissoryLetter;

public class PromissoryLetterTest extends LetterTest {
	public static PromissoryLetter leter = new PromissoryLetter(inhabitant2, inhabitant1, new AmountContent(18));

	@Before
	public void initLetter() {
		letter = new PromissoryLetter(inhabitant2, inhabitant1, new AmountContent(18));
	}

	@Test
	public void AmountTest() {
		leter.setAmount(32);
		assertEquals(leter.getAmount(), 32);
	}

	@Test
	public void getCostTest() {
		assertEquals(1 + (1 / 100) * 18, letter.getCost());
	}
	@Test
	public void actionTest() {

		letter.action();
		assertEquals(inhabitant2.getBankAccount().getAmount(),4982);
		assertEquals(inhabitant1.getBankAccount().getAmount(),5017);

	}
}
