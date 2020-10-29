package day21multidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArray01 {

	public static void main(String[] args) {

		// Multi Dimensional Array Olusturma(2 boyutlu)

		int arr[][] = new int[3][4]; // ilk [] parantes dış array ve 3 elemanli yapti.
										// ikinci []ise icteki her array in kac elemanli oldugunu gosteriyor. her biri 4
										// elemanli

		System.out.println(Arrays.toString(arr)); // referenceleri yazdirir [[I@1540e19d, [I@677327b6, [I@14ae5a5]
		System.out.println(Arrays.deepToString(arr)); // butun elemanlari yazdirir

		// Multi Dimensional Array Deger atama 1. yontem

		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 4;
		arr[1][0] = 5;
		arr[1][1] = 6;
		arr[1][2] = 7;
		arr[1][3] = 8;
		arr[2][0] = 9;
		arr[2][1] = 10;
		arr[2][2] = 11;
		arr[2][3] = 12;

		System.out.println(Arrays.deepToString(arr));//tum arraylari yazmasi icin ==> Arrays.deepToString(arr)
		System.out.println(Arrays.toString(arr[2]));//sadece belli bir dış array yazdirmak icin ==> Arrays.toString(arr[2])
		System.out.println(arr[1][2]);//7 ==> bir ic array yazdirmak icin
		System.out.println(arr[2][1] + arr[0][3]); // toplamlarini verir = 14
		
		
		
		

	}

}
