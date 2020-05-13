package JavaPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.apache.log4j.net.SyslogAppender;

public class arrayList2 {

	private static final Collection String = null;

	public static void main(String[] args) {
//		ArrayList<String>  ar = new ArrayList<String>();
//		ar.add("Sreenivas");
//		ar.add("Sreedevi");
//		ar.add("Parthiv");
//		ar.add("Chakrika");
//	
//	System.out.println("All Elements in this array is; " + ar);
//	System.out.println(ar.get(1));
//	System.out.println(ar.indexOf("Parthiv"));
//
//	
//	for (String element:ar) {
//		System.out.println("Index  of ListArray is = " + element);
//	}

//		ArrayList<String> ar = new ArrayList<String>();
//		ar.add("Sree");
//		ar.add("SREEDEI");
//		ar.add("Parthiv");
//		ar.add("Sree");
//		
//		System.out.println(ar);
//		System.out.println(ar.size());
//		for(int i=0; i< ar.size();i++) {
//			System.out.println(ar.get(i)) ;
//			
//		}
//		
//		Iterator<String> ir = ar.iterator();
//		while(ir.hasNext()) {
//			String element = ir.next();
//			System.out.println(element);
	//	}
		
		HashMap <Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "SREE");
		hm.put(2, "PARTHIV");
		hm.put(3,"CHA");
		hm.put(4,"Devi");
		hm.put(5, "SREE");
		hm.put(3,"Amma");
		
		System.out.println(hm.get(1));
		
		for(Entry n : hm.entrySet()) {
			System.out.println(n.getKey() + "  " +n.getValue());
		}
		
		
		
		
		
		
		
	}
}
