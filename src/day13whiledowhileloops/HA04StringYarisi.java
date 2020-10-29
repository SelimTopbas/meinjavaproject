package day13whiledowhileloops;

import java.util.Scanner;

public class HA04StringYarisi {

	public static void main(String[] args) {
		//Kullanıcıdan uzunluğu çift sayı olan bir String alın ve bu String’in ilk yarısını ekrana yazdırın.
		//Ornegin; Kullanıcı “Hollanda” girerse ekrana “Holl” yazdıracaksınız.
		

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir uzunlugu cift sayi olan bir kelime girin: ");
		String str = scan.nextLine();
		
		int length = str.length();
		if(length%2==0) {
			System.out.println(str.substring(0,length/2));
		}else {
			System.out.println("Kelime uzunlugu bir cift sayi olmalidir");
		
		scan.close();
	}
	}
}
