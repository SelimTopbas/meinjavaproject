package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement03 {

	public static void main(String[] args) {
		
		//Kullanicidan 6 basamakli bir sayi isteyin. Kazanma ihtimali %20, amorti ihtimali %30, kaybetme ihtimali %50 olsun
		//Jackpot oyunu ici proram yaziniz
		//000000-000001-000002-...-999998-999999 ==> 1 milyon sayi

		Scanner scan = new Scanner(System.in);
		System.out.print("6 Basamakli sayi giriniz, sifir basta girilebilir: ");
		int num = scan.nextInt();
		
		if (num < 200000 ) {
			System.out.println("Kazandiniz!");
		}else if (num < 500000 ) {
			System.out.println("Tekrar deneyin!");	
		}else {
			System.out.println("Kaybettiniz!");
		}
		
		scan.close();

	}

}
