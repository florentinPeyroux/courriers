package test;

import static org.junit.Assert.*;

import org.junit.Test;

import courriers.City;
import courriers.Inhabitant;
import letter.Contents;
import letter.Letter;
import letter.SimpleLetter;
import letter.TextContent;

public abstract class LetterTest {
	public static City city = new City("Lille");
	public static Inhabitant inhabitant1 = new Inhabitant("Truc",city,5000);
	public static Inhabitant inhabitant2 = new Inhabitant("Muche",city,5000);

	
	public void test() {
	}

}
