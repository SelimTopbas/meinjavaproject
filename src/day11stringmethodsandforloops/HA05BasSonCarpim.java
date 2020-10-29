package day11stringmethodsandforloops;

import java.util.Scanner;

public class HA05BasSonCarpim {

	public static void main(String[] args) {

		//Kullanıcıdan başlangıç ve bitiş değerlerini alın ve 
		//başlangıç değerinden başlayıp bitiş değerinde biten tüm tamsayıların çarpımını ekrana yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Bir baslangic degeri giriniz: ");
		int bas = scan.nextInt();
		System.out.print("Bir bitis degeri giriniz: ");
		int son = scan.nextInt();
		
		int product = 1;
		
		for (int i=bas; i<=son; i++) {
			product*=i;
		}
		System.out.println(product);
		
		scan.close();
	}

}
