package controllers;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import models.Movie;
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
	//	  
	//	  @Test
	//	  public void testAddActivity()
	//	  {
	//	    User marge = likeMoviesAPI.getUserByAge("marge@simpson.com");
	//	    Activity activity = likeMoviesAPI.createActivity(marge.id, activities[0].type, activities[0].location, activities[0].distance);
	//	    Activity returnedActivity = likeMoviesAPI.getActivity(activity.id);
	//	    assertEquals(activities[0],  returnedActivity);
	//	    assertNotSame(activities[0], returnedActivity);
	//	  }
	//	  
	//	  @Test
	//	  public void testAddActivityWithSingleLocation() 
	//	  {
	//	    User marge = likeMoviesAPI.getUserByAge("33");
	//	    Long activityId = likeMoviesAPI.createActivity(marge.id, activities[0].type, activities[0].location, activities[0].distance).id;
	//
	//	    likeMoviesAPI.addLocation(activityId, locations[0].latitude, locations[0].longitude);
	//
	//	    Activity activity = likeMoviesAPI.getActivity(activityId);
	//	    assertEquals (1, activity.route.size());
	//	    assertEquals(0.0001, locations[0].latitude,  activity.route.get(0).latitude);
	//	    assertEquals(0.0001, locations[0].longitude, activity.route.get(0).longitude);   
	//	  }
	//	  
	//	  @Test
	//	  public void testAddActivityWithMultipleLocation()
	//	  {
	//	    User marge = likeMoviesAPI.getUserByAge("marge@simpson.com");
	//	    Long activityId = likeMoviesAPI.createActivity(marge.id, activities[0].type, activities[0].location, activities[0].distance).id;
	//
	//	    for (Location location : locations)
	//	    {
	//	      likeMoviesAPI.addLocation(activityId, location.latitude, location.longitude);      
	//	    }
	//
	//	    Activity activity = likeMoviesAPI.getActivity(activityId);
	//	    assertEquals (locations.length, activity.route.size());
	//	    int i = 0;
	//	    for (Location location : activity.route)
	//	    {
	//	      assertEquals(location, locations[i]);
	//	      i++;
	//	    }
	//	  } 
}




