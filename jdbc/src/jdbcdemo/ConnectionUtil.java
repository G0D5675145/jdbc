package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionUtil {

	public static Connection createConnection() throws Exception {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","Aman@123");
			return con;
	}

}
