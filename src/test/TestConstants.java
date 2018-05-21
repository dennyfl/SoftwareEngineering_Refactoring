package test;

import denny.Customer;
import denny.Movie;
import denny.Rental;

public class TestConstants {

	public static final String CUSTOMER_NAME = "TestUser";
	public static final Movie TEST_MOVIE_1 = new Movie("Terminator 1", 4);
	public static final Movie TEST_MOVIE_2 = new Movie("Terminator 2", 5);
	public static final Rental TEST_RENTAL_1 = new Rental(TEST_MOVIE_1, 666);
	public static final Rental TEST_RENTAL_2 = new Rental(TEST_MOVIE_2, 42);
	public static final Customer TEST_COSTUMER = new Customer(CUSTOMER_NAME);
}
