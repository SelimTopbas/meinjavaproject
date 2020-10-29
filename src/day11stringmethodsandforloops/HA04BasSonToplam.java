package day11stringmethodsandforloops;

import java.util.Scanner;

public class HA04BasSonToplam {

	public static void main(String[] args) {
		//Kullanıcıdan başlangıç ve bitiş değerlerini alın ve 
		//başlangıç değerinden başlayıp bitiş değerinde biten tüm tamsayıların toplamını ekrana yazdırın.

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Bir baslangic degeri giriniz: ");
		int bas = scan.nextInt();
		System.out.print("Bir bitis degeri giriniz: ");
		int son = scan.nextInt();
		
		int sum = 1;
		while(bas<=son) {
			sum = sum * bas;
			bas++;
		}
		System.out.println(sum);
		
		scan.close();
	}

}
