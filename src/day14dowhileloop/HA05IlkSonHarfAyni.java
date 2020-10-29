package day14dowhileloop;

import java.util.Scanner;

public class HA05IlkSonHarfAyni {

	public static void main(String[] args) {
		// Kullanıcıya bir String girmesini söyleyin ve bu String’in ilk harfi ile son harfi aynı ise ekrana  “Simetrik” yazdırın. Aynı değilse tekrar bir String girmesini isteyin.
		
		Scanner scan = new Scanner(System.in);

		String str = "";
		char ilkHarf ;
		char sonHarf;
		
		do {
			System.out.print("Bir String girin: ");
			str = scan.nextLine();
			ilkHarf = str.charAt(0);
			sonHarf = str.charAt(str.length()-1);
			if(ilkHarf!=sonHarf) {
				System.out.println("************************************************");
				System.out.println("Girdiginiz Stringin ilk ve son harfi esit degil."+"\n"
									+ "Lutfen tekrar deneyin!");
				System.out.println("************************************************");
			}
		}while(ilkHarf != sonHarf);
		
		System.out.println("Simetrik");

		scan.close();
	}

}
