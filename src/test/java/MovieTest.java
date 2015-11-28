

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.javaee7.movieplex7.entities.Movie;
import org.junit.Test;

public class MovieTest {

	public Movie testMovie;
	public Movie equalTestMovie;
	public Integer id =1;
	public String name = "The Matrix";
	public String actors = "Keanu Reeves, Laurence Fishburne, Carrie-Ann Moss";
	
	
	@Test
	public void testHashCode() {
		testMovie = new Movie(id);
		assertEquals(id.hashCode(), testMovie.hashCode());
	}

	@Test
	public void testMovie() {
		testMovie = new Movie();
		assertNull(testMovie.getId());
		assertNull(testMovie.getName());
		assertNull(testMovie.getActors());
	}

	@Test
	public void testMovieInteger() {
		testMovie = new Movie(id);
		assertNotNull(testMovie.getId());
		assertEquals(id, testMovie.getId());	
		assertNull(testMovie.getName());
		assertNull(testMovie.getActors());
	}

	@Test
	public void testMovieIntegerStringString() {
		testMovie = new Movie(id, name, actors);
		assertNotNull(testMovie.getId());
		assertNotNull(testMovie.getName());
		assertNotNull(testMovie.getActors());
		assertEquals(id, testMovie.getId());
		assertEquals(name, testMovie.getName());
		assertEquals(actors, testMovie.getActors());

	}


	@Test
	public void testEqualsObject() {
		testMovie = new Movie(id, name, actors);
		equalTestMovie = testMovie;
		assertTrue(testMovie.equals(equalTestMovie));
	}

	@Test
	public void testToString() {
		testMovie = new Movie();
		testMovie.setName(name);
		assertEquals("The Matrix", testMovie.toString());
	}

}
