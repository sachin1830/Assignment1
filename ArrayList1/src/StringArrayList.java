import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*This class create a ArrayList and print the list using iterator
*/public class StringArrayList {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// here create the arraylist
		ArrayList<String> arr = new ArrayList<>();
		// here create the object of this class
		StringArrayList sal = new StringArrayList();
		sal.input(arr);
		sal.display(arr);

	}

	public void input(ArrayList arr) {
		System.out.println("Do you want to add element in the list");
		String ch = sc.next();
		// input element to the arraylist
		while (ch.equals("y") || ch.equals("Y")) {
			System.out.println("Enter the element in the list");
			String ele = sc.next();
			arr.add(ele);
			System.out.println("do you want to add more element in the list");
			ch = sc.next();
		}
	}

	public void display(ArrayList arr) {
		// display the elements using iterator
		System.out.println("The elements are:");
		Iterator<String> list = arr.iterator();
		while (list.hasNext()) {
			System.out.println(list.next());
		}
	}
}
