package day20arrays;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
		// Bir array'in içinde belli bir elemanın olup olmadığını kontrol ediniz
		//binarySearch() methodu bu iş için kullanılır
		//binarySearch() methodu aranan eleman var olduğunda o elemanın Yerini return eder
		//ONEMLI NOT: binarySearch() methodnu kullanmadan önce sort() methodunu kullanmak zorundayız
		//Aksi halde binarySearch() methodu manalı bir sonuc vermez
		
		int arr[] = {1,5,2,4,3};
		
		//yukarıda verilen array'de '3' eleman olarak var mı
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.binarySearch( arr, 3));
		System.out.println(Arrays.binarySearch( arr, 2));
		//Aynı elemandan birden fazla olduğunda ilkinin kaçıncı sıradaki eleman olduğunu  verir
		System.out.println(Arrays.binarySearch( arr, 8));//olmayan elemanlar için negativ sayılar return eder
													//Aslında var olsaydı, olması gereken yerin negativ INDEX'ini verir
	}

}
