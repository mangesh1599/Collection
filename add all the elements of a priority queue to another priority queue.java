Write a program to add all the elements of a priority queue to another priority queue




import java.util.*;
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();  
		pq1.add(36);
		pq1.add(25);
		pq1.add(26);
		pq1.add(70);
		pq1.add(46);
		pq1.add(10); 
		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(); 
		pq2.add(100);
		myCode(pq1,pq2);
	}
	//EndOfMainMethod
	public static void myCode(PriorityQueue<Integer> pq1,PriorityQueue<Integer> pq2) 
	{
		//write code here
		System.out.println(pq2);
		pq2.addAll(pq1);
		System.out.println(pq2);
	}
} 



Output-
          [100]
          [10, 25, 26, 100, 70, 46, 36]
