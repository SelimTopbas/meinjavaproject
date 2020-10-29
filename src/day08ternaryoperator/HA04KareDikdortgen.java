package day08ternaryoperator;

import java.util.Scanner;

public class HA04KareDikdortgen {

	public static void main(String[] args) {
		//Kullanıcıdan bir dikdörtgenin en ve boyunu girmesini isteyin. 
		//En ve boy eşit ise ekrana “Kare”
		//farklı ise ekrana “Dikdörtgen” yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Dortgenin en'ini giriniz: ");
		double en = scan.nextDouble();
		
		System.out.print("Dortgenin Boy'unu giriniz: ");
		double boy = scan.nextDouble();
		
		String result = en > 0 && boy > 0 ? (en == boy ? "Kare" : "Dikdortgen"): "Uzunluklar negativ olamaz!";
		System.out.println(result);
		
		scan.close();

	}

}
