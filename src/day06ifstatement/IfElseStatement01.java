package day06ifstatement;

import java.util.Scanner;


public class IfElseStatement01 {
	public static void main(String[] args) {
		//Kullanicidan password girmesini isteyin
		//password dogru ise ekrana “Password dogru” yazdirin
		//password yanlis ise ekrana “Password yanlis tekrar deneyin” yazdirin
		//Dogru password = Java2020

		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Parolanizi giriniz: ");
		String password = scan.nextLine();
		
// Stringlerin esitligini kontrol ederken asla "==" kullanmayin. onun yerine "equals()" kullanin 
// "==" Stringin degerini ve adresini kontrol eder
// "equals()" degerleri kontrol eder
		
		if  (password.equals("Java2020")) {
			System.out.println("Password dogru");
		}else {
			System.out.println("Password Yanlis, tekrar deneyiniz");
		}
		
		scan.close();

	}

}
