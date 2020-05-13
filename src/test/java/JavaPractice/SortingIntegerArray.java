package JavaPractice;

public class SortingIntegerArray {

	public static void main(String[] args) {
		int[] intarray = { 8, 4, 2, 9, 1,3 };

		for (int i = 0; i < intarray.length; i++) {
			for (int j = i + 1; j < intarray.length; j++) {

				if (intarray[i] > intarray[j]) {

					int temp = intarray[i];
					intarray[i] = intarray[j];
					intarray[j] = temp;
				}
			}
			System.out.print(intarray[i] + " ");
		}

	}

}
