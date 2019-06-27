import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalculateFrequencyOfWord 
{
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		Map<String, Integer> wordfrq=new HashMap<>();
		CalculateFrequencyOfWord cfw=new CalculateFrequencyOfWord(); 
		cfw.input(wordfrq);
		cfw.display(wordfrq);

	}
	public void input(Map<String,Integer> map)
	{
		System.out.println("Enter a sentence");
		String sentence=sc.nextLine();
		String[] word=sentence.split(" ");
		for(String words:word)
		{
			Integer freq=map.get(words);
			if(freq==null)
			{
				map.put(words, 1);
			}
			else
			{
				map.put(words, freq+1);
			}
		}
	}
	public void display(Map<String, Integer> map)
	{
		System.out.println(map);
	}

}
