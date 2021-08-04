package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollableDemo {

	public static void main(String[] args) {
		
		
		Connection con = null;
		Statement stmt;
		ResultSet rs;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","Aman@123");

			//create Scrollable ResultSet
			stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			rs = stmt.executeQuery("select * from skills");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2));
			}
			
			System.out.println("**********Display second record using relative**********");
            rs.relative(2);
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
            System.out.println("********************************************************");
            
            System.out.println("**********Display First record using first()**********");
            rs.first();
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
            System.out.println("********************************************************");
            
            rs.absolute(4);
            System.out.println("Current cursor position :"+rs.getRow());
            
            rs.last();
            System.out.println("Total number of records :"+rs.getRow());
		
			con.close();

		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
