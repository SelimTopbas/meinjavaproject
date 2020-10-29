package day11stringmethodsandforloops;

import java.util.Scanner;

public class HW06BasSonBuyukHarf {

	public static void main(String[] args) {
		
		//Kullanıcıdan başlangıç ve bitiş harflerini alın ve 
		//başlangıç harfinden başlayıp bitiş harfinde biten tüm harfleri büyük harf olarak ekrana yazdırın.

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Bir baslangic harfi giriniz: ");
		char bas = scan.next().toUpperCase().charAt(0);
		System.out.print("Bir bitis harfi giriniz: ");
		char son = scan.next().toUpperCase().charAt(0);
		
		for (char i=bas; i<=son; i++) {
			System.out.println(i);
			// alernative ==>System.out.println(String.valueOf(i).toUpperCase());
		}
		
		scan.close();
		
		
	}

}
