package day02wrapperclasses;

import java.util.Scanner;

public class HA03KareCevreAlan {

	public static void main(String[] args) {	
		//Kullanıcıdan karenin kenar uzunluğunu alan ve 
		//sonra bu karenin alan ve çevresini hesaplayıp ekrana yazdıran bir program yazınız.
		Scanner scan = new Scanner(System.in);
			
		System.out.print("Diktördgenin birinci kenarını giriniz: ");
		int kenar1 = scan.nextInt();
			
		System.out.print("Dikdörtgenin ikinci kenarını giriniz: ");
		int kenar2 = scan.nextInt();
			
		System.out.println("Dikdörtgenin Çevresi: " + 2 * (kenar1 + kenar2 ));
		System.out.println("Dikdörtgenin Alanı: " + kenar1 * kenar2);

			
		scan.close();
	}

}
