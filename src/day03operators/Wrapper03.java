package day03operators;

import java.util.Scanner;

public class Wrapper03 {

	public static void main(String[] args) {

		//Kullanıcıdan ad ve soyadını alalım. ekrana yazdıralım
		//Kullanıcıdan adresini alalım ve ekrana yazdıralım
		//Kullanıcıdan yaşını alalım
		//
		

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen ad ve Soyadınızı yazınız: ");
		String isim = scan.nextLine();
		
		System.out.print("Adresinizi yazın: ");
		String adres = scan.nextLine();
		
		System.out.print("Yaşınızı yazınız: ");
		int yas = scan.nextInt();
		
		System.out.print("Türkiye'de mi yaşıyorsunuz?: ");
		boolean turkiye = scan.nextBoolean();
		
		System.out.println("isim: " + isim);
		System.out.println("Adres: " + adres);
		System.out.println("Yaş: " + yas);
		System.out.println("Türkiyede yaşıyorum: " + turkiye);
		
		scan.close();
	}

}
