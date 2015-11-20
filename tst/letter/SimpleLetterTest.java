package letter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import content.TextContent;
import inhabitant.Inhabitant;

public class SimpleLetterTest {

	SimpleLetter letter;
	Inhabitant sender, receiver;
	TextContent content;
	@Before
	public void init() throws IncorrectCostException{
		sender = new Inhabitant("pierre");
		receiver = new Inhabitant("paul");
		content = new TextContent("blabla");
		letter = new SimpleLetter(10, sender, receiver, content);
	}
	
	@Test
	public void testGetSender() {
		assertEquals(sender, letter.getSender());
	}

	@Test
	public void testGetReceiver() {
		assertEquals(receiver, letter.getReceiver());
	}

	@Test
	public void testGetText() {
		assertEquals(content, letter.getText());
	}

	@Test
	public void testGetCost() {
		assertEquals(10, letter.getCost());
	}

	@Test
	public void testGetContentDescription() {
		String content = " whose content is a simple letter whose content is a text (blabla)";
		assertEquals(content, letter.getContentDescription());
	}

	@Test
	public void testGetLetterDescription() {
		String description = " a simple letter ";
		assertEquals(description, letter.getLetterDescription());
	}

}
