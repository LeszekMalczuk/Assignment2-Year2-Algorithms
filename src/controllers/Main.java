package controllers;


	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.ObjectOutputStream;
	import java.util.Collection;

	import utils.Serializer;
	import utils.XMLSerializer;

	import com.thoughtworks.xstream.XStream;
	import com.thoughtworks.xstream.io.xml.DomDriver;

	import models.User;

	public class Main
	{
	  public static void main(String[] args) throws Exception
	  {    
	    File  datastore = new File("datastore.xml");
	    Serializer serializer = new XMLSerializer(datastore);
	    
	    LikeMoviesAPI likeMoviesAPI = new LikeMoviesAPI(serializer);
	    if (datastore.isFile())
	    {
	      likeMoviesAPI.load();
	    }
	    
	    likeMoviesAPI.createUser("Leonard", "Hernandes",  24, "M", "technician");
	    likeMoviesAPI.createUser("Melody", "Roberson", 53, "F", "other");
	    likeMoviesAPI.createUser("Gregory", "Newton", 23, "M", "writer");
	    likeMoviesAPI.createUser("Oliver", "George", 24, "M", "technician");
	    likeMoviesAPI.createUser("Jenna", "Parker",33, "F", "other");

	    Collection<User> users = likeMoviesAPI.getUsers();
	    System.out.println(users);
	    
//	    User homer = likeMoviesAPI.getUserByAge(0);
//	    likeMoviesAPI.createActivity(homer.id, "walk", "tramore", 1000);
	    
	    likeMoviesAPI.store(); 
	  }
	
	
	

}
