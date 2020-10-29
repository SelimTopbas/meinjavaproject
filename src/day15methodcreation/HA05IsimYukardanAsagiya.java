package day15methodcreation;

import java.util.Scanner;

public class HA05IsimYukardanAsagiya {

	public static void main(String[] args) {
		// HA05 -  Kullanıcıya bir String girmesini söyleyin ve bu String’i yukarıdan aşağıya doğru yazdıran 
		//	Program yazınız. //Ornegin; CAN ==> C
										//  	A 
									  	//  	N
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir String Giriniz: ");
		String str = scan.nextLine();
		
		islem(str);
		scan.close();
	}
	
	public static void islem(String str) {
		
		int idx = str.length()-1;
		int i = 0;
		while(i<=idx) {
			System.out.println(str.charAt(i));
			i++;
		}
	}
}
