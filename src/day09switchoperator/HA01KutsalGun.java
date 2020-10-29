package day09switchoperator;

import java.util.Scanner;

public class HA01KutsalGun {

	public static void main(String[] args) {

//		Kullanıcıdan bir gun alın eğer gun “Cuma” ise ekrana “Müslümanlar için kutsal gün” yazdırın.
//		“Cumartesi” ise ekrana “Yahudiler için kutsal gün” yazdırın. 
//		“Pazar” ise ekrana“Hıristiyanlar için kutsal gün” yazdırın. 
//		Diger günler icin “Kutsal gün değil” yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Kutsal bir gun giriniz: ");
		String day = scan.next();
		
		switch (day.toLowerCase()) {
			case "cuma":
				System.out.println("Müslümanlar için kutsal gün");
				break;
			case "cumartesi":
				System.out.println("Yahudiler için kutsal gün");
				break;
			case "pazar":	
				System.out.println("Hıristiyanlar için kutsal gün");
				break;
			default:
				System.out.println("Kutsal gün değil");
				
		scan.close();		
		}
	}

}
