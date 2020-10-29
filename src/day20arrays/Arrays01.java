package day20arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

	public static void main(String[] args) {

//		Kullanıcıdan kaç elemanlı bir array girmesini  isteyin.
//		Bu array’i olusturup tum elemanlarını ekrana yazdırın.
//		Bu aray'ın ilk elemanını son eleman yapın ve tum elemanlarını ekrana yazdırın.
//		Mesela; array {1, 2, 3} ise ekrana {2, 3, 1} seklinde yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Kac elemanli bir integer array olustumak istersiniz: ");
		int length = scan.nextInt();
		
		int arr[] = new int[length];//kullanicinin girecegi sayıyla array oluşacak. (atama yapacak)
		System.out.println("Array elemanlarini giriniz: ");
		for(int i=0; i<length; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));//Arrays.toString() methoduna parametre olarak arry'in 
												//ismini yazarsaniz o array'in tum elemanlarini ekranda gorursunuz
		//Bunun arkasında çalışan bir for döngüsü var ve bu döngüyü toString methodunun içerisen koymuş.
		
		int arrSon[] = new int[length];
		for(int i=1; i<length; i++) {
			arrSon[i-1] = arr[i];
		}
		arrSon[length-1] = arr[0];
		
		System.out.println(Arrays.toString(arrSon));
		
		scan.close();
		
	}

}
