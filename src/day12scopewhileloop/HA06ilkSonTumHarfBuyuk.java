package day12scopewhileloop;

import java.util.Scanner;

public class HA06ilkSonTumHarfBuyuk {

	public static void main(String[] args) {

		//Kullanıcıdan başlangıç ve bitiş harflerini alın ve başlangıç harfinden başlayıp bitiş harfinde biten tüm harfleri büyük harf olarak ekrana yazdırın. Kullanıcının hata yapmadığını farz edin.

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Bir baslangic harfi girin: ");
		char bas = scan.next().toUpperCase().charAt(0);
		System.out.print("Bir bitis harfi girin: ");
		char son = scan.next().toUpperCase().charAt(0);
	
		while(bas<=son) {
			System.out.print(bas + " ");
			bas++;
		}
		scan.close();
	}

}
