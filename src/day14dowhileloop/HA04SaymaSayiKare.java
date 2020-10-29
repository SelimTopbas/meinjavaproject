package day14dowhileloop;

import java.util.Scanner;

public class HA04SaymaSayiKare {

	public static void main(String[] args) {
		//Kullanıcıya iki sayı girmesini söyleyin. Bu sayılar eşit ise ekrana “Kare oluşturdunuz” yazdırın. 
		//Eşit değilse tekrar iki sayı girmesini söyleyin.
		
		Scanner scan = new Scanner(System.in);

		int num1;
		int num2;
		
		do {
			System.out.print("Birinci sayiyi girin: ");
			num1 = scan.nextInt();
			System.out.print("Ikinci sayiyi girin: ");
			num2 = scan.nextInt();
			if(num1!=num2) {
				System.out.println("Girdiginiz sayilar esit degil. Lutfen tekrar deneyin!");
				System.out.println("*****************************************************");
			}
		}while(num1!=num2);
		
		System.out.println("Hele Sukur! Kare olusturdunuz");
		
		scan.close();
	}

}
