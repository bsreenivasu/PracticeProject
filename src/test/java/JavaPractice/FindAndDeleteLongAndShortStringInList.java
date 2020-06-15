package JavaPractice;
import java.util.ArrayList;
import java.util.List;

public class FindAndDeleteLongAndShortStringInList {
	
		public void DeleteLongAndShortString(List<String> list) {
		//Initializing Variables
		int smallest = list.get(0).length();
		int longest = list.get(0).length();
		int shortindex = 0;
		int longindex = 0;

		//Finding Smallest String in  List:
		System.out.println("All Elements in List IS --->>>"+list);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length() < smallest) {
				smallest = list.get(i).length();
				shortindex = i;
			}
		}
			
		System.out.println("<<<<< ----------------->>>>");
		System.out.println("Smallest String is :: " + list.get(shortindex));
		list.remove(shortindex);     //Removing Smallest String from List
		
		//Finding longest String in List:
		for (int j = 0; j < list.size(); j++) {
				if (list.get(j).length() > longest) {
					longest = list.get(j).length();
					longindex = j;
				}
			}
		System.out.println("Longestt String is :: " + list.get(longindex));
		System.out.println("<<<<< ----------------->>>>");
		list.remove(longindex);       //Removing Longest String from List
	
		//Printing List after removing smallest and longest string:
		System.out.println("List of Elements after removal---->>> "+ list);
		}
public static void main(String[] args) {
	
	//Creating ArrayList with Strings
	ArrayList<String> list = new ArrayList<String>();
	list.add("Java");
	list.add("C");
	list.add("Python");
	list.add("Selenium");
	list.add("Programming");
	
	FindAndDeleteLongAndShortStringInList deleteStrings = new FindAndDeleteLongAndShortStringInList();
	deleteStrings.DeleteLongAndShortString(list);
	
		}
}
