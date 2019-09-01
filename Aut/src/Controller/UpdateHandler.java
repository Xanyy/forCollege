
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// TODO: Auto-generated Javadoc
/**
 * The Class Update.
 */
public class UpdateHandler {

	/**
	 * Update player.
	 *
	 * @param conn the conn
	 * @param pGoals the p goals
	 */
	public static void updatePlayer(Connection conn, int pGoals) {

		if (conn != null){
			PreparedStatement updatePlayer;
			try {

				updatePlayer = conn.prepareCall(" Update player set goals  = ? ");
				updatePlayer.setInt(1, pGoals);
				int j = updatePlayer.executeUpdate();

			}catch (Exception io) {
				System.out.println("Error" +io);
			}
		}

	}
	
	/**
	 * Update manager.
	 *
	 * @param conn the conn
	 * @param mRating the m rating
	 */
	public static void updateManager(Connection conn, int mRating) {

		if (conn != null){
			PreparedStatement updateManager;
			try {

				updateManager = conn.prepareCall(" Update manager set rating  = ? ");
				updateManager.setInt(1, mRating);
				int j = updateManager.executeUpdate();

			}catch (Exception io) {
				System.out.println("Error" +io);
			}
		}

	}
}