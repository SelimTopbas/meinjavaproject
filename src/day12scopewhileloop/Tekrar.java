package day12scopewhileloop;

import java.util.Scanner;

public class Tekrar {

	public static void main(String[] args) {

		
//==>	WhileLoop01 - while loop kullanarak 1 den 10'a kadar tam sayilari ekrana yazdirin
		
//==>	WhileLoop01 - while loop kullanarak 1 den 20'a kadar tam sayilari ekrana yazdirin

//==>	WhileLoop01 - while loop kullanarak 5 ten 120'a kadar 3'e bolunebilen tam sayilari ekrana yazdirin
		
//==>   HA01 - 	while loop kullanarak 3 ten 13'e kadar olan tum tek tam sayilari ekrana yazdirin

//==>	HA02 - 	Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde
			   	//biten tüm tamsayıları while loop kullanarak ekrana yazdırınız.
		
//==>	HA03 - 	Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden veya sonrasından başlayıp 
			   	//bitiş değerinde veya öncesinde biten tüm çift tamsayıları while loop kullanarak ekrana yazdırınız.
		
//==>	HA04 - 	Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde biten 
			   	//tüm tamsayıların toplamını ekrana yazdırın.
		
//==>	HA05 - 	//Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde biten 
			   	//tüm tamsayıların çarpımını ekrana yazdırın.	
		
//==>	HA06 - 	//Kullanıcıdan başlangıç ve bitiş harflerini alın ve başlangıç harfinden başlayıp bitiş harfinde biten 
			   	//tüm harfleri büyük harf olarak ekrana yazdırın. Kullanıcının hata yapmadığını farz edin.
		
//==>	HA07 - 	// Kullanıcıdan bir rakam alın ve bu rakam icin çarpım tablosunu ekrana yazdırın. 
				// Kullanıcının hata yapmadığını farz edin.
				// Ornegin kullanıcı 3 girerse;
				// 3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30		
	
Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir baslangic degeri girin: ");
		int bas = scan.nextInt();
		System.out.println("Bir bitis degeri girin; ");
		int son = scan.nextInt();
		int sum = 0;
		while (bas<=son) {
			if(bas%2==0) {
				sum+=bas;
			}bas++;
		}System.out.println("Toplam: " + sum);
		scan.close();
	}

}
