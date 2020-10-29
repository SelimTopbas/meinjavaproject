package day06ifstatement;

import java.util.Scanner;

public class HA05RakamSayi {
	public static void main(String[] args) {

	//Kullanıcıdan bir tamsayı alın eğer tamsayı 10 dan kucuk ve 0’dan büyük eşit ise ekrana
	//“Rakam” yazdırın. Diğer durumlarda ekrana “Sayı” yazdırın.
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Bir tam sayi girin: ");
	int num = scan.nextInt();
	
	if (num >= 0 && num <0) {
		System.out.println("Girilen değer bir rakam");
	}else {
		System.out.println("Girilen değer bir Sayi");
	}
	
	scan.close();
	}	

}
