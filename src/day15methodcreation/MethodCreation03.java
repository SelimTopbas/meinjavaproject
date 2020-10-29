package day15methodcreation;

import java.util.Scanner;

public class MethodCreation03 {

	public static void main(String[] args) {
		// Basit hesap makinasi
		// Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalim
		// Kullanicidan iki sayi girmesini isteyelim
		// Girlen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdiralim.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Islem Seciniz (+, -, x, :, ÷): ");
		char islem = scan.next().charAt(0);
		
		System.out.println("Birinci sayiyi giriniz");
		double num1 = scan.nextInt();
		System.out.println("Ikinci sayiyi giriniz");
		double num2 = scan.nextInt();
		
		hesapMakinesi(islem, num1,num2);
		
		scan.close();
	}
	
	public static void hesapMakinesi(char islem, double num1, double num2) {
		
		switch(islem) {
			case '+':
				System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
				break;
			case '-':
				System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
				break;
			case 'x':
				System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
				break;
			case ':':
				System.out.println(num1 + " : " + num2 + " = " + (num1/num2));
				break;
			default:
				System.out.println("Yanlis secim yaptiniz");
		}
		
	}
	

}
