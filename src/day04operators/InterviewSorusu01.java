package day04operators;

import java.util.Scanner;

public class InterviewSorusu01 {

	public static void main(String[] args) {

		// iki tane variable nin değerlerini yer değiştiriniz
		// sayi1 = 12; sayi2 = 30; ==> sayi1 = 30; sayi2 = 12; olacak. bu işleme swap denir
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Yerlerini değiştirmek için iki sayı giriniz:");
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		
		//1.Yol
		System.out.println("Yer değiştirmeden önce: ");
		System.out.println("Sayı1: " + sayi1);
		System.out.println("Sayı2: " + sayi2);

		
		double gecici = 0.0;
		gecici = sayi1; //sayi1 şu an boşalmadı ama boş gibi düşünebiliriz.
		sayi1 = sayi2;	//sayi2 de ayni şekilde
		sayi2 =gecici;
		System.out.println("Yer değiştirmeden sonra: ");
		System.out.println("Sayı1: " + sayi1);
		System.out.println("Sayı2: " + sayi2);

		// 2.Yol
		
		System.out.println("Yer degistirmek iki sayi daha giriniz");
        
        double sayi3 = scan.nextDouble(); 
        double sayi4 = scan.nextDouble();
        
        sayi3 = sayi3 + sayi4;
        sayi4 = sayi3 - sayi4;
        sayi3 = sayi3 - sayi4;
        System.out.println("Yer degistirdikten sonra:");
        System.out.println(sayi3);//30.0
        System.out.println(sayi4);//12.0

		scan.close();

	}

}
