package models;

import static com.google.common.base.MoreObjects.toStringHelper;

import java.util.HashMap;
import java.util.Map;

import com.google.common.base.Objects;
public class User {

	  static Long   counter = 0l;

	  public Long   id;
	  public String firstName;
	  public String surname;
	  public int age;
	  public String gender;
	  public String ocupational;
	  
	  public Map<Long, Rating> activities = new HashMap<>();
	  
	  public User()
	  {
	  }
	  
	  public User(String firstName, String surname, int age, String gender, String ocupational)
	  {
	    this.id        = counter++;
	    this.firstName = firstName;
	    this.surname = surname;
	    this.age = age;
	    this.gender = gender;
	    this.ocupational = ocupational;
	  }
	  
	  public String toString()
	  {
	    return toStringHelper(this).addValue(id)
	    		                   .addValue(firstName)
	                               .addValue(surname)
	                               .addValue(age)
	                               .addValue(gender) 
	                               .addValue(ocupational)
	                               .toString();
	  }
	  
	  @Override  
	  public int hashCode()  
	  {  
	     return Objects.hashCode( this.firstName, this.surname, this.age, this.gender, this.ocupational);  
	  }  
	  
	  @Override
	  public boolean equals(final Object obj)
	  {
	    if (obj instanceof User)
	    {
	      final User other = (User) obj;
	      return Objects.equal(firstName, other.firstName) 
	          && Objects.equal(surname,  other.surname)
	          && Objects.equal(age,     other.age)
	          && Objects.equal(gender,  other.gender)
	          && Objects.equal(ocupational, other.ocupational);
	    }
	    else
	    {
	      return false;
	    }
	  }

}
