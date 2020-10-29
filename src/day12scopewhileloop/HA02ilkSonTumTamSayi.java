package day12scopewhileloop;

import java.util.Scanner;

public class HA02ilkSonTumTamSayi {

	public static void main(String[] args) {

//==>	Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde
		//biten tüm tamsayıları while loop kullanarak ekrana yazdırınız.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir baslangic degeri girin: ");
		int start = scan.nextInt();
		System.out.println("Bir bitis degeri girin; ");
		int finish = scan.nextInt();
		
		if(start>finish) {
			System.out.println("Baslangic sayisi bitis sayisindan buyuk olamaz");
		}else {
			while (start<=finish) {
				System.out.println(start);
				start++;
			}
		}	
		scan.close();	
		
	}

}
