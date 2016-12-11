package models;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import models.Movie;


public class MovieTest {

	Movie film = new Movie("Toy Story (1995)", "01-Jan-1995" , "http://us.imdb.com");


	@Test
	public void testCreate()
	{
		assertEquals (1L,            			 film.movieID);
		assertEquals ("Toy Story (1995)",        film.title);
		assertEquals ("01-Jan-1995",  			 film.releaseData);   
		assertEquals ("http://us.imdb.com",      film.url);

	}

//	@Test
//	public void testToString()
//	{
//		assertEquals ("Movie{" + film.movieID + film.title + film.releaseData + film.url+ "}", film.toString());
//	}


}
