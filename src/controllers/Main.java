package controllers;


	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.ObjectOutputStream;
	import java.util.Collection;

	import utils.Serializer;
	import utils.XMLSerializer;

	import com.thoughtworks.xstream.XStream;
	import com.thoughtworks.xstream.io.xml.DomDriver;

import asg.cliche.Command;
import asg.cliche.Param;
import asg.cliche.Shell;
import asg.cliche.ShellFactory;
import models.User;

	public class Main
	{
		 public LikeMoviesAPI likeMovies;
		   
		   @Command(description="Add a new User")
		   public void addUser (@Param(name="firstname") String firstName, @Param(name="lastname") String lastName,
		  		 			  @Param(name="age") int age, @Param(name="gender") String gender, @Param(name="occupation") String occupation)
		   {
		  	 likeMovies.createUser(firstName, lastName, age, gender,  occupation);
		   }

		   
		   @Command(description="Delete a User")
		   public void removeUser (@Param(name="id") Long id)
		   {
			   likeMovies.removeUser(id);
		   }
		   
		   
		   @Command(description="Add a Movie")
		   public void addMovie (@Param(name="title") String title, @Param(name="date") int date, @Param(name="url") String url)
		   {
			   likeMovies.addMovie(title, date, url);
		   }


		   public static void main(String[] args) throws Exception
		   {
		   Main main = new Main();
		   Shell shell = ShellFactory.createConsoleShell("lm", "Welcome to Like Movie - ?help for instructions", main);
		   shell.commandLoop();
		   main.likeMovies.store();
		   }
		   
		  
	
	//  public static void main(String[] args) throws Exception
	//  {    
	    File  datastore = new File("datastoreUsers.xml");
	    Serializer serializer = new XMLSerializer(datastore);
	    
//	    LikeMoviesAPI likeMoviesAPI = new LikeMoviesAPI(serializer):
//	    if (datastore.isFile())
	    {
//	      likeMoviesAPI.load();
	    }
//	    
//	    likeMoviesAPI.createUser("Leonard", "Hernandes",  24, "M", "technician");
//	    likeMoviesAPI.createUser("Melody", "Roberson", 53, "F", "other");
//	    likeMoviesAPI.createUser("Gregory", "Newton", 23, "M", "writer");
//	    likeMoviesAPI.createUser("Oliver", "George", 24, "M", "technician");
//	    likeMoviesAPI.createUser("Jenna", "Parker",33, "F", "other");
//
//	    Collection<User> users = likeMoviesAPI.getUsers();
//	    System.out.println("\n" + users);
//	    System.out.println("ilosc uzytkownikow  " + users.size() );
//	    System.out.println("numer przypisany do u " + users.hashCode());
//
//	    
//	    User homer = likeMoviesAPI.getUserByAge(0);
//	    likeMoviesAPI.createActivity(homer.id, "walk", "tramore", 1000);
	    
//	    likeMoviesAPI.store(); 
	  
	}
	
	//////////////////////////////////////
	  
//	  package controllers;
//
//	  import java.util.ArrayList;
//	  import java.util.Collections;
//	  import java.util.Comparator;
//	  import java.util.HashMap;
//	  import java.util.List;
//	  import java.util.Map;
//	  import java.util.Set;
//
//	  import com.google.common.collect.Sets;
//
//	  import asg.cliche.Command;
//	  import asg.cliche.Param;
//	  import asg.cliche.Shell;
//	  import asg.cliche.ShellFactory;
//	  import average.rating;


	  /*
	   * @author alexandre Baizoukou WIT Bsc Applied Computing
	   * @version 1.0
	   * @author Eamon Delastar WIT Lecturer
	   * @author Franck Walsh WIT Lecturer
	   * @author Martin Harrigan Assistant Lecturer WIT 
	   * @author Cormen, Leiserson, Rivest, Stein, Introduction to Algorithms, MIT Press
	   * @author Fotakis. Course of Algorithms and Complexity at the National Technical University of Athens.
	   * @author Tim Roughgarden Coursera 
	   *  
	   *  This class is the user menu  
	   *  add user
	   *  delete user
	   *  add movie 
	   *  get movie detail
	   *  rate movie
	   *  get a user rating
	   *  get recommendation for any given user
	   *  give the list of top Ten Hottest Movies
	   *  read the movie data base from external file
	   *  save file in an XML file 
	   
	  */

//	  public class Main
//	  {
//	   public LikeMoviesAPI likeMovies;
//	   
//	   @Command(description="Add a new User")
//	   public void addUser (@Param(name="firstname") String firstname, @Param(name="lastname") String lastname,
//	  		 			  @Param(name="age") int age, @Param(name="gender") String gender, @Param(name="occupation") String occupation)
//	   {
//	  	 TenHotestMovie.addUser(firstname, lastname, gender, age,  occupation);
//	   }
//
//	   
//	   @Command(description="Delete a User")
//	   public void removeUser (@Param(name="id") Long id)
//	   {
//	  	 TenHotestMovie.removeUser(id);
//	   }
//	   
//	   
//	   @Command(description="Add a Movie")
//	   public void addMovie (@Param(name="title") String title, @Param(name="date") int date, @Param(name="url") String url)
//	   {
//	  	 TenHotestMovie.addMovie(title, date, url);
//	   }
//
//
//	   public static void main(String[] args) throws Exception
//	   {
//	   Main main = new Main();
//	   Shell shell = ShellFactory.createConsoleShell("lm", "Welcome to TenHotestMovie - ?help for instructions", main);
//	   shell.commandLoop();
//	   main.TenHotestMovie.store();
//	   }
//	   
//	  }

//}
