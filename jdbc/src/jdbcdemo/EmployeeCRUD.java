package jdbcdemo;

import java.util.*;

public class EmployeeCRUD {

	public static void main(String[] args)throws Exception {
		Employee e=new Employee();
		String city=null,firstName=null,lastName=null,contactno=null;
		int cid=0;;
		
		System.out.println("************** Global Tech Solutions **************");
		System.out.println("----------- Employee Management System ----------");
		while(true)
		{
		System.out.println("Press 1 for New Employee \t Press 2 to Display Employees");
		System.out.println("Press 3 for Update Employee \t Press 4 to Delete Employee");
		System.out.println("Press 5 for Exit"); 
			
		Scanner s=new Scanner(System.in);
		int option=s.nextInt();
		
		switch(option)
		{
		case 1: System.out.println("Enter Customer Name, City & Contact no :");
				// input 
		        Scanner s1=new Scanner(System.in);
		        System.out.println("Enter First name of employee :");
		        firstName=s1.next();
		        System.out.println("Enter Last name of employee :");
		        lastName=s1.next();
		        System.out.println("Enter city of employee :");
		        city=s1.next();
		        System.out.println("Enter phone number of employee :");
		        contactno=s1.next();
				e.insertEmployee(firstName,lastName,city,contactno);
				
				break;
				
		case 2: e.getEmployee();
				break;
				
		case 3: System.out.println("Enter Employee Id & City to be Updated:");
				Scanner s2=new Scanner(System.in);
				cid=s2.nextInt();
				city=s2.next();
				e.updateEmployee(cid,city);
				break;
				
		case 4: System.out.println("Enter Employee Id  to be Deleted:");
				//input
		        Scanner s3=new Scanner(System.in);
		        cid=s3.nextInt();
				e.deleteEmployee(cid);
				break;
		case 5: System.out.println("Application Terminated");
 				System.exit(0);

		default: System.out.println("Invalid Selection");
          break;
        }
		

	    }

	}

}
