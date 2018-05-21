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
	public void testCustomerStatementOneRental() {
		TestConstants.TEST_COSTUMER_ONE_RENTAL.addRental(TestConstants.TEST_RENTAL_1);
		System.out.println(TestConstants.TEST_COSTUMER_ONE_RENTAL.statement());
		assertEquals(
				"Rental Record for " + TestConstants.CUSTOMER_NAME + "\n" + "\t" + "Title" + "\t" + "\t" + "Days" + "\t"
						+ "Amount" + "\n" + "\t" + "Terminator 1" + "\t" + "\t" + 666 + "\t" + 0.0 + "\n"
						+ "Amount owed is " + 0.0 + "\n" + "You earned " + 1 + " frequent renter points",
				TestConstants.TEST_COSTUMER_ONE_RENTAL.statement());
	}

	@Test
	public void testCustomerStatementTwoRentals() {
		TestConstants.TEST_COSTUMER_TWO_RENTALS.addRental(TestConstants.TEST_RENTAL_1);
		TestConstants.TEST_COSTUMER_TWO_RENTALS.addRental(TestConstants.TEST_RENTAL_2);
		System.out.println(TestConstants.TEST_COSTUMER_TWO_RENTALS.statement());
		assertEquals(
				"Rental Record for " + TestConstants.CUSTOMER_NAME + "\n" + "\t" + "Title" + "\t" + "\t" + "Days" + "\t"
						+ "Amount" + "\n" + "\t" + "Terminator 1" + "\t" + "\t" + 666 + "\t" + 0.0 + "\n" + "\t"
						+ "Terminator 2" + "\t" + "\t" + 42 + "\t" + 0.0 + "\n" + "Amount owed is " + 0.0 + "\n"
						+ "You earned " + 2 + " frequent renter points",
				TestConstants.TEST_COSTUMER_TWO_RENTALS.statement());
	}
}
