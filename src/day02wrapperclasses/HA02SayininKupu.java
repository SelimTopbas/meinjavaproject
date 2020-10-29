package day02wrapperclasses;

import java.util.Scanner;

public class HA02SayininKupu {

	public static void main(String[] args) {

		//Kullanıcıdan alınan bir sayının küpünü hesaplayan bir program yazınız.
		
		Scanner scan = new Scanner(System.in);
				
		System.out.print("Karenin kenar uzunluğunu giriniz: ");
				
		int kenar = scan.nextInt();
				
		System.out.println("Karenin küpü: " + kenar * kenar * kenar);
		
		scan.close();
	}

}
