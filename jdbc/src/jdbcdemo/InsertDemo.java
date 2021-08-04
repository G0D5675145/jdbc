package jdbcdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt;
		ResultSet rs;
		int count;
		
		try
		{
			con=ConnectionUtil.createConnection();
			
			String str="INSERT INTO skills(name) VALUES('Node')";//values('Maria Db') values('VB.Net')
			
			stmt=con.createStatement();
			
			count=stmt.executeUpdate(str); //return number of records affected
			
			if(count > 0)
			{
				System.out.println("Record inserted Successfully");
			}
			
			//count total number of records in table
			String str1="SELECT COUNT(id) FROM skills";
			rs=stmt.executeQuery(str1);
			int cnt=0;
			while(rs.next())
			{
				cnt=rs.getInt(1);
			}
			System.out.println("Total number of records is :"+cnt);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
