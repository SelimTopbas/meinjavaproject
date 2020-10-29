package day02wrapperclasses;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		
		//Kullanıcıdan alınan bir sayının küpünü hesaplayan bir program yazınız.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen bir sayı giriniz: ");
		int sayi = scan.nextInt();
		
		System.out.println("Girdiğiniz Sayının Küp'ü: " + (sayi * sayi * sayi));
	
		scan.close();


		
	}

}
