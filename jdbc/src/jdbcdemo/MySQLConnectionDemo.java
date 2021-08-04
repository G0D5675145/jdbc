package jdbcdemo;
import java.sql.*;
public class MySQLConnectionDemo {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt;
		ResultSet rs;
		//load and register the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","Aman@123");
		
			//create statement object
			stmt=con.createStatement();
			
			//execute a query
			rs=stmt.executeQuery("select * from employees");
		
			//traverse your resultset
			while(rs.next())
			{ 
				System.out.println(rs.getInt(1)+" "+rs.getString(3)+" "+rs.getString("email")+" "+rs.getString(8));
			}
			//closing connection
					
		/*	System.out.println("Display specific record from db");
			rs.absolute(3);
			System.out.println(rs.getInt(1)+" "+rs.getString(3)+" "+rs.getString("email")+" "+rs.getString(8));
			*/
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
	}

}
