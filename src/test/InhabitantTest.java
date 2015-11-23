package test;

import static org.junit.Assert.*;

import org.junit.Test;

import courriers.City;
import courriers.Inhabitant;

public class InhabitantTest {
	public static Inhabitant inhabitant = new Inhabitant("Toto",new City("Lille"),5000);
	
	@Test
	public void nameTest() {
		inhabitant.setName("Truc");
		assertEquals("Truc",inhabitant.getName());
	}
	
	@Test
	public void cityNameTest() {
		City cityy = new City("Lens");
		inhabitant.setCity(cityy);
		assertEquals(cityy.getName(),inhabitant.getNameCity());
	}

}
