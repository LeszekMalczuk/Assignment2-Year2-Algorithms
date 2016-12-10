//package controllers;
//
//import static org.junit.Assert.*;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import controllers.PacemakerAPI;
//import models.User;
//
//import static models.Fixtures.users;
//import static models.Fixtures.activities;
//import static models.Fixtures.locations;
//import static org.junit.Assert.*;
//
//import org.junit.Test;
//
//public class LikeMoviesAPITest {
//	private LikeMoviesAPI likeMoviesAPI;
//
////////////////////
//	
//	
//	
//
//
//
//
//	  @Before
//	  public void setup()
//	  {
		  likeMoviesAPI = new LikeMoviesAPI();
	    for (User user : user)
	    {
	    	likeMoviesAPI.addUser(user.firstName, user.surname, user.age, user.gender, user.ocupational);
//	    }
//	  }
//
//	  @After
//	  public void tearDown()
//	  {
//		  likeMoviesAPI = null;
//	  }
//
//	  @Test
//	  public void testUser()
//	  {
//	   // assertEquals (user.length, likeMoviesAPI.getUsers().size());
//	    likeMoviesAPI.addUser("homer", "simpson", 0, "m", "other");
//	    assertEquals (user.length+1, likeMoviesAPI.getUsers().size());
//	    assertEquals (user[0], likeMoviesAPI.getUser(user[0].email));
//	  }  
//
//	  @Test
//	  public void testUsers()
//	  {
//	    assertEquals (user.length, likeMoviesAPI.getUsers().size());
//	    for (User user: user)
//	    {
//	      User eachUser = likeMoviesAPI.getUserByEmail(user.email);
//	      assertEquals (user, eachUser);
//	      assertNotSame(user, eachUser);
//	    }
//	  }
//
//	  @Test
//	  public void testDeleteUsers()
//	  {
//	    assertEquals (user.length, likeMoviesAPI.getUsers().size());
//	    User marge = likeMoviesAPI.getUserByAge("marge@simpson.com");
//	    likeMoviesAPI.deleteUser(marge.id);
//	    assertEquals (user.length-1, likeMoviesAPI.getUsers().size());    
//	  }  
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
//	}
//
//
//
}
