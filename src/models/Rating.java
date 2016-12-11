package models;

import java.util.ArrayList;
import static com.google.common.base.MoreObjects.toStringHelper;

import java.util.List;

public class Rating {
	
	
	public long user_id;
	public long iteam_id;
	public int rating;
	
	public List<Rating> rete = new ArrayList<>();
	
	public Rating(long user_id, long iteam_id, int rating) 
	{
		this.user_id = user_id;
		this.iteam_id = iteam_id;
		this.rating = rating;
	
	}
	
	@Override
public String toString() {
	
	return toStringHelper(this).addValue("\n" + user_id)
								.addValue(iteam_id)
								.addValue(rating)
								.toString();
	
}
//	public Long getUser_id() {
//		return user_id;
//	}
//	public void setUser_id(Long user_id) {
//		this.user_id = user_id;
//	}
//	public Long getIteam_id() {
//		return iteam_id;
//	}
//	public void setIteam_id(Long iteam_id) {
//		this.iteam_id = iteam_id;
//	}
//	public int getRating() {
//		return rating;
//	}
//	public void setRating(int rating) {
//		this.rating = rating;


}

