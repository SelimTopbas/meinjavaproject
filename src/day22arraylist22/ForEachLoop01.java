package day22arraylist22;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {

	public static void main(String[] args) {

		// For Each Loop, for loop'un bir ust verisyonudur. Diger adi
		// "Enhanced(zenginlestirilmis) For Loop"

		int arr[] = { 12, 21, 13, 43 };

		// for loop kullanarak ekemanlari ekrana yazdir
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("===");
		// for each loop kullanarak ekemanlari ekrana yazdir

		for (int w : arr) {
			System.out.println(w);
		}
//==>	String iceren bir array olusturun, elemanlarini yanyana aralarinda bosluk koyarak for each loop ile ekrana yazdirin
		String arr1[] = { "Ali", "Veli", "Can" };

		for (String w : arr1) {
			System.out.print(w + " ");
		}

		// Integer elemanlar iceren bir list olusturun. For each loop kullanarak
//		bu elemanlarin toplamini ekrana yazdirin

		List<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(21);
		list.add(33);
		list.add(23);

		int sum = 0;
		for (int w : list) {
			sum += w;
		}
		System.out.println(sum);

//			Multi dimensional Array {{1, 2}, {5}, {6, 7 ,8}}; arrayindaki tum elemanlarin toplamini return edin
		
		int arr2[][] = {{1, 2}, {5}, {6, 7 ,8}};
		
		int sum1 = 0;
		for(int[] w : arr2) {
			for(int z : w) {
				sum1+=z;
			}
		}
		System.out.println(sum1);
		

	}

}
