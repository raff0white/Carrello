import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarrelloTest {

	@Test
	void testCarrello() {
		Carrello carrello = new Carrello ();
		int expected = 0;
		assertEquals(expected, carrello.getAmount());
	}

	@Test
	void testGetAmount() {
		fail("Not yet implemented");
	}

	@Test
	void testInsertOneProduct() {
		Carrello carrello = new Carrello ();
		int expected = 3;
		carrello.insertOneProduct();
		carrello.insertOneProduct();
		carrello.insertOneProduct();
		assertEquals(expected, carrello.getAmount());
	}

	@Test
	void testRemoveOneProduct() {
		Carrello carrello = new Carrello ();
		int expected = 0;
		carrello.removeOneProduct();
		assertEquals(expected, carrello.getAmount());
	}
	
	

}
