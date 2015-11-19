package content;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MoneyContentTest {

	protected MoneyContent content;
	@Before
	public void init(){
		content = new MoneyContent(50);
	}
	@Test
	public void testGetContent() {
		assertEquals(50, content.getContent());
	}

}
