package day15methodcreation;

import java.util.Scanner;

public class Tekrar {

	public static void main(String[] args) {

//==>	MethodCreation02 - Kullanici ile Saati saniyeye, mil'i kilometreye, kilogrami gram'a ceviren bir method yaziniz.
							//Bu methodu main methodun disinda olusturup main methodun icinden cagiriniz.
		
//==>	MethodCreation03 - Basit hesap makinasi
							//Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayali
							// Kullanicidan iki sayi girmesini isteyelim
							// Girlen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdiralim.
		
		
//============>	Aşağıdaki soruları çözerken metodları main methodun dışında oluşturup main methodun icinden çağırınız.
		
//==>	HA01 - Kullanıcıdan isim ve soyismini alın. Kullanıcının isim ve soyisminin ilk harflerini büyük 
				//diğer harflerini küçük harf olarak ekrana yazdıran programı yazınız.
	
//==>	HA02 - Kullanıcıdan iki sayı alın bu sayılar eşit ise ekrana “Eşit”, birinci sayı büyük ise 
				//ekrana “Birinci sayı büyük”, ikinci sayı büyük ise ekrana “Ikinci sayı büyük” yazdırınız.
	
//==>	HA03 - Kullanıcıya sayı girmesini söyleyin. Kullanıcının girdiği sayının rakamları toplamını 
				//ekrana yazdıran bir program yazın.		
		
		
				
//==>	HA04 - Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini ve iki sayı seçmesini söyleyin. 
				//Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.				
		
//==>	HA05 -  Kullanıcıya bir String girmesini söyleyin ve bu String’i yukarıdan aşağıya doğru yazdıran Program yazınız. 
				//Ornegin; CAN ==> C
							//     A 
							//	   N
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir sayi Giriniz: ");
		int num = scan.nextInt();
		
		islem(num);
		scan.close();
}
	
	public static void islem(int num) {
		
		int sum;
		
		for(sum=0; num!=0; num=num/10) {
			
			sum=sum+num%10;
		}
		System.out.println(sum);
		
		
		
		
}
}
