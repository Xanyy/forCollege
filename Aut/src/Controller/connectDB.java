
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class connectDB {

	public static void main(String[] args) {
		String Server="";
		String port="49709";
		String user="Craig";
		String password="1234";
		String database="OOP";
		String jdbcurl;
		connectDB con=null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		jdbcurl = "jdbc:sqlserver://" + Server + ":" + port + ",user=" + user + ";password=" + ";databasename=" + database + "";
		try {
			con=(connectDB) DriverManager.getConnection(jdbcurl);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			PreparedStatement pst=((java.sql.Connection) con).prepareStatement("select + from users");
			ResultSet rs=pst.executeQuery();
			
			while(rs.next()) {
				System.out.print("ID= "+rs.getInt("ID")+"users= "+rs.getString("Name"));
			}
			
		} catch (SQLException e) {
			
		}
			
	}

	
	
	
}