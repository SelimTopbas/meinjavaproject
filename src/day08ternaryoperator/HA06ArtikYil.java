package day08ternaryoperator;

import java.util.Scanner;

public class HA06ArtikYil {

	public static void main(String[] args) {
		//Kullanıcıdan bir yıl girmesini isteyin, yıl artık yıl ise ekrana “Artık yıl” 
		//degilse ekrana “Artık yıl degil” yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Bir yil giriniz: ");
		int yil = scan.nextInt();
		
		String result = yil % 100 == 0 ? (yil % 400 == 0 ? "Artik yil" : "Artik yil degil" ) : 
			(yil % 4 == 0 ? "Artik yil" : "Artik yil degil");
		
		System.out.println(result);
		
		scan.close();

	}

}
