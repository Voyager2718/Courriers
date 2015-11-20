package letter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import content.TextContent;
import inhabitant.Inhabitant;

public class UrgentLetterTest {
	protected UrgentLetter urgent;
	protected SimpleLetter letter;
	protected Inhabitant sender, receiver;
	protected TextContent content;
	
	@Before
	public void init() throws IncorrectCostException{
		sender = new Inhabitant("pierre");
		receiver = new Inhabitant("paul");
		content = new TextContent("blabla");
		letter = new SimpleLetter(10, sender, receiver, content);
		urgent = new UrgentLetter(letter);
	}
	
	@Test
	public void testGetCost() {
		assertEquals(20, urgent.getCost());
	}

	@Test
	public void testGetContentDescription() {
		assertEquals(" whose content is an urgent letter", urgent.getContentDescription());
	}

	@Test
	public void testGetLetterDescription() {
		String description = (" an urgent letter whose content is a simple letter whose content is a text (blabla)"
);
		assertEquals(description, urgent.getLetterDescription());
	}

}
