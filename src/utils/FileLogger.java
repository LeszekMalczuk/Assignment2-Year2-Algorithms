package utils;

import java.io.File;

import edu.princeton.cs.introcs.In;

public class FileLogger {
	
	public static void name(String[] args) throws Exception {
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
					userTokens[5]);

		}else
		{
			inUsers.close();
			throw new Exception("Invalid member length: "+userTokens.length);
		}
	}
	inUsers.close();
}
}
