package content;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TextContentTest {
	protected TextContent tc;
	@Before
	public void init(){
		tc = new TextContent("test");
	}
	@Test
	public void testGetContent() {
		assertEquals("test",tc.getContent());
	}

}
