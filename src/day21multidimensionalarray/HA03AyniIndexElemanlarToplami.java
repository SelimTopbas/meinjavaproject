package day21multidimensionalarray;

public class HA03AyniIndexElemanlarToplami {

	public static void main(String[] args) {
//		Aşağıdaki multi dimensional array’lerin iç array’lerinde aynı index’e sahip elemanların toplamını 
//		ekrana yazdıran bir program yazınız arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }

		int arr1[][] = { { 1, 2 }, { 3, 4, 5 }, { 6 } };
		int arr2[][] = { { 7, 8, 9 }, { 10, 11 }, { 12 } };

		int length_1;
		if (arr1.length <= arr2.length) {
			length_1 = arr1.length;
		} else {
			length_1 = arr2.length;
		}

		for (int i = 0; i < length_1; i++) {

			int length_2;
			if (arr1[i].length <= arr2[i].length) {
				length_2 = arr1[i].length;
			} else {
				length_2 = arr2[i].length;
			}

			for (int j = 0; j < length_2; j++) {
				System.out.println( "arr1["+ i + "]["+ j+"] = " + (arr1[i][j] + arr2[i][j]));

			}

		}

//
//		for (int i = 0; i < arr1.length; i++) {
//			for (int j = 0; j < arr1[i].length; j++) {
//				for(int k=0; k< arr2.length; k++) {
//					for(int l=0; l<arr2[k].length; l++) {
//						
//						if(arr1[i][j]==arr2[k][l]) {
//				System.out.println((arr1[i][j] + arr2[i][j]));
//						
//					}
//				}
//				
//				
//				
//				}
//			}
//
//		}

	}

}
