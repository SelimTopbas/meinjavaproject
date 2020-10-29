package day20arrays;

import java.util.Arrays;
import java.util.Scanner;

public class HA01 {

	public static void main(String[] args) {
//		Kullanıcıya kaç elemanlı bir array gireceğini sorun. Kullanıcıdan array’in elemanlarını girmesini isteyin.
//		a) Bu array’in icinde herhangi bir elemanın var olup olmadigini kontrol edin.
//		b) Bu arayın tum elemanlarını tersten yazdırın.
//		Mesela; array {1, 2, 3, 4} ise ekrana {4, 3, 2, 1} seklinde yazdırın.

		Scanner scan = new Scanner(System.in);

		System.out.print("Kac elemanli array olusturmak istiyorsunuz?: ");
		int length = scan.nextInt();
		int arr[] = new int[length];

		System.out.print("Array elemanlarini giriniz: ");
		for (int i = 0; i < length; i++) {
			arr[i] = scan.nextInt();
		}
		
		int arrSon[] = new int[length];
		for(int  i=length-1; i>=0; i--) {
			arrSon[(length-1 )- i] = arr[i];
			
		}
		System.out.println("Son Hal: " + Arrays.toString(arrSon));

		if (Arrays.binarySearch(arr, 4) < 0) {
			System.out.println("Arraylar arasinda '4' eleman olarak bulunmuyor.");
		} else {
			System.out.println("Arraylar arasinda '4' eleman olarak mevcut");
		}
scan.close();
	}

}
