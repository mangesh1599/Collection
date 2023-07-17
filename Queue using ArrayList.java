Write a program to implement Queue using Array List



  

import java.util.*;
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		mystack m=new mystack();
		m.add(5);
		m.add(10);
		m.add(15);
		m.add(5);
		m.add(10);
		m.add(15);
		m.print();
		m.pop();
		m.pop();
		m.print();
	}
	//EndOfMainMethod
}
class mystack
{
	ArrayList<Integer> al=new ArrayList<Integer>();
	public void add(int data)
	{
		al.add(data);
	}
	public void print()
	{
		System.out.println(al);
	}
	public void pop()
	{
   		 if(al.size()>0)
		 {
			al.remove(0);
		 }
		else
		{
			System.out.println("Queue is empty");
		}
	}

}





Output-
        [5, 10, 15, 5, 10, 15]
        [15, 5, 10, 15]
