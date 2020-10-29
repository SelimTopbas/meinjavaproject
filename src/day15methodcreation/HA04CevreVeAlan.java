package day15methodcreation;

import java.util.Scanner;

public class HA04CevreVeAlan {

	public static void main(String[] args) {
		// Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini ve iki sayı seçmesini söyleyin. 
		//Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.

		Scanner scan = new Scanner(System.in);
		System.out.print("1 - Paralel Kenar" + "\n" +
						 "2 - Dikdortgen Kenar" + "\n" +
						 "3 - Dik Ucgen" + "\n");
		System.out.print("Rakamla bir secim yapiniz: ");
		String sekil = scan.next();
		System.out.print("Birinci kenari giriniz: ");
		double kenar1 = scan.nextDouble();
		System.out.print("Ikinci kenari giriniz: ");
		double kenar2 = scan.nextDouble();

		islem(sekil, kenar1, kenar2);
		scan.close();
	}

	public static void islem(String sekil, double kenar1, double kenar2) {
		
		switch(sekil){
			case "1" :
				System.out.println("Cevre: " + 2*(kenar1+kenar2));
				break;
			case "2" :
				System.out.println("Cevre: " + 2*(kenar1+kenar2) + " - Alan: " + (kenar1*kenar2));
				break;
			case "3" :
				System.out.println("Alan: " + (kenar1*kenar2)/2);
				break;
			default:
				System.out.println("Hatali giris...");
		}
		
	}
	
}
