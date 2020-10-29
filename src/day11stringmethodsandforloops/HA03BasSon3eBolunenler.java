package day11stringmethodsandforloops;

import java.util.Scanner;

public class HA03BasSon3eBolunenler {

	public static void main(String[] args) {
		
		//Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden veya sonrasından başlayıp 
		//bitiş değerinde veya öncesinde biten tüm 3 ile bölünebilen tamsayıları ekrana yazdırın.

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Bir baslangic degeri giriniz: ");
		int bas = scan.nextInt();
		System.out.print("Bir bitis degeri giriniz: ");
		int son = scan.nextInt();
		
		if(bas>=son) {
			System.out.println("Baslangic degeri bitis degerinden kucuk olmalidir");
		}else {
			for(int i=bas; i<=son; i++) {
				if(i%3==0) {
					System.out.println(i);
				}
			}
		}
		scan.close();
	}

}
