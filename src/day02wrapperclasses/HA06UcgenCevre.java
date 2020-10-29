package day02wrapperclasses;

import java.util.Scanner;

public class HA06UcgenCevre {

	public static void main(String[] args) {

		//Kenar uzunlukları kullanıcıdan alınan bir üçgenin çevresini hesaplayan bir Program yazınız. (byte kullanınız)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Üçgenin kenar uzunluklarını giriniz: ");
		
		byte kenar1 = scan.nextByte();
		byte kenar2 = scan.nextByte();
		byte kenar3 = scan.nextByte();
		
		System.out.println("Üçgenin Çevresi: " + (kenar1 + kenar2 +kenar3));
		
		scan.close();

	}

}
