package day06ifstatement;

import java.util.Scanner;

public class HA04AyniIsaretliSayi {

	public static void main(String[] args) {
		// Kullanıcıdan iki sayı alın eğer sayıların işaretleri aynı ise ekrana “Aynı işaretli” yazdırın. 
		//Sayıların işaretleri farklı ise ekrana “Farklı işaretli” yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Iki Sayi girin: ");
		System.out.print("1. Sayi: ");
		double num1 = scan.nextDouble();
		System.out.print("2. Sayi: ");
		double num2 = scan.nextDouble();
		
		if (num1 * num2 > 0) {
			System.out.println("Aynı işaretli");
		}else if (num1 * num2 < 0) {
			System.out.println("Farklı işaretli");
		}
		scan.close();

	}

}
