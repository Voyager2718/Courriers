package city;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankAccoutTest {
	BankAccount b ;
	@Before
	public void init(){
		b = new BankAccount(1000);
	}
	@Test
	public void testGetBalance() {
		assertEquals(1000, b.getBalance());
	}
	@Test
	public void testCredit() {
		b.credit(500);
		assertEquals(1500, b.getBalance());
	}

	@Test
	public void testDebit() {
		b.debit(500);
		assertEquals(500, b.getBalance());
	}
}
