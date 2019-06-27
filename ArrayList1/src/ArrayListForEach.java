import java.util.ArrayList;
import java.util.Scanner;
/*In this class we create a arraylist and display the element using Foreach loop
*/public class ArrayListForEach 
{
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		//create the arraylist
		ArrayList< String>list=new ArrayList<>();
		ArrayListForEach alf=new ArrayListForEach();
        alf.input(list);
        alf.display(list);
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
    public void display(ArrayList arr)
    {
    	//here display the element using for each loop
    	System.out.println("The element are:");
    	arr.forEach((temp)->{
    		System.out.println(temp);
    	});
    }
}
