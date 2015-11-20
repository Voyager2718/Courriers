package letter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import content.MoneyContent;
import content.TextContent;
import inhabitant.Inhabitant;

public class PromissoryLetterTest {

	protected SimpleLetter letter;
	protected PromissoryLetter promisory;
	protected Inhabitant sender, receiver;
	protected MoneyContent content;
	protected TextContent contentLetter;
	
	@Before
	public void init() throws IncorrectCostException{	
		sender = new Inhabitant("pierre");
		receiver = new Inhabitant("paul");
		content = new MoneyContent(100);
		contentLetter = new TextContent("blabla");
		letter = new SimpleLetter(10, sender, receiver, contentLetter);
		promisory = new PromissoryLetter(content, letter);
	}

	@Test
	public void testGetMoneyContent() {
		assertEquals(100, promisory.getMoneyContent().getContent());
	}

	@Test
	public void testGetCost() {
		assertEquals(11, promisory.getCost());
	}

	@Test
	public void testGetContentDescription() {
		String description = " whose content is a promissory letter whose content is a simple letter whose content is a text (blabla)"
;
		assertEquals(description, promisory.getContentDescription());
	}

	@Test
	public void testGetLetterDescription() {
		String description = " a promissory letter whose content is money content(100) whose content is a simple letter whose content is a text (blabla)";
		assertEquals(description, promisory.getLetterDescription());
	}
}
