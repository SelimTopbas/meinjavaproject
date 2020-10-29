package day04operators;

import java.util.Scanner;

public class HA01IkiDegerinYeriniDegistir {

	public static void main(String[] args) {

		//sayı1 ve sayı2 adlı iki integer variable oluşturunuz ve bunların değerlerini yer değiştiriniz.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("sayi1: ");
		int sayi1 = scan.nextInt();
		
		System.out.println("sayi2: ");
		int sayi2 = scan.nextInt();
		
		System.out.println("Değişimden önce: ");
		System.out.println("Sayı1: " + sayi1);
		System.out.println("Sayı2: " + sayi2);
		
		/*int yedek = 0;
		yedek = sayi1;
		sayi1 = sayi2;
		sayi2 = yedek;
		*/
		
		sayi1 = sayi1 + sayi2;
		sayi2 = sayi1 - sayi2;
		sayi1 = sayi1 - sayi2;
		System.out.println("Değişimden Sonra: ");
		System.out.println("Sayı1: " + sayi1);
		System.out.println("Sayı2: " + sayi2);
		
		scan.close();
	}

}
