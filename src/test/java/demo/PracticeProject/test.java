package demo.PracticeProject;

public class test {
	public static void main(String[] args) {
		String[] str = { "sree", "123", "devi", "456", "parthiv", "786", "chakrika" };
		int strCount = 0, numCount = 0;

		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		for (int j = 0; j < str.length; j++) {
			try {
				int k = Integer.parseInt(str[j]);
				numCount++;
			} catch (NumberFormatException e) {
				strCount++;
			}
		}
		System.out.println("Total nums are :: " + numCount);
		System.out.println("Total Strings are :: " + strCount);
	}
}
