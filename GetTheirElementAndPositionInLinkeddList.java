Write a program to display the elements and their positions in a linked list




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
		for(int i=0;i<list1.size();i++)
		{
			System.out.println("Element at index "+i+": "+list1.get(i));
		}
	}
}



Output-
        Element at index 0: 4
        Element at index 1: 6
        Element at index 2: 3
        Element at index 3: 9
        Element at index 4: 7
