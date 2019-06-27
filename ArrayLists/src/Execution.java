import java.util.ArrayList;

public class Execution {
	public static void main(String[] args) {
		//here create a arraylist
		ArrayList<Employee> emp = new ArrayList<>();
		EmployeeInformation ei = new EmployeeInformation();
		//call the input method to input the employees
		ei.input(emp);
		//display the employees list
		ei.display(emp);
	}
}