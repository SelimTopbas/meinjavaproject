package day11stringmethodsandforloops;

import java.util.Scanner;

public class HA02BasSonCiftSayi {

	public static void main(String[] args) {
		//Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden veya sonrasından başlayıp 
		//bitiş değerinde veya öncesinde biten tüm çift tamsayıları ekrana yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Bir baslangic degeri giriniz: ");
		int bas = scan.nextInt();
		System.out.print("Bir bitis degeri giriniz: ");
		int son = scan.nextInt();
	
		for(int i=bas; i<=son; i++) {
			if(i%2==0) {
				System.out.println(i);

			}
		}
		
		scan.close();
	}

}
