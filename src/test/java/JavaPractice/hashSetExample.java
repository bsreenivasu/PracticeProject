package JavaPractice;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetExample {

	public static void main(String[] args) {
		HashSet<String> sh = new HashSet<String>();
		
		sh.add("Sreenivas");
		sh.add("Sreedevi");
		sh.add("Parthiv");
		sh.add("Chakrika");
		
		System.out.println("HashSet Elements are :" + sh);
		sh.add("Sreedevi");
		System.out.println("HashSet Elements are :" + sh);
		
		Iterator<String> it = sh.iterator();
		while(it.hasNext()) {
			System.out.println("Elements in HasSet is :" + it.next());
		}
		
		sh.remove("Sreedevi");
		System.out.println("HashSet Elements are :" + sh);
		
		

	}

}
