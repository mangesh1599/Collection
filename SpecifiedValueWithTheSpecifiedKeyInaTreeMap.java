Write a program to associate the specified value with the specified key in a Tree Map




import java.util.*;
public class MyClass 
{
	//private static Set<Entry<Integer, String>> entrySet;
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		HashMap<Integer,String> map = new HashMap <Integer,String> ();
		map.put(1, "Red");
		map.put(2, "Green");
		map.put(3, "xyz");
		map.put(4, "White");
		map.put(5, "abc");
		myCode(map);
	}
	//EndOfMainMethod
	public static void myCode(HashMap<Integer,String> map) 
	{
		//write code here
		for(Map.Entry<Integer,String>entry : map.entrySet())
		{
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
	}
}



Output-
        1=Red
        2=Green
        3=xyz
        4=White
        5=abc
