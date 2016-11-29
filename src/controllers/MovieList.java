package controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import edu.princeton.cs.introcs.In;
import models.Movie;

public class MovieList 
{
	ArrayList<Movie> listOfMovie = new ArrayList<>(); //  //array list of terms form Movie class	
	Scanner inUsers;

	public MovieList() 
	{
		
	
	//public ArrayList<Movie> addMovie() throws FileNotFoundException//Exception // // Method of split of data in string and double
    File usersFile = new File("data_movieLens/users5.dat");
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
            System.out.println("UserID: "+userTokens[0]+",First Name:"+
                    userTokens[1]+",Surname:" + userTokens[2]+",Age:"+
                    Integer.parseInt(userTokens[3])+",Gender:"+userTokens[4]+",Occupation:"+
                    userTokens[5]);

        }else
        {
 //           throw new Exception("Invalid member length: "+userTokens.length);
        }
    }
	}
}
