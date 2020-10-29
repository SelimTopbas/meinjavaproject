package day10stringmethods;

import java.util.Scanner;

public class HA06IlkHarflerBuyuk {

	public static void main(String[] args) {
		//Kullanıcıdan ilk ve soy ismini alın 
		//ilk ve soy isminin ilk harflerini büyük harf olarak ekrana yazdırın.
		
		Scanner scan= new Scanner(System.in);
		
		System.out.print("Adinizi giriniz: ");
		String ad = scan.nextLine();
		System.out.print("Soyadinizi giriniz: ");
		String soyAd = scan.nextLine();
		
		System.out.println(ad.substring(0,1).toUpperCase() + " " + soyAd.substring(0,1).toUpperCase());
		
		scan.close();
		
		
		
		
	}

}
