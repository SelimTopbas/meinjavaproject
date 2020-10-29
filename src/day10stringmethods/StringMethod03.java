package day10stringmethods;

import java.util.Scanner;

public class StringMethod03 {

	public static void main(String[] args) {
		// charAt() methodu belli indexteki characteri return eder
		
		String str1 = "cimbombom";
		//str1 in 4. indexindeki characteri bulan kodu yazınız
		System.out.println(str1.charAt(4)); //indexi 4 olan character 'o' harfidir. o yüzden ekranda 'o' yazdırır
		System.out.println(str1.charAt(0)); //index 0 ilk harf demektir bu yüzden 'c' return eder
		//System.out.println(str1.charAt(10)); // olmayan bir index ile islem yapmaya calısırsak consolda "Exeption" alırız
											// olmayan karakterde ise -1 alırız
	
		
		//length() methodu Stringin içinde kac character olduğunu verir
		System.out.println(str1.length());
		
		
		
		// Kullanicidan ismini girmesini isteyin.
        // Isminin son harfini ekrana yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("İsminizi giriniz:");
		String isim = scan.nextLine();
		int length = isim.length();
		System.out.println(isim.charAt(length-1));
		
		
		scan.close();
		
		
		
		
		
		
		
	}

}
