package letter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import content.TextContent;
import inhabitant.Inhabitant;

public class ReceiptTest {
	protected Inhabitant sender, receiver;
	protected TextContent content;
	protected Receipt receipt;
	@Before
	public void init() throws IncorrectCostException{
		sender = new Inhabitant("pierre");
		receiver = new Inhabitant("paul");
		sender = new Inhabitant("pierre");
		receiver = new Inhabitant("paul");
		content = new TextContent("blabla");
		receipt = new Receipt(10, sender, receiver, content);
	}
	@Test
	public void testGetDescription() {
		assertEquals("a receipt.",receipt.getDescription());
	}

}
