package day02wrapperclasses;

import java.util.Scanner;

public class HA08SaatToSaniye {

	public static void main(String[] args) {


		//Saati saniyeye çeviren bir program yazınız. (long kullanınız)
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Saat'i Giriniz: ");
		long saat = scan.nextLong();
		
		System.out.println(saat + " Saat = " + saat * 60 * 60 + " Saniyedir");

		scan.close();
	}

}
