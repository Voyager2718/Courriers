package letter;

import static org.junit.Assert.*;

import org.junit.Test;

import content.TextContent;
import inhabitant.Inhabitant;

public class IncorrectCostExceptionTest {

	@Test(expected=IncorrectCostException.class)
	public void test() throws IncorrectCostException {
		SimpleLetter simpleletter = new SimpleLetter(-1, new Inhabitant("1"),  new Inhabitant("1"), new TextContent(""));
	}

}
