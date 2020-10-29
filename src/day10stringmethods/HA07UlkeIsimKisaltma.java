package day10stringmethods;

import java.util.Scanner;

public class HA07UlkeIsimKisaltma {

	public static void main(String[] args) {

		//Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin ismi Amerika ise ekrana USA, 
		//Ingiltere ise ekrana UK, Almanya ise ekrana DE yazdırın. Diğer ülkeler için ise NA yazdırın.

		Scanner scan= new Scanner(System.in);
		
		System.out.print("Ülkenizi giriniz: ");
		String land = scan.nextLine();
	

		switch (land){
			case "united states" :
				System.out.println(land.substring(0,1).toUpperCase()+land.substring(7,8).toUpperCase()+
						land.substring(9,10).toUpperCase());
				break;
			case "united kingdom":
				System.out.println(land.substring(0,1).toUpperCase()+land.substring(7,8).toUpperCase());
				break;
			case "deutschland":
				System.out.println(land.substring(0,1).toUpperCase() + land.substring(1,2).toUpperCase());
				break;
			default:
				System.out.println("NA");
				
		scan.close();
			
			
			
		
		}
		
		
		
	}

}
