package day07nestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {

		//Kullanicidan bir sayi alin. sayi positiv ise 9'dan buyukmu diye kontrol edin, 
		//9'dan buyuk ise ekrana "Sayi" yazdirin
		//9'dan kucuk esit ve 0'dan buyuk esit ise ekrana "Rakam" yazdirin
		//Negativ ise ekrana "Sayi" girin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Bir tamsayı giriniz:");
		int num = scan.nextInt();
		
		if (num >= 0) {
			if(num > 9) {
				System.out.println("Sayi");
			}else if (num <= 9 && num >= 0) {
				System.out.println("Rakam");
			}
		}else {
			System.out.println("Sayi");
		}
		
		
		scan.close();
	}

}
