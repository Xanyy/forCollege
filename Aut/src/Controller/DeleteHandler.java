package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DeleteHandler {
	
	
	public static void removePlayer(Connection conn, String pName, String pEmail, int pGoals){

		if (conn != null){
			PreparedStatement removePlayer;
			try{
				removePlayer = conn.prepareCall("DELETE FROM player where FName = ? AND EMaill = ?");	
				removePlayer.setString(1,  pName);
				removePlayer.setString(2,  pEmail);
				removePlayer.setInt(3,  pGoals);
				int i= removePlayer.executeUpdate();

			}catch (SQLException e){
				e.printStackTrace();
			}
		}
	}

	
	public static void removeManager(Connection conn, String mName, int mRating){

		if (conn != null){
			PreparedStatement removeManager;
			try{
				removeManager = conn.prepareCall("DELETE FROM Manager where Manager= ?");	
				removeManager.setString(1,  mName);
				removeManager.setInt(2,  mRating);
				int i= removeManager.executeUpdate();

			}catch (SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	
	public static void removeTeam(Connection conn, String tName, String tManager, String tJersey){

		if (conn != null){
			PreparedStatement removeTeam;
			try{
				removeTeam = conn.prepareCall("DELETE FROM teacher where FName = ? AND EMaill = ?");	
				removeTeam.setString(1,  tName);
				removeTeam.setString(2,  tManager);
				removeTeam.setString(3,  tJersey);
				int i= removeTeam.executeUpdate();
				
			}catch (SQLException e){
				e.printStackTrace();
			}
		}
	}
}