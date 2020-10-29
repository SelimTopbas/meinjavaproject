package day06ifstatement;

import java.util.Scanner;

public class HA09PositivNegativTamSayi {

	public static void main(String[] args) {
		//Kullanıcıdan bir tamsayı alın eğer tamsayı 0 dan kucuk ise ekrana “Negatif” yazdırın.
		//0 ise ekrana “Nötr” yazdırın. 0 dan büyük ise ekrana “Pozitif” yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Bir tam sayı giriniz: ");
		int num = scan.nextInt();
		
		if (num < 0) {
			System.out.println("Negativ");
		}else if(num == 0) {
			System.out.println("Nötr");
		}else {
			System.out.println("Pozitiv");
		}
		
		scan.close();


	}

}
