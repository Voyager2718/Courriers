package inhabitant;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import inhabitant.Inhabitant;

public class InhabitantTest {

	public Inhabitant h1;
	@Before
	public void init(){
		h1 = new Inhabitant("pierre",500);
	}
	@Test
	public void testGetName() {
		assertEquals("pierre", h1.getName());
	}

	@Test
	public void testGetBalance() {
		assertEquals(500, h1.getBalance());
	}

	@Test
	public void testDebit() {
		h1.debit(500);
		assertEquals(0, h1.getBalance());

	}

	@Test
	public void testCredit() {
		h1.credit(500);
		assertEquals(1000, h1.getBalance());
	}

}
