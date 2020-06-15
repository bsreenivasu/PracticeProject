package JavaPractice;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class DuplicateElementsInArray {

	public static void main(String[] args) throws FileNotFoundException {
			Integer[] arr = {2,5,3,2,5,2,3,2,5,9};
			Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
			for(int i:arr) 
			{
				Integer count = hm.get(i);
				if(count == null) 
				{
					hm.put(i, 1);
				}
				else
				{
					count = count+1;
					hm.put(i, count);
				}
				
			}
			System.out.println("Duplicate Elements are :: ");
			Set<Map.Entry<Integer, Integer>> es = hm.entrySet();
			for(Map.Entry<Integer, Integer> me:es) {
				if(me.getValue() > 1) {
					System.out.print(me.getKey()+ " ");
					
				}
			}
			}
		
		}
	

