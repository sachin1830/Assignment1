import java.util.ArrayList;
import java.util.Scanner;
/*In this class we create a object and display using Advance for loop
*/public class AdvaceLoopArraylist 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		//here create a arraylist
		ArrayList<String>list=new ArrayList<>();
		AdvaceLoopArraylist ala=new AdvaceLoopArraylist();
		//here call the input method for input the  element to the arraylist
        ala.input(list);
        //here call the display method for display the element
        ala.display(list);
	}
	public void input(ArrayList arr)
	{
		System.out.println("Do you want to add element in the list");
		String ch = sc.next();
		// input element to the arraylist
		while (ch.equals("y") || ch.equals("Y")) 
		{
			System.out.println("Enter the element in the list");
			String ele = sc.next();
			arr.add(ele);
			System.out.println("do you want to add more element in the list");
			ch = sc.next();
		}
	}
	public void  display(ArrayList<String> arr)
	{
		//here display the element using advance for loop
	  System.out.println("The elements are:");
	  for(String temp: arr)
	  {
		  System.out.println(temp);
	  }
	}

}
