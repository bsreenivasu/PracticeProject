package JavaPractice;

public class arrayPractice {
	
	public static void main(String[] args) {
	
	int i[] = new int[4];
	i[0]=1;
	i[1]=2;
	i[2]=3;
	i[3]=4;
	
	System.out.println(" Value of array in India is " + i[0]);
	System.out.println(" Value of array in India is " + i[3]);
	
	int len = i.length;
	System.out.println("Length of the array is " + len);
	
	for(int j=0; j < len; j++) {
		System.out.println(i[j]);
	}
	
	
	}

}
