package test;

import denny.Customer;
import denny.Movie;
import denny.Rental;

public class TestConstants {

	public static final String CUSTOMER_NAME = "TestUser";
	public static final Movie TEST_MOVIE_1 = new Movie("Terminator 1", Movie.CHILDRENS);
	public static final Movie TEST_MOVIE_2 = new Movie("Terminator 2", Movie.NEW_RELEASE);
	public static final Rental TEST_RENTAL_1 = new Rental(TEST_MOVIE_1, 666);
	public static final Rental TEST_RENTAL_2 = new Rental(TEST_MOVIE_2, 42);
	public static final Customer TEST_COSTUMER = new Customer(CUSTOMER_NAME);
	public static final Customer TEST_COSTUMER_ONE_RENTAL = new Customer(CUSTOMER_NAME);
	public static final Customer TEST_COSTUMER_TWO_RENTALS = new Customer(CUSTOMER_NAME);
	public static final Customer TEST_COSTUMER_ONE_RENTAL_HTML = new Customer(CUSTOMER_NAME);
	public static final Customer TEST_COSTUMER_TWO_RENTALS_HTML = new Customer(CUSTOMER_NAME);
}
