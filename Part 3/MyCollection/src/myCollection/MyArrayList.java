package myCollection;
import java.util.ArrayList;
public class MyArrayList {
	
	public static void main(String [] args) {
		
		//Heterogeneous arraylist:
		ArrayList a = new ArrayList();
		System.out.println(a);
		a.add("89");
		a.add(89);
		a.add('a');
		a.add(7.899);
		a.add(8.33f);
		a.add(89);
		System.out.println(a);
		
		//Homogeneous arralist:
		ArrayList<Integer> a1 = new ArrayList();
		a1.add(899);
		a1.add(89);
		a1.add(67);
		//a1.add("866"); //CTE
		System.out.println(a1);
	}
}
