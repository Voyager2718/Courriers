package test;

import static org.junit.Assert.*;

import org.junit.Test;

import inhabitant.Inhabitant;

public class InhabitantTest {
	@Test
	public void InhabitantCreationTest() {
		Inhabitant yang = new Inhabitant("YANG", 100000000), song = new Inhabitant("SONG");
		assertEquals(100000000, yang.getBalance());
		yang.credit(10000000);
		assertEquals(110000000, yang.getBalance());
		yang.debit(10000000);
		assertEquals(100000000, yang.getBalance());
		assertEquals("SONG", song.getName());
	}
}
