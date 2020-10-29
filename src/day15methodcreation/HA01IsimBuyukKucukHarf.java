package day15methodcreation;

import java.util.Scanner;

public class HA01IsimBuyukKucukHarf {

	public static void main(String[] args) {
		
		//Kullanıcıdan isim ve soyismini alın. Kullanıcının isim ve soyisminin ilk harflerini büyük 
		//diğer harflerini küçük harf olarak ekrana yazdıran programı yazınız.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Isminizi Giriniz: ");
		String isim = scan.next().toLowerCase();
		System.out.print("Soyisminizi Giriniz: ");
		String soyIsim = scan.next().toLowerCase();
		
		info(isim, soyIsim);
		scan.close();
	}

	public static void info(String isim, String soyIsim) {
		
		isim = isim.toUpperCase().charAt(0) + isim.substring(1);
		soyIsim = soyIsim.toUpperCase().charAt(0) + soyIsim.substring(1);
		
		System.out.println(isim + " " + soyIsim);

	}
}
