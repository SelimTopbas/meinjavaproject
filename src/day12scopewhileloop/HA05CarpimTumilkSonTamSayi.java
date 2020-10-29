package day12scopewhileloop;

import java.util.Scanner;

public class HA05CarpimTumilkSonTamSayi {

	public static void main(String[] args) {
		//Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde biten 
		//tüm tamsayıların çarpımını ekrana yazdırın.
		

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Bir baslangic degeri girin: ");
		int bas = scan.nextInt();
		System.out.print("Bir bitis degeri girin: ");
		int son = scan.nextInt();
		
		if(bas>son) {			
			System.out.println("Baslangic degeri bitis degerinden buyuk olmamali");
		}else {
			int product = 1;
			while(bas<=son) {
				product *= bas;
				bas++;
			}
			System.out.println(product);
		}
		scan.close();
	}

}
