package day10stringmethods;

import java.util.Scanner;

public class HA09IlkSonIkiciHarfBuyuk {

	public static void main(String[] args) {
		
		//Kullanıcıdan yaşadığı ülkenin ismini alın 
		//bu ülkenin bastan ikinci harfi ile sondan ikinci harfini büyük harf olarak ekrana yazdırın.
		Scanner scan= new Scanner(System.in);
		
		System.out.print("Ülkenizi giriniz: ");
		String land = scan.nextLine();
		//1. yontem
		//System.out.println(land.toUpperCase().charAt(1));//2. harfin indexi 1 dir
		//System.out.println(land.toUpperCase().charAt(land.length()-2));

		//2. yontem
		int a = land.length();
		System.out.println(land.substring(1,2).toUpperCase() + land.substring(a-2,a-1).toUpperCase());
	
		
		scan.close();
	}

}
