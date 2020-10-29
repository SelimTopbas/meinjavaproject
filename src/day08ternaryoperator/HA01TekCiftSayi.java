package day08ternaryoperator;

import java.util.Scanner;

public class HA01TekCiftSayi {

	public static void main(String[] args) {

		//Kullanıcıdan bir tamsayı girmesini isteyin, 
		//tamsayı çift ise ekrana “Çift” tek ise ekrana “Tek” yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Bir tam sayı giriniz: ");
		int num = scan.nextInt();
		
		String result = num % 2 == 0 ? "Cift" : "Tek";
		
		System.out.println(result);
		
		scan.close();
	}

}
