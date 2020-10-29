package day04operators;

import java.util.Scanner;

public class HA02IlkSonRakamToplami {

	public static void main(String[] args) {


		//Kullanıcının girdiği 4 basamaklı sayının ilk ve son rakamının toplamını ekrana yazdıran bir program yazınız.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("4 basamaklı bir tam sayı giriniz: ");
		int sayi = scan.nextInt();
		
		int sonRakam = sayi % 10;
		int ilkRakam = sayi / 1000;
		
		System.out.println("Basamakları toplamı : " + (sonRakam +ilkRakam));
	
		scan.close();

	}

}
