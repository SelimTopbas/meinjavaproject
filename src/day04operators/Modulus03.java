package day04operators;

import java.util.Scanner;

public class Modulus03 {

	public static void main(String[] args) {
		
		// Kullanıcıdan aldığınız 3 basamaklı bir tam sayının rakamları toplamını bulunuz

		Scanner scan = new Scanner(System.in);
			
		System.out.println("3 Basamaklı bir sayı giriniz: ");
		int s = scan.nextInt();
			
		int sonRakam = s % 10;
		int ortaRakam = (s % 100)/10; // veya int ortaRakam = (s / 10) % 10;
		int ilkRakam = s/100;
			
		System.out.println("Rakamları toplamı: " +  (sonRakam + ortaRakam + ilkRakam));
			
		scan.close();

	}

}
