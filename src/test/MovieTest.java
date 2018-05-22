package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import denny.Movie;

public class MovieTest {

	@Test
	public void testMovieName() {
		assertEquals("Terminator 1", TestConstants.TEST_MOVIE_1.getTitle());
		assertEquals("Terminator 2", TestConstants.TEST_MOVIE_2.getTitle());
	}

	@Test
	public void testMoviePrice() {
		assertEquals(Movie.CHILDRENS, TestConstants.TEST_MOVIE_1.getPriceCode());
		assertEquals(Movie.NEW_RELEASE, TestConstants.TEST_MOVIE_2.getPriceCode());
	}

	@Test
	public void testMovieNameFail() {
		assertNotEquals("Terminator 2", TestConstants.TEST_MOVIE_1.getTitle());
		assertNotEquals("Terminator 1", TestConstants.TEST_MOVIE_2.getTitle());
	}

	@Test
	public void testMoviePriceFail() {
		assertNotEquals(666, TestConstants.TEST_MOVIE_1.getPriceCode());
		assertNotEquals(42, TestConstants.TEST_MOVIE_2.getPriceCode());
	}

	@Test
	public void testMoviesFrequentrentPoints() {
		assertEquals(1, Movie.NEW_RELEASE);
		assertEquals(0, Movie.REGULAR);
		assertEquals(2, Movie.CHILDRENS);
	}
}
