Write a program to clone a tree set list to another tree set


  
import java.util.*;
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(8);
		set.add(62);
		set.add(12);
		set.add(4);
		set.add(6);
		TreeSet<Integer> ts=new TreeSet<Integer>();  
		myCode(set,ts);
	}
	//EndOfMainMethod
	@SuppressWarnings("unchecked")
	public static void myCode(TreeSet<Integer> set,TreeSet<Integer> ts) 
	{
		//write code here
		ts=(TreeSet)set.clone();
		System.out.println(ts);
	}
}



Output-
        [4, 6, 8, 12, 62]

