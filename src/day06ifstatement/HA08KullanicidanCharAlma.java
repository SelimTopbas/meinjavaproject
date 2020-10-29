package day06ifstatement;

import java.util.Scanner;

public class HA08KullanicidanCharAlma {

	public static void main(String[] args) {
		//Kullanıcıdan bir character alın eğer character bir harf ise ekrana “Harf” yazdırın. 
		//Diğer durumlarda ekrana “Harf değil” yazdırın.

		Scanner scan = new Scanner(System.in);
	
		System.out.print("Bir karakter giriniz: ");
		char harf = scan.next().charAt(0);
		
		
		if (harf >= 65 && harf<=90  || harf >= 97 && harf <= 122) {
			System.out.println("Girdiğiniz değer Harf");
		}else {
			System.out.println("Girdiğiniz değer Harf değil");
		}//burada kelime girsekte harf olarak kabul edecek çünkü char kelime yazsak bile ilk harfine bakar.
	
		scan.close();

	}

}
