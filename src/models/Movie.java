package models;

import java.util.HashMap;
import java.util.Map;

import com.google.common.base.Objects;

import controllers.LikeMoviesAPI;

import static com.google.common.base.MoreObjects.toStringHelper;



public class Movie {
	public static Long   counter = 0L;

	public long movieID;
	public String title;
	public String releaseData;
	public String url;

	//	public Map<Long, Movie> movie = new HashMap<>();


	//	public Movie() 
	//	{	
	//	}
	public Movie() 
	{	
		this.movieID = ++counter;
	}
	public Movie(String title, String releaseData, String url) {
		// TODO Auto-generated constructor stub
		this.movieID = ++counter; 
		this.title = title;
		this.releaseData = releaseData;
		this.url = url;
	}
	@Override
	public String toString() 
	{
		return toStringHelper(this).addValue("\n" + movieID)
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
}
















