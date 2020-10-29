package day09switchoperator;

import java.util.Scanner;

public class HA03BasamakliTamSayi {

	public static void main(String[] args) {

//		Kullanıcıdan bir tamsayı alın 
//		eğer tamsayı 9 ise ekrana “Bir basamaklı en büyük sayı” yazdırın. 
//		99 ise ekrana “İki basamaklı en büyük sayı” yazdırın.
//		999 ise ekrana “Üç basamaklı en büyük sayı” yazdırın.
//		Bu sayıların dışındaki sayılar için “Yorum yok” yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Bir tam sayı giriniz: ");
		int num = scan.nextInt();
		
		switch (num) {
			case 9 :
				System.out.println("Bir basamaklı en büyük sayı");
				break;
			case 99 :
				System.out.println("iki basamaklı en büyük sayı");
				break;
			case 999 :
				System.out.println("Üç basamaklı en büyük sayı");
				break;
			default:
				System.out.println("keine Kommentare!");				
		}
		scan.close();
	}

}
