Write a program to remove and return the first element of a linked list.




import java.util.*;
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		LinkedList<Integer> list1=new LinkedList<Integer>();
		list1.add(4);
		list1.add(6);
		list1.add(3);
		list1.add(9);
		list1.add(7);
		myCode(list1);
	}
	//EndOfMainMethod
	public static void myCode(LinkedList<Integer> list1) 
	{
		//write code here
		int b=list1.pollFirst();
		System.out.println(b);
		System.out.println(list1);
	}
}



Output-
        4
        [6, 3, 9, 7]
