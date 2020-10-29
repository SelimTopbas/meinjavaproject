package day04operators;

import java.util.Scanner;

public class Modulus02 {

	public static void main(String[] args) {


		// kullanıcının girdiği 4 basamaklı sayının ilk ve son rakamının toplamını veren program yazınız

		Scanner scan = new Scanner(System.in);
				
		System.out.print("Lütfen 4 basamaklı bir sayı giriniz: ");
		int s = scan.nextInt();
		
		int sonRakam = s % 10; // son basamağı bulmak için sayıyı 10 a böleriz
		int ilkRakam = s / 1000; // bu şekilde 1000 e bölersek ilk basamağını buluruz
				
		System.out.println("Sayı basamakların toplamı: " + (sonRakam + ilkRakam));
	
		scan.close();


	}

}
