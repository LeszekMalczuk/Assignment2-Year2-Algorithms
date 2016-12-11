package controllers;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import com.google.common.base.Optional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.omg.CORBA.PUBLIC_MEMBER;

import utils.FileLogger;
import utils.Serializer;
import models.Movie;
//	import models.Activity;
//	import models.Location;
import models.Rating;
import models.User;

public class LikeMoviesAPI 

{
	public Serializer serializer;
	FileLogger loader;

	public Map<Long,   User>   users       = new HashMap<>();
	public Map<Long, Movie>   movies      = new HashMap<>();
	ArrayList<Rating>ratingMenu = new ArrayList<>();

	public LikeMoviesAPI()
	{
	}



	public LikeMoviesAPI(Serializer serializer)
	{
		this.serializer = serializer;
	}


	public void prime() throws Exception
	{
		loader = new FileLogger();
		String userPath = "data/users5.dat";
		String moviePath = "data/items5.dat";
		String ratingPath = "data/ratings5.dat";

		users = loader.loadUsers(userPath);
		movies = loader.loadMovies(moviePath);
		ratingMenu = loader.loadRatings(ratingPath);
		store();

	}
	@SuppressWarnings("unchecked")
	public void load() throws Exception
	{
		serializer.read();
		ratingMenu = (ArrayList<Rating>) serializer.pop();
		movies       = (Map<Long, Movie>)     serializer.pop();
		users  = (Map<Long, User>)    serializer.pop();
		User.counter = (Long) serializer.pop();
		Movie.counter = (Long) serializer.pop(); //bug killer

	}

	public void store() throws Exception
	{
		serializer.push(Movie.counter);
		serializer.push(User.counter);
		serializer.push(users);
		serializer.push(movies);
		serializer.push(ratingMenu);
		serializer.write(); 
	}

	public User addUser(String firstName, String lastName, int age, String gender, String ocupational) 
	{
		User user = new User (firstName, lastName, age, gender, ocupational);
		users.put(user.id, user);
		System.out.println(users.size());
		System.out.println(users);
		return user; 
	}

	public void removeUser(Long id) {
		users.remove(id);
		System.out.println(users.size());
		System.out.println(users);
	}

	public Movie addMovie(String title, String releaseData, String url)
	{
		System.out.println(title + releaseData + url);
		Movie movie = new Movie(title, releaseData, url);
		movies.put(movie.movieID, movie);
		System.out.println(movies);
		return movie;
	}
	public Rating addRating(long user_id, long iteam_id, int  rating) 
	{
		Rating r = new Rating (user_id, iteam_id, rating);
		ratingMenu.add(r);
		//System.out.println(users.size());
		System.out.println(ratingMenu);
		return r;
	}

	public User getUser(long userid) 
	{

		//System.out.println(users);
		return users.get(userid);
	}

	public Movie getMovie(long movieId)
	{ 

		Movie movie = movies.get(movieId);
		System.out.println(movie);
		return movie;

	}

	public Map<Long, User> getUsers() {
		return users;
	}

	public Map<Long, Movie> getMovies() {
		return movies;
	}
	//	public User getUserByGender(String gender) 
	//	{
	//		return id.get(gender);
	//		
	//	}

	//	public void deleteUser(Long id) 
	//	{
	//		User user = userIndex.remove(id);
	//		ageIndex.remove(user.age);
	//	}

	//	public Rating createActivity(Long user_id, Long iteam_id, Integer rating)
	//	{
	//		Rating rating = null;
	//		Optional<User> user = Optional.fromNullable(userIndex.get(user_id));
	//		if (user.isPresent())
	//		{
	//			rating = new Rating (user_id, iteam_id, rating_of);
	//			user.get().rating.put(rating.id, rating);
	//			activitiesIndex.put(rating.id, rating);
	//		}
	//		return rating;
	//	}

	//	public Rating getRating (Long id)
	//	{
	//		return activitiesIndex.get(id);
	//	}

	//	public void addLocation (Long id, float latitude, float longitude)
	//	{
	//		Optional<Rating> rating = Optional.fromNullable(activitiesIndex.get(id));
	//		if (rating.isPresent())
	//		{
	//			rating.get().route.add(new Location(latitude, longitude));
	//		}
	//	}


	//
	//
	//	public Serializer getSerializer() {
	//		return serializer;
	//	}
	//
	//	public void setSerializer(Serializer serializer) {
	//		this.serializer = serializer;
	//	}
	//
	//	public Map<Long, User> getUserIndex() {
	//		return id;
	//	}
	//
	//	public void setUserIndex(Map<Long, User> userIndex) {
	//		this.id = userIndex;
	//	}
	//
	//
	//
	//	public ArrayList<Movie> getMovie(long movieID) {
	//		// TODO Auto-generated method stub
	//		// kod do przeszukiwania listy filmów po nazwie
	////		int count = 1;
	////		for (Term s : listOfTerms) 
	////		{
	////			if (s.termTerm.toLowerCase().startsWith(title))
	////			{
	////				return s.termTerm;  
	////				//count--;
	////			}
	////		}
	////		return null;
	////		
	////		// kod do pokazania sredniej oceny filmu
	////	}
	////
	////	public void rateMovie(int rate) {//// nie potrzebne!!!!!!!!!!!!!
	////										// kod do przeszukiwania po nunerach oceny filmu
	////		if (inputterm != null) 
	////		{
	////			for (Term s : listOfTerms) 
	////			{
	////				if (s.termTerm.toLowerCase().equals(inputterm.toLowerCase()))
	////				{
	////					result =  s.weight;
	////				}
	////			}
	////		}
	////		else
	////		{
	////			return 0.0;
	////		}
	////		return result;
	//		
	//		int n = 10;
	//		List<Movie> movies = new ArrayList<Movie>();
	//	//	Collections.sort((List<Movie>) movies);
	//		n = (n > movies.size()) ? movies.size() : n;
	//		return new ArrayList<Movie>(movies.subList(0, n));
	//		
	//		
	//		
	//		
	//	}
	//
	//	public Collection<Movie> getMovie() {
	//		// TODO Auto-generated method stub
	//		return null;
	//	}
	//
	//	public void addRating(int rate) {
	//		// TODO Auto-generated method stub
	//		
	//	}
	//
	//	public void getUserRecomendation(long id) {
	//		// TODO Auto-generated method stub
	//		
	//	}

}
