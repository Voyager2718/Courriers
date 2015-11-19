package city;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import content.TextContent;
import inhabitant.Inhabitant;
import letter.IncorrectCostException;
import letter.Letter;
import letter.SimpleLetter;

public class CityTest {
	
	protected City c;
	protected Inhabitant h1,h2;
	protected ArrayList<Inhabitant> lh;
	protected Letter l;
	@Before
	public void init() throws IncorrectCostException{
		 c = new City("testCity");
		 h1=new Inhabitant("pierre", 100);
		 h2=new Inhabitant("paul", 100);
		 lh = new ArrayList<Inhabitant>();
		 l = new SimpleLetter(1, h1, h2, new TextContent("test"));
		 lh.add(h1);
		 lh.add(h2);
	}
	@Test
	public void testGetName() {
		assertEquals("testCity", c.getName());
	}

	@Test
	public void testAddInhabitant() {
		c.addInhabitant(h1);
		assertEquals(h1,c.inhabitants.get(0));
	}

	@Test
	public void testAddInhabitantsList() {
		c.addInhabitants(lh);
		assertEquals(h1,c.inhabitants.get(0));
		assertEquals(h2,c.inhabitants.get(1));
	}

	@Test
	public void testSendLetter() {
		c.sendLetter(h1, l);
		assertEquals(l,c.postBox.get(0));
	}

	@Test
	public void testDistributeLetters() {
		c.sendLetter(h1, l);
		c.distributeLetters();
		assertEquals(0, c.postBox.size());
	}

}
