package day06ifstatement;

import java.util.Scanner;

public class HA10IkizEsCesitKenarUcgen {

	public static void main(String[] args) {
		//Kullanıcıdan bir üçgenin üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana “Eşkenar üçgen” yazdırın. 
		//Sadece iki kenar uzunluğu birbirine eşit ise ekrana “Ikizkenar üçgen” yazdırın. 
		//Tüm kenar uzunlukları birbirinden farklı ise “Çeşitkenar üçgen yazdırın”
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen üçgenin kenar uzunluklarını giriniz");
		System.out.print("1. Kenar: ");
		double kenar1 = scan.nextDouble();
		System.out.print("2. Kenar: ");
		double kenar2 = scan.nextDouble();
		System.out.print("3. Kenar: ");
		double kenar3 = scan.nextDouble();
		
		if (kenar1 == kenar2 && kenar1 == kenar3) {
			System.out.println("Eşkenar üçgen");
		}else if (kenar1 == kenar2 && kenar1 != kenar3 || kenar1 == kenar3 && kenar1 != kenar2 || kenar2 == kenar3 && kenar2 != kenar1){
			System.out.println("İkiz kenar üçgen");
		}else {
			System.out.println("Çeşitkenar üçgen");
		}
		
		scan.close();

	}

}
