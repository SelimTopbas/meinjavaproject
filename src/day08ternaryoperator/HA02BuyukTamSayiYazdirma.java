package day08ternaryoperator;

import java.util.Scanner;

public class HA02BuyukTamSayiYazdirma {

	public static void main(String[] args) {
		
		//Kullanıcıdan iki tamsayı girmesini isteyin, 
		//ekrana her zaman büyük olanını yazdırın
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1. tam sayıyı giriniz: ");
		int num1 = scan.nextInt();
		
		System.out.print("2. tam sayıyı giriniz: ");
		int num2 = scan.nextInt();
		
		int result = num1 > num2 ? num1 : num2;
		System.out.println("Buyuk Sayi: " + result);
		
		scan.close();

	}

}
