package parallelArraySorting;

import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) {
		
		int[] myArray = {5,9,1,8,2,7,3,6,4};

		for (int i = 0; i < myArray.length; i++) {
			System.out.print(" "+myArray[i]);
		}
		Arrays.parallelSort(myArray,0,4);
		
		System.out.println();
		
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(" "+myArray[i]);
		}
	}

}
