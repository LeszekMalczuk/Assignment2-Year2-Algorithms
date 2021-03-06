package models;

import static com.google.common.base.MoreObjects.toStringHelper;

import java.util.HashMap;
import java.util.Map;

import com.google.common.base.Objects;
public class User {

	public static Long   counter = 0L;

	public long   id;
	public String firstName;
	public String surname;
	public int age;
	public String gender;
	public String ocupational;

	public Map<Long, User> rating = new HashMap<>();

//	public int nogender;


	public User() 
	{
		this.id        = ++counter;
	}

	public User(String firstName, String surname, int age, String gender, String ocupational)
	{
		this.id        = ++counter;
		this.firstName = firstName;
		this.surname = surname;
		this.age = age;
		this.gender = gender;
		this.ocupational = ocupational;
	}
	@Override
	public String toString()
	{
		return toStringHelper(this).addValue("\n" + id)
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
	public static Long getCounter() {
		return counter;
	}

	public static void setCounter(Long counter) {
		User.counter = counter;
	}

	public Long getId() {
		return id;
	}

//	public void setId(Long id) {
//		User.id = id;
//	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getOcupational() {
		return ocupational;
	}

	public void setOcupational(String ocupational) {
		this.ocupational = ocupational;
	}


}
