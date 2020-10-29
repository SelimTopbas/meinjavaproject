package day02wrapperclasses;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		
		//Kullanıcıdan dikdörtgenin boyutlarını alan ve sonra diktörtgenin alan ve 
	    // cevresini hesaplayıp ekrana yazdıran bir program yazınız.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen Dikdörtgenin kenar uzunluklarını giriniz: ");
		
		int kenar1 = scan.nextInt();
		int kenar2 = scan.nextInt();
		
		System.out.println("Dikdörtgenin çevresi: " + 2 * (kenar1 + kenar2));
		System.out.println("Dikdörtgenin alanı: " + (kenar1 * kenar2));
		
		scan.close();
	}

}
