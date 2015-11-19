package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import content.MoneyContent;
import content.TextContent;
import inhabitant.Inhabitant;
import junit.framework.Protectable;
import letter.IncorrectCostException;
import letter.PromissoryLetter;
import letter.SimpleLetter;

public class PromissoryLetterTest {
	protected Inhabitant sender;
	protected Inhabitant receiver;
	protected PromissoryLetter pl;
	@Before
	public void initPromissoryLetter() throws IncorrectCostException{
		sender = new Inhabitant("Pierre");
		receiver = new Inhabitant("Paul");
		pl = new PromissoryLetter(new MoneyContent(500), new SimpleLetter(0, sender , receiver, new TextContent("Hi")));
	}
	@Test
	public void testGetDescription() {
		assertEquals("This is a letter with money",pl.getDescription());
	}

	@Test
	public void testDoSend() {
		pl.doSend();
	}

	@Test
	public void testDoReceive() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCost() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSender() {
		fail("Not yet implemented");
	}

}
