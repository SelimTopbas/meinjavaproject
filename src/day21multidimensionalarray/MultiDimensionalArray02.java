package day21multidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArray02 {

	public static void main(String[] args) {
		// Multi Dimensional Array Deger atama 2. yontem
		
		int arr[][] = { {1,2}, {3}, {4,5,6} };
		
		System.out.println(Arrays.deepToString(arr));
		
		System.out.println(arr[0][1] + arr[1][0] + arr[2][2]);
		
		
		//tum arraylari toplami
		int sum = 0;
		for (int i=0; i<arr.length; i++) {//i = dis array			===>Dynamic bir code
			for (int j=0; j<arr[i].length; j++) { //j= ic array
				sum+= arr[i][j];
			}
		
		}
	
		System.out.println("Tum elemanlarin toplami: " + sum);
	
	
	
	
	}

}
