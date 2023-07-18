Write a program to reverse elements in a array list



import java.util.*;
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		List<String> List1 = new ArrayList<String>();
		List1.add("A");
		List1.add("B");
		List1.add("C");
		List1.add("D");
		myCode(List1);
	}
	//EndOfMainMethod
	public static void myCode(List<String> list1) 
	{
		//write code here
		Collections.reverse(list1);
		System.out.println(list1);
	}
}


Output-
        [D, C, B, A]
