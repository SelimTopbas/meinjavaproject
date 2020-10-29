package day02wrapperclasses;

import java.util.Scanner;

public class HA04SayininKupu {

	public static void main(String[] args) {

		//Kullanıcıdan alınan bir sayının küpünü hesaplayan bir program yazınız.

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Sayıyı giriniz: ");
		int sayi = scan.nextInt();
		System.out.println("Girdiğiniz sayının küpü: " + sayi * sayi * sayi);
		
		scan.close();
	}

}
