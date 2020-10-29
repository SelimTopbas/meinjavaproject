package day09switchoperator;

import java.util.Scanner;

public class HA05HarfSorusu {

	public static void main(String[] args) {
//		Kullanıcıdan A, B, C, D harflerinden birini alın 
//		eğer harf C ise ekrana “Doğru cevap” yazdırın. 
//		A, B, D den biri ise ekrana “Yanlış cevap” yazdırın.
//		Bu harflerin dışındaki harfler için “Geçersiz cevap şıkkı” yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Bir cevap şıkkı girin ");
		char ch = scan.next().charAt(0);
		
		switch(ch) {
			case 'A':
				System.out.println("Yanlış Cevap");	
				break;
			case 'B':
				System.out.println("Yanlış Cevap");	
				break;
			case 'C':
				System.out.println("Tebrikler! Doğru Cevap");	
				break;
			case 'D':
				System.out.println("Yanlış Cevap");	
				break;
			default:
				System.out.println("Geçersiz Cevap Şıkkı");		
		}
		scan.close();
	}

}
