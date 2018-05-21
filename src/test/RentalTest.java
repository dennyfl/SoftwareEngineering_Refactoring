package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RentalTest {

	@Test
	public void testRental() {
		assertEquals(TestConstants.TEST_MOVIE_1, TestConstants.TEST_RENTAL_1.getMovie());
		assertEquals(666, TestConstants.TEST_RENTAL_1.getDaysRented());
		assertEquals(TestConstants.TEST_MOVIE_2, TestConstants.TEST_RENTAL_2.getMovie());
		assertEquals(42, TestConstants.TEST_RENTAL_2.getDaysRented());
	}
}
