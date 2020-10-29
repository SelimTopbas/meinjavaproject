package day21multidimensionalarray;

import java.util.Arrays;

public class HA04 {

	public static void main(String[] args) {

//		Aşağıdaki multi dimensional array’in iç array’lerindeki tum elemanların toplamını birer birer bulan ve 
//		herbir sonucu yeni bir array’in elemanı yapan ve yeni array’i ekrana yazdıran bir program yazınız
//		{ {1,2,3}, {4,5}, {6,7} }
//		Ornegin; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}
		
		int arr[][] = { { 1, 2, 3 }, { 4, 5 }, { 6, 7 } };
		int temp[] = new int[arr.length];
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			for( int j=0; j<arr[i].length; j++) {
				
				temp[i]+=arr[i][j];
				
			}
			
			
			
		}
		
		System.out.println(Arrays.toString(temp));
		
		
		
		
		
		
		
		
		
		
		
		
		

//		int arr[][] = { { 1, 2, 3 }, { 4, 5 }, { 6, 7 } };
//		
//		int newArr[] = new int[arr.length];
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				
//				newArr[i] += arr[i][j];
//			}
//		}
//		System.out.println(Arrays.toString(newArr));
//		
		
		
//		int arr1[] = new int[arr.length];
//
//		for (int i = 0; i < arr.length; i++) {
//			int sum = 0;
//			for (int j = 0; j < arr[i].length; j++) {
//				sum = sum + arr[i][j];
//			}
//			arr1[i] = sum;
//		}
//		System.out.println(Arrays.toString(arr1));


		
	}

}
