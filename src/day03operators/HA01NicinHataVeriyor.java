package day03operators;

import java.util.Scanner;

public class HA01NicinHataVeriyor {

	public static void main(String[] args) {


		/* Niçin hata veriyor. Bu hatayı farklı iki yolla çözünüz
		 * float num1 = 3.23;
		 * double num2 = 3.23;
		 */
		
		float num1 = 3.23f;
		double num2 = num1;
		System.out.println(num2);
		
		double num3 = 3.23;
		float num4 = (float) num3;
		System.out.println(num4);
		
		//double 100.235 i int’e çevirip ekrana yazdiriniz.
		
		double sayi1 = 100.235;
		int sayi2 = (int) sayi1;
		System.out.println(sayi2);
		
		//int data type’ında oluşturulan 5 sayısı ile double data type’ında oluşturulan
		//6.2 sayısını toplayıp sonucu ekrana yazdırınız.
		
		double sayi3 = 6.2;
		int sayi4 = 5;
		double sayi5 = sayi4;
		System.out.println(sayi5 + sayi3);
		
		/*Kullanıcıdan ad, soyad ve adresini alıp ekrana yazdıran bir program yazınız.
		Ad ve soyad ilk satırda, adres ikinci satırda olsun.
		(String kullanınız)
		*/
		System.out.println("---------------------------------");
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Adınızı ve Soyadınızı giriniz: ");
		String isim = scan.nextLine();
		
		System.out.print("Adresinizi giriniz: ");
		String adres = scan.nextLine();
		
		System.out.println("Girilen Bilgiler: " + '\n' + "Adınız ve Soyadınız: " + isim + '\n' + "Adresiniz: " + adres);
		
		
		scan.close();

	}

}
