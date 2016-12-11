package utils;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import edu.princeton.cs.introcs.In;
import models.Movie;
import models.Rating;
import models.User;

public class FileLogger {

	Map<Long, User>usersMenu;// = new ArrayList<>();
	Map<Long, Movie>movieMenu;// = new ArrayList<>(); //for map is .put
	ArrayList<Rating>ratingMenu = new ArrayList<>(); // for list is .add

	public FileLogger()
	{}



	public Map<Long, User> loadUsers (String path) throws Exception
	{
		usersMenu = new HashMap<>();
		try 
		{
			File usersFile = new File(path);
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
					User user = new User();
					user.firstName=userTokens[1];
					user.surname=userTokens[2];
					user.age=Integer.parseInt(userTokens[3]);
					user.gender=userTokens[4];
					user.ocupational=userTokens[5];
					usersMenu.put(user.id, user);
				}
				else
				{
					inUsers.close();
					throw new Exception("Invalid member length: "+userTokens.length);
				}
			}
			inUsers.close();

		}
		catch (Exception e)
		{
			throw new Exception("Invalid member length: ");
		}
		return usersMenu;
	}

	/////////////////////
	public Map<Long, Movie> loadMovies(String path) throws Exception 
	{
		movieMenu = new HashMap<>();
		In inMovies;
		try {
			File moviesFile = new File(path);
			inMovies = new In(moviesFile);
			//each field is separated(delimited) by a '|'
			String delims = "[|]";
			while (!inMovies.isEmpty()) {
				// get user and rating from data source
				String movieDetails = inMovies.readLine();

				// parse user details string
				String[] movieTokens = movieDetails.split(delims);

				// output user data to console.
				if (movieTokens.length == 23) {
					Movie movie = new Movie();
					movie.title = movieTokens[1];
					movie.releaseData = movieTokens[2];
					movie.url = movieTokens[3];
//					System.out.println(movie);
					movieMenu.put(movie.movieID, movie);


				}else
				{
					throw new Exception("Invalid member length: ");
				}
			}
			inMovies.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return movieMenu;
	}

	////////////////

	public ArrayList<Rating> loadRatings(String path) throws Exception {

		ratingMenu = new ArrayList<>();
		In inRating;

		try {
			File ratingsFile = new File(path);
			inRating = new In (ratingsFile);
			//each field is separated(delimited) by a '|'
			String delims = "[|]";
			while (!inRating.isEmpty()) {
				// get user and rating from data source
				String ratingDetails = inRating.readLine();

				// parse user details string
				String[] ratingTokens = ratingDetails.split(delims);

				// output user data to console.
				if  (ratingTokens.length == 4) {

					long user_id = Long.parseLong(ratingTokens[0]);
					long iteam_id = Long.parseLong(ratingTokens[1]);
					int rating = Integer.parseInt(ratingTokens[2]);		

					Rating r = new Rating(user_id, iteam_id, rating); //user.age=Integer.parseInt(userTokens[3]);
					ratingMenu.add(r);
				}else
				{
					//	Rating.close();
					throw new Exception("Invalid member length: "+ratingTokens.length);
				}
			}
			inRating.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return ratingMenu;
	}
}
