package myCollection;

import java.util.ArrayList;
import java.util.LinkedList;

public class myLinkedList {
	public static void main(String [] args) 
	{
		LinkedList l = new LinkedList();
		l.add("hello");
		l.add(78);
		l.add("56737");
		l.add('2');
		l.add(true);
		l.add(6.88);
		
		System.out.println(l);
		//Homogenous linkdelist
		LinkedList<Integer> l1 = new LinkedList();
		l1.add(899);
		l1.add(89);
		l1.add(67);
		l1.add(56);
		//l1.add('a');
		//a1.add("866"); //CTE
		System.out.println(l1);
	}
}
