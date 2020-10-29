package day02wrapperclasses;
import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {

		
		//Kullanıcı iki tam sayı versin
		//Program bu tam sayıların toplamını ve çarpımını ekrana yazdırsın

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen iki tam sayı giriniz");
		System.out.println("*********************");
		
		System.out.print("Birinci Sayı: ");
		int sayi1 = scan.nextInt();
		
		System.out.print("İkinci Sayı: ");
		int sayi2 = scan.nextInt();
		
		System.out.println("*********************");
		
		System.out.println("Sayıların Toplamı: " + (sayi1 + sayi2));
		System.out.println("Sayıların Çarpımı: " + (sayi1 * sayi2));
		
		scan.close();
	}

}
