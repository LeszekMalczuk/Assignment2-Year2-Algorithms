package models;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.MoreObjects.ToStringHelper;

public class Rating {
	
	
	public Long user_id;
	public Long iteam_id;
	public int rating;
	
	public List<Rating> rete = new ArrayList<>();
	
	public Rating(Long user_id, Long iteam_id, Integer rating) 
	{
		this.user_id = user_id;
		this.iteam_id = iteam_id;
		this.rating = rating;
	
	}
	
	@Override
public String toString() {
	
	return toStringHelper(this).addValue(user_id)
								.addValue(iteam_id)
								.addValue(rating)
								.toString();
	
}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public Long getIteam_id() {
		return iteam_id;
	}
	public void setIteam_id(Long iteam_id) {
		this.iteam_id = iteam_id;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	private ToStringHelper toStringHelper(Rating rating2) {
		// TODO Auto-generated method stub
		return null;
	}

}

