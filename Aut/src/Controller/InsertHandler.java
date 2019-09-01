
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertHandler {

	
	public static void savePlayer(Connection connection, String pFName,String pMName, String pLName, String pEmail,String pNumber,int pGoals) {

		if (connection != null) {  
			PreparedStatement savePlayer;
			try {
				savePlayer = connection.prepareCall("INSERT INTO oop.player( FName, MName, LName, EMaill, PHoneNumber, Goals ) VALUES(?,?,?,?,?,?)");
				savePlayer.setString(1, pFName);
				savePlayer.setString(2, pMName);
				savePlayer.setString(3, pLName);
				savePlayer.setString(4, pEmail);
				savePlayer.setString(5, pNumber);
				savePlayer.setInt(6, pGoals);
				int i = savePlayer.executeUpdate();

			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void saveManager(Connection connection, String mFName,String mMName, String mLName, String mEmail,String mNumber,int mRating) {

		if (connection != null) {  
			PreparedStatement saveManager;
			try {
				saveManager = connection.prepareCall("INSERT INTO oop.manager( FName, MName, LName, EMaill, PHoneNumber, StarRating) VALUES(?,?,?,?,?,?)");
				saveManager.setString(1, mFName);
				saveManager.setString(2, mMName);
				saveManager.setString(3, mLName);
				saveManager.setString(4, mEmail);
				saveManager.setString(5, mNumber);
				saveManager.setInt(6, mRating);
				int i = saveManager.executeUpdate();

			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void addTeam(Connection conn, String tManager, String tJersey, String tPlayer){

		if (conn != null){
			PreparedStatement addTeam;
			try {
				addTeam = conn.prepareCall("INSERT INTO oop.team() VALUES(?,?,?)");
				addTeam.setString(1,tManager);
				addTeam.setString(2, tJersey);
				addTeam.setString(3, tPlayer);
				int i = addTeam.executeUpdate();

			} 
			catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}

}

