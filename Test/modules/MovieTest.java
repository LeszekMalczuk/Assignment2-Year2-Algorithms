package modules;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import models.Movie;


public class MovieTest {

	 Movie film = new Movie(1, "Toy Story (1995)", "01-Jan-1995" , "http://us.imdb.com");
	 
	
	  @Test
	  public void testCreate()
	  {
	    assertEquals (1,            			 Movie.movieID);
	    assertEquals ("Toy Story (1995)",        film.title);
	    assertEquals ("01-Jan-1995",  			 film.releaseData);   
	    assertEquals ("http://us.imdb.com",      film.url);

	  }

	  @Test
	  public void testIds()
	  {
	    Set<Long> ids = new HashSet<>();
	  //  Object users;
		//for (User user : users)
	    {
	      ids.add(Movie.movieID);
	    }
	   // assertEquals (Movie.length, ids.size());
	  }

	  @Test
	  public void testToString()
	  {
		 
	    assertEquals ("Movie{" + Movie.movieID + "Toy Story (1995), 01-Jan-1995,  http://us.imdb.com", toString().toString());
	  }
	  
	
}
