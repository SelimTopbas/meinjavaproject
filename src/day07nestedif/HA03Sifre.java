package day07nestedif;

import java.util.Scanner;

public class HA03Sifre {

	public static void main(String[] args) {
		//Kullanıcıdan password girmesini isteyin.
		//Girdiği password 5’e bölünüyorsa son rakamını kontrol edin. 
		//Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın. 
		//Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
		//Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lutfen Sifrenizi giriniz: ");
		int sifre = scan.nextInt();
		
		if (sifre % 5 == 0) {
			if (sifre % 2 == 0){
				System.out.println("5'e bolunebilen cift sayi");
			}else if (sifre % 2 != 0) {
				System.out.println("5'e bolunebilen tek sayi");
			}
		}else {
			System.out.println("Tekrar Deneyin");
		}
		scan.close();

	}

}
