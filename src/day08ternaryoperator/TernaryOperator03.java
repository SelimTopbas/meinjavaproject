package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator03 {

	public static void main(String[] args) {
		// Kullanicidan iki sayi aliniz
	    // Kucuk sayiyi ekrana yazdiriniz

			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("1. Sayıyı giriniz: ");
			double num1 = scan.nextDouble();
			
			System.out.print("2. Sayıyı giriniz: ");
			double num2 = scan.nextDouble();
			
			double result = (num1 <= num2 ) ? num1 : num2;
			System.out.println("Küçük sayı :" + result);
			
			scan.close();

	}

}
