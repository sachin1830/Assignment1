import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashmapFruit
{
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		Map<String, Integer> map=new HashMap<>();
		HashmapFruit hf=new HashmapFruit();
		hf.input(map);
		hf.display(map);
	}
	public void display(Map<String, Integer> map)
	{ 
	  Set<Map.Entry<String,Integer>> set=map.entrySet();
	  for(Map.Entry<String, Integer> it:set)
	  {
		  System.out.println("key : "+it.getKey()+  "value: "+it.getValue());
	  }
	}
	public void input(Map<String, Integer> map)
	{
	  System.out.println("do you want to add a pair Y/N");
	  String ch=sc.next();
	  while(ch.equals("y") || ch.equals("Y"))
	  {
		  System.out.println("Enter the key");
		  String key=sc.next();
		  System.out.println("Enter the value");
		  int val=sc.nextInt();
		  map.put(key,val);
		  System.out.println("Do you wnat to add more pair Y/N");
		  ch=sc.next();
	  }
	}
}
