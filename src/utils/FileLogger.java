package utils;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import javax.jws.soap.SOAPBinding.Use;

import controllers.LikeMoviesAPI;
import edu.princeton.cs.introcs.In;
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
		if (userTokens.length == 7) {
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
	//////////////
	  public static void main(String[] args) throws Exception
	  {    
	    File  datastore = new File("datastoreUsers1.xml");
	    Serializer serializer = new XMLSerializer(datastore);
	    
	    LikeMoviesAPI likeMoviesAPI = new LikeMoviesAPI(serializer);
	    if (datastore.isFile())
	    {
	      likeMoviesAPI.load();
	    }

//	  //  int String = 0;
//	//	likeMoviesAPI.createUser(args[userTocens[]], null, String, null, null);
//        likeMoviesAPI.createUser("Melody", "Roberson", 53, "F", "other");
//	    likeMoviesAPI.createUser("Gregory", "Newton", 23, "M", "writer");
//	    likeMoviesAPI.createUser("Oliver", "George", 24, "M", "technician");
//	    likeMoviesAPI.createUser("Jenna", "Parker",33, "F", "other");
//	    likeMoviesAPI.createUser( null, null, 0, null, null);
//	    
	    
	    
	    

	    Collection<User> users = likeMoviesAPI.getUsers();
	    System.out.println(users);
	    likeMoviesAPI.store(); 
	  }
	
	
	///////////////
	public static void moviesList(String[] args) throws Exception {
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
		if (userTokens.length == 7) {
			System.out.println("List of movie ID: "+userTokens[0]+",Movie Title:"+userTokens[1]+
					",Relase date:" + userTokens[2]+",IMBD Url:" + userTokens[3]+
					",Unknown:" + userTokens[4]+",Action:" + userTokens[5]+
					",Adventure:" + userTokens[6]+",Animation:" + userTokens[7]+
					",Children's:" + userTokens[8]+",Comedy:" + userTokens[9]+
					",Crime:" + userTokens[10]+",Documentary:" + userTokens[11]+
					",Drama:" + userTokens[12]+",Fantasy:" + userTokens[13]+
					",Film-Noir:" + userTokens[14]+",Horror:" + userTokens[15]+
					",Musical:" + userTokens[16]+",Mystery:" + userTokens[17]+
					",Romance:" + userTokens[18]+",Sci-Fi:" + userTokens[19]+
					",Thriller:" + userTokens[20]+",War:" + userTokens[21]+
					",Western:" + userTokens[22]);

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
}
