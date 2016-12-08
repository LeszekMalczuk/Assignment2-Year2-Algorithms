package models;

import java.util.HashMap;
import java.util.Map;

import com.google.common.base.Objects;

import controllers.LikeMoviesAPI;

import com.google.common.base.MoreObjects.ToStringHelper;

public class Movie {
	
	public long id;
	public String title;
	public String releaseData;
	public String url;
	
	
	public Map<Long, Movie> movieId1 = new HashMap<>();
	
	public Movie() 
	{	
	}
	public Movie(String title, String releaseData,String url, long id) {
		
		this.id = id; 
		this.title = title;
		this.releaseData = releaseData;
		this.url = url;
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String toString() 
	{
		return ToStringHelper(this).addValue(id)
									.addValue(title)
									.addValue(releaseData)
									.addValue(url)
									.toString();	
	}
	 @Override  
	  public int hashCode()  
	  {  
	     return Objects.hashCode( this.id, this.title, this.releaseData, this.url);  
	  }  
	private ToStringHelper ToStringHelper(Movie movie) {
		// TODO Auto-generated method stub
		return null;
	}

}
