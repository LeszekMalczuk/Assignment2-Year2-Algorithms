package controllers;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import models.Movie;
import models.Rating;
import models.User;

//import controllers.PacemakerAPI;
//import models.User;
//
//import static models.Fixtures.users;
//import static models.Fixtures.activities;
//import static models.Fixtures.locations;
//import static org.junit.Assert.*;

import org.junit.Test;

public class LikeMoviesAPITest {
	private LikeMoviesAPI likeMoviesAPI = new LikeMoviesAPI();


	@Before
	public void setup()
	{
		likeMoviesAPI = new LikeMoviesAPI();

	}

	@After
	public void tearDown()
	{
		likeMoviesAPI = null;
	}

	@Test
	public void testAddUser()
	{
		assertEquals (0, likeMoviesAPI.getUsers().size());
		User user = likeMoviesAPI.addUser("Leonard", "Hernandes", 24, "M", "technician");
		assertEquals (1, likeMoviesAPI.getUsers().size());
		assertEquals(user, likeMoviesAPI.getUser(user.id));
	}  

	@Test
	public void testRemoveUsers()
	{
		assertEquals (0, likeMoviesAPI.getUsers().size());
		User user = likeMoviesAPI.addUser("Leonard", "Hernandes", 24, "M", "technician");
		assertEquals (1, likeMoviesAPI.getUsers().size());
		likeMoviesAPI.removeUser(user.id);
		assertEquals (0, likeMoviesAPI.getUsers().size());    
	}  

	@Test
	public void testAddMovie()
	{
		assertEquals (0, likeMoviesAPI.getMovies().size());
		Movie movie = likeMoviesAPI.addMovie("Stargate", "2013", "www.hamster.com");
		assertEquals (1, likeMoviesAPI.getMovies().size());
		assertEquals(movie, likeMoviesAPI.getMovie(movie.movieID));
	} 

	@Test
	public void testAddTating()
	{
		assertEquals (0, likeMoviesAPI.ratingMenu.size());
		Rating rating = new Rating(2L, 6L, 5);
		assertEquals (1, likeMoviesAPI.ratingMenu.size());
		assertEquals(rating , likeMoviesAPI.ratingMenu.get(0));
	}
	
	
}




