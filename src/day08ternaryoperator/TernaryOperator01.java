package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator01 {

	public static void main(String[] args) {
		
		// Ternary Operator (if else)
		
		
	    // Kullanicidan bir sayi aliniz
        // Sayi pozitif veya 0 ise ekrana "Pozitif veya 0" yaziniz.
        // Sayi negatif ise ekrana "Negatif" yaziniz.

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir sayı giriniz: ");
		double num = scan.nextDouble();
		
		//if (num >= 0) {
		//	System.out.println("Pozitif veya 0");
		//}else if (num < 0){
		//	System.out.println("Negativ");
		//}
		
		
		//Ternary Operator	
		//	Sonuc =			Condition	Soru İşareti	Condution doğru ise 	iki nokta üst üste	Condition Yanlış ise	noktalı virgül
			String sonuc =	(num >= 0)		?             "Pozitif veya 0"				:				"Negativ"				;
		System.out.println(sonuc);
		
		
		scan.close();

	}

}
