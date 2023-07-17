Write a program to remove the third element from a array list



  import java.util.*;
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		List<String> List1 = new ArrayList<String>();
		List1.add("x");
		List1.add("y");
		List1.add("u");
		List1.add("a");
		int ele=2;
		myCode(List1,ele);
	}
	//EndOfMainMethod
	public static void myCode(List<String> list1,int ele) 
	{
		//write code here
		list1.remove(ele);
		System.out.println(list1);
	}
}


Output-
        [x, y, a]
