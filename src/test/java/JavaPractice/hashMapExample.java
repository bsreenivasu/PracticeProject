package JavaPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapExample {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,	String>();
		hm.put(0,"Hello");
		hm.put(1, "GoodBye");
		hm.put(2,"Morning");
		
		System.out.println(hm.get(1));
		    Set sn = hm.entrySet();
		    
		    Iterator it = sn.iterator();
		    while(it.hasNext()) {
		    	
		 Map.Entry mp =   	(Map.Entry)it.next();    		
		 System.out.println("Get the Key value =" + mp.getKey());
		 System.out.println("Get the Value is  + " + mp.getValue());
		    }
		    
		

	}

}
