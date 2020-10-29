package day04operators;

import java.util.Scanner;

public class OdevSorusuCozumu01 {

	public static void main(String[] args) {


		//Kullanıcıdan integer aldıktan sonra String alamıyoruz

		Scanner scan = new Scanner(System.in);
				
		/*Java'da nextInt() kullandıktan sonra nextLine() kullanırsak kod çalışmaz
		  nextInt() yerine nextLine kullan sonra elde eddiğin Strin'i Integer.parseInt() kullanarak integer'a çevir
		  veya String yerine int kullanırsak, bir alt satıra scan.nextLine() da problemi çözer
		*/
				
		System.out.print("Yaşınızı giriniz: ");
		String yas = scan.nextLine();
		int yeniYas = Integer.parseInt(yas);	// String'i tam sayıya çevirme mehodu.	
														// Integer.parseInt() sadece rakam içeren Strignler için çalışır
		System.out.println("Yaşınız: " + (yeniYas + 1 )); 
				
		System.out.print("Ad ve soyadınızı giriniz: ");
		String isim = scan.nextLine();
		System.out.println("Ad ve Soyadınız: " + isim );
		
		scan.close();
	}

}
