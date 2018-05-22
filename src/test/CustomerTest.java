package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CustomerTest {

	@Test
	public void testCustomerName() {
		assertEquals(TestConstants.CUSTOMER_NAME, TestConstants.TEST_COSTUMER.getName());
	}

	@Test
	public void testCustomerStatementNoRental() {
		assertEquals("Rental Record for " + TestConstants.CUSTOMER_NAME + "\n" + "\t" + "Title" + "\t" + "\t" + "Days"
				+ "\t" + "Amount" + "\n" + "Amount owed is " + 0.0 + "\n" + "You earned " + 0
				+ " frequent renter points", TestConstants.TEST_COSTUMER.statement());
	}

	@Test
	public void testCustomerHtmlStatementNoRental() {
		assertEquals(
				"<H1>Rentals for <EM>TestUser</EM></H1><P>" + "\n" + "<P>You owe <EM>0.0</EM><P>" + "\n"
						+ "On this rental you earned <EM>0</EM> frequent renter points<P>",
				TestConstants.TEST_COSTUMER.htmlStatement());
	}

	@Test
	public void testCustomerStatementOneRental() {
		TestConstants.TEST_COSTUMER_ONE_RENTAL.addRental(TestConstants.TEST_RENTAL_1);
		assertEquals(
				"Rental Record for " + TestConstants.CUSTOMER_NAME + "\n" + "\t" + "Title" + "\t" + "\t" + "Days" + "\t"
						+ "Amount" + "\n" + "\t" + "Terminator 1" + "\t" + "\t" + 666 + "\t" + 996.0 + "\n"
						+ "Amount owed is " + 996.0 + "\n" + "You earned " + 1 + " frequent renter points",
				TestConstants.TEST_COSTUMER_ONE_RENTAL.statement());
	}

	@Test
	public void testCustomerHtmlStatementOneRental() {
		TestConstants.TEST_COSTUMER_ONE_RENTAL_HTML.addRental(TestConstants.TEST_RENTAL_1);
		assertEquals(
				"<H1>Rentals for <EM>TestUser</EM></H1><P>" + "\n" 
						+ "Terminator 1: 996.0<BR>" + "\n"
						+ "<P>You owe <EM>996.0</EM><P>" + "\n"
						+ "On this rental you earned <EM>1</EM> frequent renter points<P>",
				TestConstants.TEST_COSTUMER_ONE_RENTAL_HTML.htmlStatement());
	}

	@Test
	public void testCustomerStatementTwoRentals() {
		TestConstants.TEST_COSTUMER_TWO_RENTALS.addRental(TestConstants.TEST_RENTAL_1);
		TestConstants.TEST_COSTUMER_TWO_RENTALS.addRental(TestConstants.TEST_RENTAL_2);
		assertEquals(
				"Rental Record for " + TestConstants.CUSTOMER_NAME + "\n" + "\t" + "Title" + "\t" + "\t" + "Days" + "\t"
						+ "Amount" + "\n" + "\t" + "Terminator 1" + "\t" + "\t" + 666 + "\t" + 996.0 + "\n" + "\t"
						+ "Terminator 2" + "\t" + "\t" + 42 + "\t" + 126.0 + "\n" + "Amount owed is " + 1122.0 + "\n"
						+ "You earned " + 3 + " frequent renter points",
				TestConstants.TEST_COSTUMER_TWO_RENTALS.statement());
	}

	@Test
	public void testCustomerHtmlStatementTwoRentalsHtml() {
		TestConstants.TEST_COSTUMER_TWO_RENTALS_HTML.addRental(TestConstants.TEST_RENTAL_1);
		TestConstants.TEST_COSTUMER_TWO_RENTALS_HTML.addRental(TestConstants.TEST_RENTAL_2);
		assertEquals(
				"<H1>Rentals for <EM>TestUser</EM></H1><P>" + "\n" + "Terminator 1: 996.0<BR>" + "\n"
						+ "Terminator 2: 126.0<BR>" + "\n" + "<P>You owe <EM>1122.0</EM><P>" + "\n"
						+ "On this rental you earned <EM>3</EM> frequent renter points<P>",
				TestConstants.TEST_COSTUMER_TWO_RENTALS_HTML.htmlStatement());
	}
}
