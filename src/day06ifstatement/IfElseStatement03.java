package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
		
		// Kullanicidan alacagi urun miktarini ve fiyatini alalim
		// Eger kullanici 1000 den fazla urun alirsa %20 indirim yapin
		// ve kullanicinin odeyecegi toplam fiyati ekrana yazdirin
		// Eger kullanici 1000 den az veya 1000 urun alirsa indirim yapmayin
		// ve kullanicinin odeyecegi toplam fiyati ekrana yazdirin
		// Para konularinda “double” kullanin
		// Ornek: 60TL ye %20 indirim ==> 60*80 /100
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Urun miktarini giriniz: ");
		int miktar = scan.nextInt();
		System.out.print("Odeyeceginiz tutari giriniz: ");
		double tutar = scan.nextDouble();
				
		if (miktar > 1000 ) {
			System.out.println("Odeyeceginiz tutar " + miktar * (tutar - (tutar * 20/100)));
		}
		else {
			System.out.println("Odeyeceginiz tutar: " + miktar * tutar);
		}
		
		scan.close();


	}

}
