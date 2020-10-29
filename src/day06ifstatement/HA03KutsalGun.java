package day06ifstatement;

import java.util.Scanner;

public class HA03KutsalGun {

	public static void main(String[] args) {
		// Kullanıcıdan bir gun alın eğer gun “Cuma” ise ekrana “Müslümanlar icin kutsal gün” yazdırın. “
		//Cumartesi” ise ekrana “Yahudiler icin kutsal gün” yazdırın. “Pazar” ise ekrana “Hıristiyanlar icin kutsal gün” yazdırın
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen kutsal bir gun giriniz: ");
		String gun = scan.nextLine();
		
		if (gun.equalsIgnoreCase("Cuma")) {//equalsIgnoreCase() buyuk kucuk harf dikkate almadan esitlige bakar
											// cuma = Cuma = CUMA =CuMa ... hepsi ayni kabul edilir
			System.out.println("Müslümanlar icin kutsal gün");
		}
		else if (gun.equalsIgnoreCase("Cumartesi")) {
			System.out.println("Yahudiler icin kutsal gün");
		}else if (gun.equalsIgnoreCase("Pazar")) {
			System.out.println("Hıristiyanlar için kutsal gün");
		}else {
		System.out.println("Yanlış seçim yaptınız");
		}
		
		scan.close();

	}

}
