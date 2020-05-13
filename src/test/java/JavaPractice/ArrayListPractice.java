package JavaPractice;
import java.util.ArrayList;

public class ArrayListPractice {
	
	public static void main(String args[]) {
		
		ArrayList arlist = new ArrayList();
		arlist.add(100);
		arlist.add("SREE");
		arlist.add(15.56);
		arlist.add("True");
		
		int len = arlist.size();
		System.out.println(arlist.get(1));
		System.out.println("lenth of the Array List is " + len);
		
		for(int i=0;i<len;i++) {
			System.out.println("Element of the ArrayList is : " + arlist.get(i));
			

		}
		
		
	
		
		
		
		
		
		
	}

}
