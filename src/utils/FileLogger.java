package utils;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import javax.jws.soap.SOAPBinding.Use;

import controllers.LikeMoviesAPI;
import edu.princeton.cs.introcs.In;
import models.Movie;
import models.User;

public class FileLogger {
	
		static ArrayList<User>usersMenu = new ArrayList<>();
		Scanner inUsers;
		LikeMoviesAPI  LikeMovieAPI;
	public static void users(String[] args, LikeMoviesAPI likeMoviesAPI) throws Exception 
	{
	File usersFile = new File("data/users5.dat");
	In inUsers = new In(usersFile);
	//each field is separated(delimited) by a '|'
	String delims = "[|]";
	while (!inUsers.isEmpty()) {
		// get user and rating from data source
		String userDetails = inUsers.readLine();

		// parse user details string
		String[] userTokens = userDetails.split(delims);

		// output user data to console.
		if (userTokens.length == 6) {
			User userList = new User();
			userList.id=Long.parseLong(userTokens[0]);
			userList.firstName=userTokens[1];
			userList.surname=userTokens[2];
			userList.age=Integer.parseInt(userTokens[3]);
			userList.gender=userTokens[4];
			userList.ocupational=userTokens[5];
			
			usersMenu.add(userList);
			
	
		}else
		{
			inUsers.close();
			throw new Exception("Invalid member length: "+userTokens.length);
		}

	    Collection<User> users = likeMoviesAPI.getUsers();
	    System.out.println(users);
	    likeMoviesAPI.store(); 
													//System.out.print(userTokens.toString());
	}
	inUsers.close();
}
	////////////////
	static ArrayList<Movie>movieMenu = new ArrayList<>();
	Scanner inMovie;
	public static void movie(String[] args, LikeMoviesAPI likeMoviesAPI) throws Exception 
	{
	File usersFile = new File("data/items5.dat");
	In inUsers = new In(usersFile);
	//each field is separated(delimited) by a '|'
	String delims = "[|]";
	while (!inUsers.isEmpty()) {
		// get user and rating from data source
		String userDetails = inUsers.readLine();

		// parse user details string
		String[] userTokens = userDetails.split(delims);

		// output user data to console.
		if (userTokens.length == 6) {
			Movie movieList = new Movie(0, userDetails, userDetails, userDetails);
			movieList.id=Long.parseLong(userTokens[0]);
			movieList.title=userTokens[1];
			movieList.releaseData=userTokens[2];
			movieList.video_date=userTokens[3];
			movieList.url=userTokens[4];
			
			movieMenu.add(movieList);
			
	
		}else
		{
			inUsers.close();
			throw new Exception("Invalid member length: "+userTokens.length);
		}

	    Collection<Movie> movies = likeMoviesAPI.getMovie();
	    System.out.println(movies);
	    likeMoviesAPI.store(); 
													//System.out.print(userTokens.toString());
	}
	inUsers.close();
}
	
	////////////////
	  public static void main(String[] args) throws Exception
	  {    
	    File  datastore = new File("datastoreUsers1.xml");
	    Serializer serializer = new XMLSerializer(datastore);
	    
	    LikeMoviesAPI likeMoviesAPI = new LikeMoviesAPI(serializer);
	    if (datastore.isFile())
	    {
	      likeMoviesAPI.load();
	    }

	    int String = 0;
	//	likeMoviesAPI.createUser(args[userTocens[]], null, String, null, null);
        likeMoviesAPI.addUser("Melody", "Roberson", 53, "F", "other");
	    likeMoviesAPI.addUser("Gregory", "Newton", 23, "M", "writer");
	    likeMoviesAPI.addUser("Oliver", "George", 24, "M", "technician");
	    likeMoviesAPI.addUser("Jenna", "Parker",33, "F", "other");
	    likeMoviesAPI.addUser( "Je", "Paker",333, "F", "dupa");
	    
	    
	    
	    

	    Collection<User> users = likeMoviesAPI.getUsers();
	    
	    System.out.println(users);
	    likeMoviesAPI.store(); 
	  }
	
	
	public static ArrayList<User> getUsersMenu() {
		return usersMenu;
	}
	public static void setUsersMenu(ArrayList<User> usersMenu) {
		FileLogger.usersMenu = usersMenu;
	}
	public Scanner getInUsers() {
		return inUsers;
	}
	public void setInUsers(Scanner inUsers) {
		this.inUsers = inUsers;
	}
	public LikeMoviesAPI getLikeMovieAPI() {
		return LikeMovieAPI;
	}
	public void setLikeMovieAPI(LikeMoviesAPI likeMovieAPI) {
		LikeMovieAPI = likeMovieAPI;
	}
	///////////////
	
	
	
	public static void genreList(String[] args) throws Exception {
	File usersFile = new File("data/genre.dat");
	In inUsers = new In(usersFile);
	//each field is separated(delimited) by a '|'
	String delims = "[|]";
	while (!inUsers.isEmpty()) {
		// get user and rating from data source
		String userDetails = inUsers.readLine();

		// parse user details string
		String[] userTokens = userDetails.split(delims);

		// output user data to console.
		if (userTokens.length == 2) {
			//System.out.println("Genre: "+userTokens[0]+",Number of Genre:"+userTokens[1]);
			
			User userList = new User();
			userList.gender=userTokens[0];
			userList.nogender=Integer.parseInt(userTokens[1]); // the nogender is a number in the list 
															   // at the gender

			usersMenu.add(userList);
			

		}else
		{
			inUsers.close();
			throw new Exception("Invalid member length: "+userTokens.length);
		}
	}
	inUsers.close();
}
	/////
	public static void ratingList(String[] args) throws Exception {
	File usersFile = new File("data/ratings5.dat");
	In inUsers = new In(usersFile);
	//each field is separated(delimited) by a '|'
	String delims = "[|]";
	while (!inUsers.isEmpty()) {
		// get user and rating from data source
		String userDetails = inUsers.readLine();

		// parse user details string
		String[] userTokens = userDetails.split(delims);

		// output user data to console.
		if (userTokens.length == 7) {
			System.out.println("UserID: "+userTokens[0]+",IteamID:"+
					userTokens[1]+",Rating:" + userTokens[2]+",Timestamp:"+
					Integer.parseInt(userTokens[3]));

		}else
		{
			inUsers.close();
			throw new Exception("Invalid member length: "+userTokens.length);
		}
	}
	inUsers.close();
}

	public static Object importUser() {
		// TODO Auto-generated method stub
		return null;
	}
}
