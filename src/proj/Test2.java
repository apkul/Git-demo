package proj;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test2 {

	String browser;
	
	public static void main(String[] args) {
		
		Map<String, List<String>> mp = new HashMap<>();
		
		String[] str1 = {"Corolla", "Camry"};
		String[] str2 ={"Abcd", "xyz"};
		
		mp.put("Toyota", Arrays.asList(str1));
		mp.put("key1", Arrays.asList(str2));
		
		System.out.println(mp);
		
		
		//{{User1, pwd1},  {User2, pwd2}, ..}
		
		//Object[][] data
		
		Map<String, String> mp2 = new HashMap<>();
		
//		for(int i =0; i <data.length; i++){
//			mp2.put(data[i][0], data[i][1]);
//			
//		}
		
		Integer[] num = {1,2,3,4,5,6,2,3};
		
		Set<Integer> set = new HashSet<>(Arrays.asList(num));
		
		System.out.println(set);
		
		
		/*
		 * ID | User Name | Password | Name | Address
			1 | User_1 | Pwd123 |   “”  |   “"
ht

		 * 
		 * */
		
		
		Hashtable<String, String> ht = new Hashtable<>();
		
		ht.put("ID", "1");
		ht.put("User Name", "User_1");
		ht.put("Name", "");
		ht.put("Address", "");
		
		
		Enumeration en2 = ht.elements();
		System.out.println("en2.nextElement()");
		while(en2.hasMoreElements()){
			
			System.out.println(en2.nextElement());
		}
		
//		Enumeration en = ht.keys();
//		
//		while(en.hasMoreElements()){
//			String key = (String) en.nextElement();
//			//System.out.println(key);
//			
//			if(ht.get(key) == ""){
//				ht.remove(key);
//			}
//		}
		
		System.out.println(ht);
		
//		ht.replace("ID", "User Name");
		
		/* threadLocal
		 * multi threading
		 * testng listners
		 * HashTable iteration
		 * how do you handle concurrent modification exception
		 * Desired Capabilities
		 * 
		 * 
		 * 
		 * TestNG
		 * collections
		 * multi threading
		 * Selenium
		 * 
		 * 
		 * */
		
		
		Set entry = ht.entrySet();
		Iterator it = entry.iterator();
		
		
		while(it.hasNext()){
			it.next();
		}
		
		Set keys = ht.keySet();
		
		
		
		

	}
}
