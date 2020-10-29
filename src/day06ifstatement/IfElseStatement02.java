package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {

		// Kullanicidan bir tamsayi isteyin ve o tamsayinin
		// mutlak degerini ekrana yazdirin
		// mutlak deger bir sayinin kendi isareti ile carpilmasi demektir
		// Ornek: -3 un mutlak degeri: -1.-3 = 3
		// Ornek: +5 in mutlak degeri: +1.+5 = 5
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir tam sayi giriniz: ");
		int sayi = scan.nextInt();
		
		if (sayi > 0 ) {
			System.out.println("Mutlak deger: " + ((1) * sayi));
		}
		else {
			System.out.println("Mutlak deger: " + ((-1) * sayi));
		}
	
		scan.close();


	}

}
