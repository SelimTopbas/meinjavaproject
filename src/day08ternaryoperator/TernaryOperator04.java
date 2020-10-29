package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator04 {

	public static void main(String[] args) {
		
	//Ternary Operator (if else if) (Nested Ternary)
	
	//kullanicidan bir sayi aliniz
	//Sayi 0'dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz
	// 10 dan küçük ise ekrana "Rakam" yazdırın, değilse "Pozitif Sayi" yazdırın
	//Sayı 0 dan küçük ise "Negatif Sayi" yazdırın
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Bir integer sayi giriniz: ");
	int num = scan.nextInt();
	
	String result = num >= 0 ? (num < 10 ? "Rakam" : "Positiv Sayi" ) : "Negativ Sayi";
	System.out.println(result);
	
	scan.close();
	}

}
