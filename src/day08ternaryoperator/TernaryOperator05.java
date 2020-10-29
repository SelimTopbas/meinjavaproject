package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator05 {

	public static void main(String[] args) {
		
		// Kullanicidan bir character girmesini isteyiniz
		// Character harf ise kucuk harf olup olmadigini kontrol ediniz
		// Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
		// Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
		// Harf degilse ekrana "Harf degil" yazdiriniz
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Bir karakter giriniz: ");
		char ch = scan.next().charAt(0);
		
		String result = ch>= 'a' && ch<='z' || ch >= 'A' && ch <='Z' ? 
				(ch >= 'a' && ch <='z' ? "Kucuk Harf" : "Büyük Harf"):"Harf Değil";
		System.out.println(result);
		
		scan.close();
	
	}

}
