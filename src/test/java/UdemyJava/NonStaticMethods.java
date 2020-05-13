package UdemyJava;

public class NonStaticMethods {
	
	String studentName;
	int studenAge;

	public static void main(String[] args) {
		
		NonStaticMethods nsm = new NonStaticMethods();
		nsm.conversion();
		System.out.println("+++++++++++++++++++++++++++++++++=");
		nsm.marks();
		System.out.println(nsm.studenAge);
		System.out.println(nsm.studentName);

	}
		public void marks() {
			
			System.out.println("Student Marks");
			studentName = "Sreenivas";
			studenAge = 30;
			
			
			
		}
		
	
		
		public void conversion() {
			
			String s = "100";
			System.out.println(s + 10);
			int i = Integer.parseInt(s);
			System.out.println( i+20);
			

	}

}
