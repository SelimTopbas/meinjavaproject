package day08ternaryoperator;

import java.util.Scanner;

public class HA03MutlakDeger {

	public static void main(String[] args) {
		//Kullanıcıdan bir tamsayı girmesini isteyin, 
		//ekrana o tamsayının mutlak degerini yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Bir tam sayı giriniz: ");
		int num = scan.nextInt();
		
		int result = num < 0 ? (-1) * num : num;
		
		System.out.println("Girdiginiz Sayini Mutlak Degeri: " + result);
		
		scan.close();
	}

}
