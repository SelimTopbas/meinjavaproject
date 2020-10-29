package day14dowhileloop;

import java.util.Scanner;

public class HA06_a_HarfVarYok {

	public static void main(String[] args) {
		// Kullanıcıdan bir String alın ve bu String’in icinde “a” harfi varsa 
		//ekrana “a harfi var” yazdırın. “a” harfi yoksa tekrar bir String girmesini isteyin.
		
		Scanner scan = new Scanner(System.in);

		String str = "";
		do {
			System.out.print("Bir String girin: ");
			str = scan.nextLine();
			
			if(!str.contains("a")) {
				System.out.println("Girdiginiz Stringte a harfi yok. Tekrar deneyin!");
			}
		}while(!str.contains("a"));
		
		System.out.println("'a' harfi var");

		scan.close();
	}

}
