package day10stringmethods;

import java.util.Scanner;

public class HA04KrediKartNo {

	public static void main(String[] args) {
//		Kullanıcıdan kredi kartı numarasını alın ve 
//		bu numaranın üçüncü, dördüncü ve sonuncu rakamlarını ekrana yazdırın.
		
		Scanner scan= new Scanner(System.in);
		
		System.out.print("Kredi Karti numaranizi giriniz: ");
		String kart = scan.next();
		
		int length = kart.length();
		
		System.out.println("Kartinizin 3., 4. ve son numarasi sirasiyla asagidaki gibidir: " + "\n" +
				kart.charAt(3) + kart.charAt(4) + kart.charAt(length-1));
		
		scan.close();
	}

}
