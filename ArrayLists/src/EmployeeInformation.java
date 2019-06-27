import java.util.ArrayList;
import java.util.Scanner;
/*This class input the employee informations and display it
*/public class EmployeeInformation 
{
  static Scanner sc=new Scanner(System.in);
  //this method take input from the user
  public void input(ArrayList<Employee> arr)
  {
	 System.out.println("Do you want to add the employees Y/N");
	 String ch=sc.next();
	 try {
		while(ch.equals("y") || ch.equals("Y"))
		 {
			 Employee e=new Employee();
			 System.out.println("Enter the Employee name");
			 String ename=sc.next();
			 e.setName(ename);
			 System.out.println("Enter the employee id");
			 double eid=sc.nextDouble();
			 e.setId(eid);
			 System.out.println("Enter the employee salary");
			 double esalary=sc.nextDouble();
			 e.setSalary(esalary);
			 arr.add(e);
			 System.out.println("Do u want to add more employee Y/N");
			 ch=sc.next();
		 }
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 finally
	 {
		 sc.close();
	 }
  }
  //This method display all the employe
  public void display(ArrayList<Employee> arr)
  {
	  System.out.println("All employee information");
	  for(Employee emp :arr)
	  {
		  System.out.println(emp.getName());
		  System.out.println(emp.getId());
		  System.out.println(emp.getSalary());
	  }
  }
}
