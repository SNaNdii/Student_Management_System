package DButil;

import java.sql.Connection;
import java.sql.DriverManager;

public class Utility {
		
	public static Connection provideConnection() {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/Student";
		
		try {
			conn = DriverManager.getConnection(url, "root", "Nandi@278961");
			
		} 
		catch (Exception e) {
			// TODO: handle exception
		}
		
		return conn;
		
	}
}
