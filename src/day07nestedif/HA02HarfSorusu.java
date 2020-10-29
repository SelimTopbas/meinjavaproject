package day07nestedif;

import java.util.Scanner;

public class HA02HarfSorusu {

	public static void main(String[] args) {
		// Kullanıcıdan bir harf girmesini isteyin.
		// Girdiği küçük harf ise harfin “a” olup olmadığını kontrol edin. Harf “a” ise ekrana “Ilk küçük harf” yazdırın. 
		// “a” değil ise ekrana “Ilk küçük harf değil” yazdırın.
		// Girdiği büyük harf ise harfin “Z” olup olmadığını kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdırın. 
		//“Z” değil ise ekrana “Son büyük harf değil” yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir harf girin: ");
		char harf = scan.next().charAt(0);
		if(harf >= 'a' && harf <='z'){
			if ( harf == 'a') {
				System.out.println("Ilk kucuk harf");
			}else if (harf != 'a') {
				System.out.println("Ilk kucuk harf degil");
			}
			
		}else if (harf >= 'A' && harf <= 'Z') {
			if (harf == 'Z') {
				System.out.println("Son Buyuk Harf");
			}else if (harf != 'Z') {
				System.out.println("Son Buyuk Harf Degil");
			}
		}else {
			System.out.println("Hatali Katakter Girdiniz!");
		}
		scan.close();

	}

}
