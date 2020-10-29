package day10stringmethods;

import java.util.Scanner;

public class HA05IsimKacHarf {

	public static void main(String[] args) {

		//Kullanıcıdan ilk ve soy ismini alın ilk ve soy isminin kaç harften oluştuğunu ekrana yazdırın.
		
		Scanner scan= new Scanner(System.in);
		
		System.out.print("Isim ve Soyisminizi giriniz: ");
		String isim = scan.nextLine();
		
		int length = isim.length();
		
		System.out.println("Isminiz ve soy isminiz " + (length - 1 ) + " karakterden olusmaktadir.");
		
		scan.close();
		
		
		
	}

}
