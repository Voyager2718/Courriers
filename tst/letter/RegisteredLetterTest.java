package letter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import content.TextContent;
import inhabitant.Inhabitant;

public class RegisteredLetterTest {

	protected SimpleLetter letter;
	protected Inhabitant sender, receiver;
	protected TextContent content;
	protected RegisteredLetter registered;
	@Before
	public void init() throws IncorrectCostException{
		sender = new Inhabitant("pierre");
		receiver = new Inhabitant("paul");
		sender = new Inhabitant("pierre");
		receiver = new Inhabitant("paul");
		content = new TextContent("blabla");
		letter = new SimpleLetter(10, sender, receiver, content);
		registered = new RegisteredLetter(letter);
	}

	@Test
	public void testGetCost() {
		assertEquals(25,registered.getCost());
	}

	@Test
	public void testGetContentDescription() {
		String description = " whose content is a registered letter whose content is a simple letter whose content is a text (blabla)";
		assertEquals(description, registered.getContentDescription());
	}

	@Test
	public void testGetLetterDescription() {
		String description = " a registered letter whose content is a simple letter whose content is a text (blabla)";
		assertEquals(description, registered.getLetterDescription());
	}

}
