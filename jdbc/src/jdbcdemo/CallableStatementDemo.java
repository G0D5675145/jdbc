package jdbcdemo;

import java.sql.*;
import java.util.*;
class skills
{
	Connection con;
    CallableStatement cstmt;
    ResultSet rs;
   
    
	public skills() throws Exception {
		con=ConnectionUtil.createConnection();
		
	}
	
	public void getSkills(int candidateId) throws Exception
	{
		cstmt=con.prepareCall("{ call get_candidate_skill(?) }");
		cstmt.setInt(1, candidateId);
		rs=cstmt.executeQuery();
		
		while (rs.next()) {
            System.out.println(String.format("%s - %s",
                    rs.getString("first_name") + " "
                    + rs.getString("last_name"),
                    rs.getString("skill")));
	}
		con.close();
    
	//getMyCandidateSkill()
}
}
public class CallableStatementDemo 
{

	public static void main(String[] args) {
		 int id;
		try
		{
		Scanner scan=new Scanner(System.in);
	    skills s= new skills();
		System.out.println("Enter Candidate Id :");
		id=scan.nextInt();
		
		s.getSkills(id);
		scan.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}


