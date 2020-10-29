package day15methodcreation;

import java.util.Scanner;

public class HA02EsitVeBuyukSayi {

	public static void main(String[] args) {
		// Kullanıcıdan iki sayı alın bu sayılar eşit ise ekrana “Eşit”, birinci sayı büyük ise 
		//ekrana “Birinci sayı büyük”, ikinci sayı büyük ise ekrana “Ikinci sayı büyük” yazdırınız.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Birinci sayiyi Giriniz: ");
		int num1 = scan.nextInt();
		System.out.print("Ikinci sayiyi Giriniz: ");
		int num2 = scan.nextInt();
		
		islem(num1,num2);
		scan.close();
	}
	
	public static void islem(int num1, int num2) {
		
		if (num1==num2) {
			System.out.println("Sayilar Esit");
		}else if(num1>num2){
			System.out.println("Birinci sayi buyuk");
		}else{
			System.out.println("Ikinci sayi buyuk");
		}
	}
}
