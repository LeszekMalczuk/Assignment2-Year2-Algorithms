package controllers;



import java.util.Collection;
import com.google.common.base.Optional;

import java.util.HashMap;
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

	public Map<Long,   User>   userIndex       = new HashMap<>();
	public Map<String, User>   genderIndex      = new HashMap<>();
	


	@SuppressWarnings("unchecked")
	public LikeMoviesAPI()
	{
		HashMap<Long, User> User;

		{
			try {
				User = (HashMap<Long, models.User>) FileLogger.importUser();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	 }
	

	public LikeMoviesAPI(Serializer serializer)
	{
		this.serializer = serializer;
	}

	@SuppressWarnings("unchecked")
	public void load() throws Exception
	{
		serializer.read();
		
		userIndex       = (Map<Long, User>)     serializer.pop();
		genderIndex       = (Map<String, User>)     serializer.pop();
		
	}

	public void store() throws Exception
	{
		serializer.push(userIndex);
	
		serializer.push(genderIndex);
	
		serializer.write(); 
	}

	public Collection<User> getUsers ()
	{
		return userIndex.values();
	}


	public User addUser(String firstName, String lastName, int age, String gender, String ocupational) 
	{
		User user = new User (firstName, lastName, age, gender, ocupational);
		userIndex.put(user.id, user);
//		Map<Long, User> ageIndex;
	//	ageIndex.put(age, user);
		genderIndex.put(gender, user);
		return user;
	}
//
//	public User getUserByAge(int age) 
//	{
//		Map<Long, User> ageIndex = null;
//		return ageIndex.get(age);
//	}

	public User getUser(Long id) 
	{
		return userIndex.get(id);
	}
	public User getUserByGender(String gender) 
	{
		return userIndex.get(gender);
		
	}

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

	public void removeUser(Long id) {
		// TODO Auto-generated method stub
		userIndex.remove(id);
		return;
	}

	public void addMovie(String title, int date, String url) {
		// TODO Auto-generated method stub
		Movie movie = new Movie(title, date, url);
		Map<Long, User> movieIndex;
//		movieIndex.put(movie.getId(), movie);
		return;
	}


	public Serializer getSerializer() {
		return serializer;
	}

	public void setSerializer(Serializer serializer) {
		this.serializer = serializer;
	}

	public Map<Long, User> getUserIndex() {
		return userIndex;
	}

	public void setUserIndex(Map<Long, User> userIndex) {
		this.userIndex = userIndex;
	}

//	public Map<Integer, User> getAgeIndex() {
//		return ageIndex;
//	}
//
//	public void setAgeIndex(Map<Integer, User> ageIndex) {
//		this.ageIndex = ageIndex;
//	}

	public Map<String, User> getGenderIndex() {
		return genderIndex;
	}

	public void setGenderIndex(Map<String, User> genderIndex) {
		this.genderIndex = genderIndex;
	}

//	public Map<Long, Rating> getActivitiesIndex() {
//		return activitiesIndex;
//	}
//
//	public void setActivitiesIndex(Map<Long, Rating> activitiesIndex) {
//		this.activitiesIndex = activitiesIndex;
//	}

	public void getMovie(long movieID) {
		// TODO Auto-generated method stub
		// kod do przeszukiwania listy filmów po nazwie
//		int count = 1;
//		for (Term s : listOfTerms) 
//		{
//			if (s.termTerm.toLowerCase().startsWith(title))
//			{
//				return s.termTerm;  
//				//count--;
//			}
//		}
//		return null;
//		
//		// kod do pokazania sredniej oceny filmu
//	}
//
//	public void rateMovie(int rate) {//// nie potrzebne!!!!!!!!!!!!!
//										// kod do przeszukiwania po nunerach oceny filmu
//		if (inputterm != null) 
//		{
//			for (Term s : listOfTerms) 
//			{
//				if (s.termTerm.toLowerCase().equals(inputterm.toLowerCase()))
//				{
//					result =  s.weight;
//				}
//			}
//		}
//		else
//		{
//			return 0.0;
//		}
//		return result;
		
	}

	public Collection<Movie> getMovie() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addRating(int rate) {
		// TODO Auto-generated method stub
		
	}

	public void getUserRecomendation(long id) {
		// TODO Auto-generated method stub
		
	}

//	public void rateMovie(int rate) {
//		// TODO Auto-generated method stub
//		
//	}

}
