package day12scopewhileloop;

import java.util.Scanner;

public class HA03ilkSonTumCiftTamSayi {

	public static void main(String[] args) {
		
		//Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden veya sonrasından başlayıp 
		//bitiş değerinde veya öncesinde biten tüm çift tamsayıları while loop kullanarak ekrana yazdırınız.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir baslangic degeri girin: ");
		int bas = scan.nextInt();
		System.out.println("Bir bitis degeri girin; ");
		int son = scan.nextInt();
		
		if(bas>son) { 			//eger degerler kullanici tarafindan yanlis girilirse...
			bas = bas + son;
			son = bas - son;
			bas = bas - son;
		}
		
		while (bas<=son) {
			if(bas%2==0) {
				System.out.println(bas);
			}
			bas++;
		}
		scan.close();
		
	}

}
