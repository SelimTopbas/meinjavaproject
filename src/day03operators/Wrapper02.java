package day03operators;

import java.util.Scanner;

public class Wrapper02 {

	public static void main(String[] args) {

		
		//Kullanicidan ilk ismini alin ekrana yazdirin.
		//Kullanicidan soy ismini alin ekrana ilk isminin altina yazdirin.		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("İlk isminizi girin: ");
		String ilkIsim = scan.nextLine(); // Adamın belki iki ismi var. o yüzden nextLine() daha makul
		
		System.out.print("Soyisminizi yazın: ");
		String soyisim = scan.next();
		
		System.out.println("İsminiz: " + ilkIsim);
		System.out.println("Soyisminiz: " + soyisim);
		
		scan.close();
	}

}
