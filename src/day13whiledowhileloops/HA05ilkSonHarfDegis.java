package day13whiledowhileloops;

import java.util.Scanner;

public class HA05ilkSonHarfDegis {

	public static void main(String[] args) {
		// Kullanıcıdan bir String alın ve bu String’in ilk harfi ile son harfinin yerlerini değiştirerek ekrana yazdırın.
		//Ornegin; Kullanıcı “Java” girerse ekrana “aavJ” yazdıracaksınız.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir kelime girin: ");
		String str = scan.nextLine();
		
		char ilk = str.charAt(0);
		char son = str.charAt(str.length()-1);
		String orta = str.substring(1, str.length()-1);
		
		System.out.println(son+orta+ilk);
		
		scan.close();
	}

}
