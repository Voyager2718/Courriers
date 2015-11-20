package city;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.TestGenerator;

import content.TextContent;
import inhabitant.Inhabitant;
import letter.SimpleLetter;

public class CityTest {
	
	protected City city;
	@Before
	public void init(){
		city = new City("test",2);
	}
	@Test
	public void testGetName() {
		assertEquals("test", city.getName());
	}

	@Test
	public void testAddInhabitant() {
		Inhabitant paul = new Inhabitant("paul");
		city.addInhabitant(paul);
		assertTrue(city.getInhabitants().contains(paul));
	}

	@Test
	public void testSendLetter() {
		SimpleLetter simpleletter = new SimpleLetter(city.getInhabitants(0), city.getInhabitants(1), new TextContent("test"));
		city.sendLetter(simpleletter);
		assertTrue(city.getLetter().contains(simpleletter));
	}

	@Test
	public void testDistributeLetters() {
		SimpleLetter simpleletter = new SimpleLetter(city.getInhabitants(0), city.getInhabitants(1), new TextContent("test"));
		city.sendLetter(simpleletter);
		city.distributeLetters();
		assertFalse(city.getLetter().contains(simpleletter));
	}
	
	@Test
	public void testGetInhabitant() {
		assertEquals("1",city.getInhabitants(0).getName());
	}
	
	@Test
	public void testGetInhabitantList() {
		int i = 1;
		for (Inhabitant inhabitant : city.getInhabitants()) {
			assertEquals(i+"",inhabitant.getName());
			i++;
		}
	}

}
