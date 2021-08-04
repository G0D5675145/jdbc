package jdbcdemo;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import java.sql.Connection;

class Candidates
{
	Connection con;
    PreparedStatement pstmt; // Accepts values at run time - pre compiled statements
    ResultSet rs;
    
    int cnt=0;
    int eid;
    String sqlUpdate;
    String lastname;
    Scanner s;
    
    public void getConnection() throws Exception
    {
    	con=ConnectionUtil.createConnection();
    }
    
    public void updateCandidate() throws Exception
    {
    	sqlUpdate="UPDATE candidates SET last_name = ? where id = ?";
    	
    	pstmt=con.prepareStatement(sqlUpdate);
    	
    	// prepare data for update
        s=new Scanner(System.in);
        System.out.println("enter Employee id:");
        eid=s.nextInt();
        System.out.println("enter employee's new last name :");
        lastname=s.next();

        // passing values to prepared statement using setter methods
        pstmt.setString(1, lastname);
        pstmt.setInt(2, eid);
        
        cnt=pstmt.executeUpdate();
        System.out.println(String.format("Row affected : %d", cnt));
        
     // reuse the prepared statement
        lastname = "Bush";
        eid = 101;
        pstmt.setString(1, lastname);
        pstmt.setInt(2, eid);

        cnt = pstmt.executeUpdate();
        System.out.println(String.format("Row affected %d", cnt));
        
        con.close();
        
    }
}
public class UpdateDemo {

	public static void main(String[] args) {
		Candidates c1=new Candidates();
		try
		{
			c1.getConnection();
			c1.updateCandidate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
