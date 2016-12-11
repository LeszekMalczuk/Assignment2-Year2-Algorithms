package models;

import java.util.HashMap;
import java.util.Map;

import com.google.common.base.Objects;

import controllers.LikeMoviesAPI;

import com.google.common.base.MoreObjects.ToStringHelper;

public class Movie {
	
	public static long movieID;
	public String title;
	public String releaseData;
	public String url;
	public String video_date;
	
	public Map<Long, Movie> movieId1 = new HashMap<>();
	public long id;
	
	
//	public Movie() 
//	{	
//	}
	public Movie(String title2, int date, String url2) 
	{	
	}
	public Movie(long movieID, String title, String releaseData, String url) {
		// TODO Auto-generated constructor stub
		Movie.movieID = movieID; 
		this.title = title;
		this.releaseData = releaseData;
		this.url = url;
	}
	
	public String toString() 
	{
		return ToStringHelper(this).addValue(movieID)
									.addValue(title)
									.addValue(releaseData)
									.addValue(url)
									.toString();	
	}
	 @Override  
	  public int hashCode()  
	  {  
	     return Objects.hashCode( this.movieID, this.title, this.releaseData, this.url);  
	  }  
	private ToStringHelper ToStringHelper(Movie movie) {
		// TODO Auto-generated method stub
		return null;
	}
	public long getId() {
		return movieID;
	}
	public void setId(long id) {
		this.movieID = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getReleaseData() {
		return releaseData;
	}
	public void setReleaseData(String releaseData) {
		this.releaseData = releaseData;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
//addUser(firstName,lastName,age,gender,occupation)   66
//removeUser(userID)				/					123
//addMovie(title, year, url)		/					128
//addRating(userID, movieID, rating)	/
//getMovie(movieID)					/				174
//getUserRatings(userID)		/
//getUserRecommendations(userID)
//getTopTenMovies()
//load()	pop
//write()	push
















