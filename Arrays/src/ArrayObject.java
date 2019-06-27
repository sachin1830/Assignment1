import java.util.Scanner;
public class ArrayObject 
{
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		ArrayObject ao=new ArrayObject();
		System.out.println("Enter the number of student");
		int size=sc.nextInt();
        Student arr[]=new Student[size];
        ao.input(arr);
        ao.display(arr);
	}
	public void input(Student[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
		  arr[i]= new Student();
		  System.out.println("Enter the name , age and cgpa of the student");
		  arr[i].name=sc.next();
		  arr[i].roll=sc.nextInt();
		  arr[i].cgpa=sc.nextDouble();
		}
	}
	public void display(Student[] arr)
	{
		System.out.println("All the student details are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].name+"\t"+arr[i].roll+"\t"+arr[i].cgpa);
		}
	}

}
