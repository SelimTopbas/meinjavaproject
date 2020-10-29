package day10stringmethods;

import java.util.Scanner;

public class HA08IlkİkiHarfBüyük {

	public static void main(String[] args) {
		//Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin ilk iki harfini büyük harf olarak ekrana yazdırın.
		
		Scanner scan= new Scanner(System.in);
		
		System.out.print("Ülkenizi giriniz: ");
		String land = scan.nextLine();
		
		System.out.println(land.substring(0,2).toUpperCase());
		
		//son iki harfi büyük olsun 
		
		int a = land.length();
		
		System.out.println(land.substring(a-2).toUpperCase());
		
		scan.close();
	}

}
