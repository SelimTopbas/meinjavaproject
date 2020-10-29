package day04operators;

import java.util.Scanner;

public class HA03SayiRakamlarToplami {
	public static void main(String[] args) {
		//Kullanıcının girdiği 4 basamaklı sayının tum rakamlarının toplamın ekrana yazdıran bir program yazınız.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("4 basamaklı bir tam sayı giriniz: ");
		int sayi = scan.nextInt();
		
		int ilkRakam = sayi / 1000;
		int ikinciRakam = (sayi % 1000) / 100;
		int ucuncuRakam = (sayi % 100) / 10;
		int sonRakam = (sayi % 10);
		
		System.out.println("Rakamlar toplamı: " + (ilkRakam +ikinciRakam + ucuncuRakam + sonRakam));

		scan.close();
	}
}
