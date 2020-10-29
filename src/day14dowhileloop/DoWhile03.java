package day14dowhileloop;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		// Kullanicidan sayi alin
				// Sayi 10 dan kucuk ise ekrana "Kazandiniz" yazdirin
				// Sayi 10 veya 10 dan buyuk ise ekrana "Bir sayi giriniz" yazdirin.

		Scanner scan = new Scanner(System.in);
		int num = 0;
		do {
		System.out.print("Bir sayi girin: ");
		num = scan.nextInt();
		}while(num>=10);//eger sayı 10 dan büyük olursa do while döngüsü devam edecek ve tekrar 'bir sayı giriniz' diyecek.
						//burada false verince program kırılacak ve sonraki codu çalıştıracak. 
						//benim amacım o düngüden çıkıp alt satırı çalıştırmak.
						//yani false alarak döngüyü kıracağım ve aşağı çalışacak
						
		System.out.println("Kazandınız");
	
		scan.close();
		
		
	}

}
