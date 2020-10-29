package day02wrapperclasses;

import java.util.Scanner;

public class HA05PrizmaHacim {

	public static void main(String[] args) {


		//Boyutları kullanıcıdan alınan bir dikdörtgenler prizmasının hacmini hesaplayan bir program yazınız.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Prizmanın en'ini griniz: ");
		int en = scan.nextInt();
		
		System.out.print("Prizmanın Boy'unu giriniz: ");
		int boy = scan.nextInt();
		
		System.out.print("Prizmanın Yüksekliğini giriniz: ");
		int yukseklik = scan.nextInt();
		
		System.out.println("Prizmanın hacmi: " + en * boy * yukseklik);
		
		
		scan.close();
	}

}
