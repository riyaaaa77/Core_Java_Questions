package myMap;
import java.util.HashMap;
public class EmpHashMap {
			public static void main(String[] args) 
			{
				HashMap<Integer, String> emp = new HashMap<Integer, String>();
				
				emp.put(01,"Riya");
				emp.put(02,"Shivani");
				emp.put(03,"Anshuli");
				System.out.println(emp);
				
				HashMap<Integer, String> emp1 = new HashMap<Integer, String>();	
				emp1.put(04,"Ravi");
				emp1.put(05,"Rahul");
				emp1.put(06,"Sagar");
				System.out.println(emp1);

				HashMap<Integer, String> empFinal = new HashMap<Integer, String>();	
				empFinal.putAll(emp);
				empFinal.putAll(emp1);
				
				System.out.println(empFinal);
				System.out.println("is  emp empty :" + emp.isEmpty());
				System.out.println("size of emp :" + emp.size());
				System.out.println("is  emp1 empty :" + emp1.isEmpty());
				System.out.println("size of emp1 :" + emp1.size());
				System.out.println("is  empFinal empty :" + empFinal.isEmpty());
				System.out.println("size of empFinal :" + empFinal.size());

				emp.remove(2);
				emp1.remove(6);
				System.out.println(emp.containsValue("Riya"));

				System.out.println(emp.containsValue("Ravi"));

				System.out.println(emp1.containsKey(5));
				System.out.println(emp1.containsValue("Rahul"));
				emp.get(1);
				
				emp1.get(5);
				System.out.println("After operations");
				
				
				System.out.println("is  emp empty :" + emp.isEmpty());
				System.out.println("size of emp :" + emp.size());
				System.out.println(emp);
				System.out.println("is  emp1 empty :" + emp1.isEmpty());
				System.out.println("size of emp1 :" + emp1.size());
				System.out.println(emp1);
		
				System.out.println("is  empFinal empty :" + empFinal.isEmpty());
				System.out.println("size of empFinal :" + empFinal.size());
				System.out.println(empFinal);
				
				System.out.println("key set");
				emp.keySet();
				emp1.keySet();
				empFinal.keySet();

				System.out.println("value set");
				emp.values();
				emp1.values();
				empFinal.values();

				System.out.println("entry set");
				emp.entrySet();
				emp1.entrySet();
				empFinal.entrySet();
				
				empFinal.clear();
				System.out.println(empFinal);
				
			}
		}
