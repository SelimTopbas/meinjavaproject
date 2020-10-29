package day03operators;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {

		//Kullanıcıdan ad ve soyadını alıp ekrana yazdıran bir program yazınız. (String kullanarak)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen İsminizi ve Soyisminizi Giriniz: ");
		
		String isim = scan.next(); //Stringleri kullanıcıdan almak için next() veya nextLine() kullanılır
							// next() tek kelimelik Stringler içindir. iki veya daha fazla kelime olursa sadece ilk kelimeyi alır. 
							//nextLine() ise girilen tüm String'i almak için kullanılır
		
		System.out.println("İsminiz: " + isim);
			
		scan.close();

	}

}
