package day02wrapperclasses;

import java.util.Scanner;

public class HA07MilToKm {

	public static void main(String[] args) {

		
		//Mil’i kilometreye çeviren bir program yazınız. (double kullanınız)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen Mil'i giriniz: ");
		
		double mil = scan.nextDouble();
		
		System.out.println(mil + " mil = " + mil * 1.6 + " km");
		
		scan.close();
	}

}
