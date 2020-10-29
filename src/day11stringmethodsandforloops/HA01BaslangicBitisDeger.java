package day11stringmethodsandforloops;

import java.util.Scanner;

public class HA01BaslangicBitisDeger {

	public static void main(String[] args) {
		// Kullanıcıdan başlangıç ve bitiş değerlerini alın ve 
		//başlangıç değerinden başlayıp bitiş değerinde biten tüm tamsayıları ekrana yazdırın.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir baslangic degeri giriniz: ");
		int bas = scan.nextInt();
		System.out.print("Bir bitis degeri giriniz: ");
		int son = scan.nextInt();
		
		for ( int i=bas; i<=son; i++) {
			System.out.print(i + " ");
		}
		scan.close();
	}

}
