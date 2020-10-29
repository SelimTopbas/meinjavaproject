package day06ifstatement;

import java.util.Scanner;

public class HA07IndirimliUrunTutar {

	public static void main(String[] args) {
		//Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. Eğer urun miktarı 1000 den fazla ise 
		//Kullanıcıya %10 indirim yapın ve ödemesi gereken toplam parayı ekrana yazdırın. 
		//Diğer durumlarda ödemesi gereken toplam parayı herhangi bir indirim yapmadan ekrana yazdırın.
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Ürün miktarını giriniz: ");
		int miktar = scan.nextInt();
		System.out.print("Ürün birim fiyatını giriniz: ");
		double fiyat = scan.nextDouble();
		
		if(miktar > 1000) {
		System.out.println("%10 indirimli ödemeniz gereken tutar: " + miktar * (fiyat - fiyat*10/100));
		}else  {
		System.out.println("Ödemeniz gereken tutar: " + miktar * fiyat);
		}
		
		scan.close();

	}

}
