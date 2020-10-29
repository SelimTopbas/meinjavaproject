package day12scopewhileloop;

import java.util.Scanner;

public class HA04ToplamTumilkSonTamSayi {

	public static void main(String[] args) {
		// Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde biten 
		//tüm tamsayıların toplamını ekrana yazdırın.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir baslangic degeri girin: ");
		int bas = scan.nextInt();
		System.out.println("Bir bitis degeri girin: ");
		int son = scan.nextInt();
		
		if(bas>son) {
			int temp = bas;
			bas = son;
			son = temp;
		}
		
		int sum = 0;
		while (bas <= son) {
			sum = sum + bas;
			bas++;
		}
		System.out.println(sum);
		
		scan.close();
		
	}

}
