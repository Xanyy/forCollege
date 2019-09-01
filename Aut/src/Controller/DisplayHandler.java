
package Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class DisplayHandler {


	public static String showPlayers(Connection connection) {

		String details = "";
		try {

			Statement st = connection.createStatement();
			String qy = "Select * from players";
			ResultSet rs = st.executeQuery(qy);	

			while( rs.next()){ 
				details = details.concat( rs.getString(1)+" : "+rs.getString(2)+" "
						+rs.getString(3)+"  "+rs.getString(4)+" , "+rs.getString(5)+" , "
						+rs.getString(6)+" , "+"\n"); 
			}
			return details;


		}catch(Exception io) {

			System.out.println("Error" +io);
			return details;
		}


	}
	
	
	public static String showManagers(Connection connection) {

		String details = "";
		try {

			Statement st = connection.createStatement();
			String qy = "Select * from managers";
			ResultSet rs = st.executeQuery(qy);	

			while( rs.next()){ 
				details = details.concat( rs.getString(1)+" : "+rs.getString(2)+" "
						+rs.getString(3)+"  "+rs.getString(4)+" , "+rs.getString(5)+" , "
						+rs.getString(6)+" , "+"\n"); 
			}
			return details;


		}catch(Exception io) {

			System.out.println("Error" +io);
			return details;
		}

	}
	
	
	public static String showTeams(Connection connection) {

		String details = "";
		try {

			Statement st = connection.createStatement();
			String qy = "Select * from teams";
			ResultSet rs = st.executeQuery(qy);	

			while( rs.next()){ 
				details = details.concat( rs.getString(1)+" : "+rs.getString(2)+" "
						+rs.getString(3)+"  "+"\n"); 
			}
			return details;


		}catch(Exception io) {

			System.out.println("Error" +io);
			return details;
		}

	}
}