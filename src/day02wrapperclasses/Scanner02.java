package day02wrapperclasses;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		// Kullanıcıdan bir karenin çevresi ve alanını hesaplayan bir program yazınız
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen Karenin bir kenar uzunluğunu giriniz: ");
		
		int kenarUzunlugu = scan.nextInt();
		
		System.out.println("Karenin Çevresi: " + (4 * kenarUzunlugu) + " cm");
		System.out.println("Karenin Alanı: " + (kenarUzunlugu * kenarUzunlugu) + " cm kare");
	
		scan.close();

	}

}
