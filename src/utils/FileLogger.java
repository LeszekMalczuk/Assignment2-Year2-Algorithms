package utils;

import java.io.File;

import edu.princeton.cs.introcs.In;

public class FileLogger {
	
	public static void users(String[] args) throws Exception {
	File usersFile = new File("data/genre.dat, data/items.dat, data/occupation.dat, data/ratings5.dat, data/users5.dat");
	In inUsers = new In(usersFile);
	//each field is separated(delimited) by a '|'
	String delims = "[|]";
	while (!inUsers.isEmpty()) {
		// get user and rating from data source
		String userDetails = inUsers.readLine();

		// parse user details string
		String[] userTokens = userDetails.split(delims);

		// output user data to console.
		if (userTokens.length == 7) {
			System.out.println("UserID: "+userTokens[0]+",First Name:"+
					userTokens[1]+",Surname:" + userTokens[2]+",Age:"+
					Integer.parseInt(userTokens[3])+",Gender:"+userTokens[4]+",Occupation:"+
					userTokens[5]+",zipp code:"+userTokens[6]);

		}else
		{
			inUsers.close();
			throw new Exception("Invalid member length: "+userTokens.length);
		}
	}
	inUsers.close();
}
	///////////////
	public static void moviesList(String[] args) throws Exception {
	File usersFile = new File("data/items5.dat");
	In inUsers = new In(usersFile);
	//each field is separated(delimited) by a '|'
	String delims = "[|]";
	while (!inUsers.isEmpty()) {
		// get user and rating from data source
		String userDetails = inUsers.readLine();

		// parse user details string
		String[] userTokens = userDetails.split(delims);

		// output user data to console.
		if (userTokens.length == 7) {
			System.out.println("List of movie ID: "+userTokens[0]+",Movie Title:"+userTokens[1]+
					",Relase date:" + userTokens[2]+",IMBD Url:" + userTokens[3]+
					",Unknown:" + userTokens[4]+",Action:" + userTokens[5]+
					",Adventure:" + userTokens[6]+",Animation:" + userTokens[7]+
					",Children's:" + userTokens[8]+",Comedy:" + userTokens[9]+
					",Crime:" + userTokens[10]+",Documentary:" + userTokens[11]+
					",Drama:" + userTokens[12]+",Fantasy:" + userTokens[13]+
					",Film-Noir:" + userTokens[14]+",Horror:" + userTokens[15]+
					",Musical:" + userTokens[16]+",Mystery:" + userTokens[17]+
					",Romance:" + userTokens[18]+",Sci-Fi:" + userTokens[19]+
					",Thriller:" + userTokens[20]+",War:" + userTokens[21]+
					",Western:" + userTokens[22]);

		}else
		{
			inUsers.close();
			throw new Exception("Invalid member length: "+userTokens.length);
		}
	}
	inUsers.close();
}
	/////
	public static void users(String[] args) throws Exception {
	File usersFile = new File("data/genre.dat, data/items.dat, data/occupation.dat, data/ratings5.dat, data/users5.dat");
	In inUsers = new In(usersFile);
	//each field is separated(delimited) by a '|'
	String delims = "[|]";
	while (!inUsers.isEmpty()) {
		// get user and rating from data source
		String userDetails = inUsers.readLine();

		// parse user details string
		String[] userTokens = userDetails.split(delims);

		// output user data to console.
		if (userTokens.length == 7) {
			System.out.println("UserID: "+userTokens[0]+",First Name:"+
					userTokens[1]+",Surname:" + userTokens[2]+",Age:"+
					Integer.parseInt(userTokens[3])+",Gender:"+userTokens[4]+",Occupation:"+
					userTokens[5]+",zipp code:"+userTokens[6]);

		}else
		{
			inUsers.close();
			throw new Exception("Invalid member length: "+userTokens.length);
		}
	}
	inUsers.close();
}
}
