package day07nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		
		// Kullanicidan password girmesini isteyin
		// Password 4 basamakli bir sayi ise cift olup olmadigini kontrol edin
		// Cift sayi ise ekrana “Password tamam” yazdirin, Tek sayi ise “Tekrar deneyin yazdirin”
		// Password 4 basamakli degil ise “Tekrar deneyin” yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Şifrenizi girin:");
		int sifre = scan.nextInt();
		
		if (sifre > 999 && sifre < 10000) {
			if(sifre % 2 == 0) {
				System.out.println("Password Tamam");
			}else if (sifre % 2 != 0) {
				System.out.println("Tekrar Deneyin");
			}
		}else {
			System.out.println("Tekrar Deneyin");
		}
		
		
		scan.close();
	}

}
