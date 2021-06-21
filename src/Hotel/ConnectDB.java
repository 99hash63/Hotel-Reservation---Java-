package Hotel;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
	
	private static String url = "jdbc:mysql://localhost:3306/hotel_reservation";
	private static String userName = "root";
	private static String password = "hash_99_HMDN";
	private static Connection con;

	public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(url, userName, password);
			
		}
		catch (Exception e) {
			System.out.println("Error!");
		}
		
		return con;
	}
}