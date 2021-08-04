package jdbcdemo;

import java.sql.Connection;
import java.sql.Statement;



public class DeleteDemo {

	public static void main(String[] args) {
		
		Connection con;
        Statement stmt;
        int cnt=0;
        
        try {
        	
        	con = ConnectionUtil.createConnection();
        	/*String sql = "DELETE FROM candidates WHERE rtrim(last_name)"
        			+ " LIKE \'K%g\';";*/
        	String sql1 = "DELETE FROM candidates WHERE id=101"
        			+ " LIKE \'K%g\';";
        	
        	stmt = con.createStatement();
        	cnt=stmt.executeUpdate(sql1);
        	if(cnt>0) {
        		System.out.println(cnt+" Records deleted");
        	}
        	else {
        		System.out.println("Records not found");
        	}
        	
        	con.close();
        }catch(Exception e) {
        	
        	e.printStackTrace();
        }

		
	}

}