package week2.assignments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int data[] = {3, 2, 11, 4, 6, 7};
		Arrays.sort(data);
		int i=data.length;
		
		System.out.println(data[i-2]);
		

	}

}
