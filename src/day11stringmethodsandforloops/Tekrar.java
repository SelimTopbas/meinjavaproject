package day11stringmethodsandforloops;

import java.util.Scanner;

public class Tekrar {

	public static void main(String[] args) {
		
//		String paraErkek = "1900";
//		String paraKadin = "2000";
		 //Bu ailenin toplam gelirini bulunuz
		
	

		
//==>ForLoop01	//6, 5, 4, 3, 2, 1 i ekrana yazdiran bir for loop olusturun
		
		
//==>	//3, 4, 5, 6, 7, 8 i ekrana yazdiran bir for loop olusturun
		
//==>	//ilk 100 sayma sayisini 1 den 100 e kadar ekrana yan yana aralarinda bosluk olacak sekilde yazdirin
		
//==>	//ilk 100 sayma sayisini 100 den 1 e kadar ekrana yan yana aralarinda bosluk olacak sekilde yazdirin
		
//==>	//ilk 50 cift sayma sayisini ekrana yan yana yazdirin

//==>	//ilk 50 tek sayma sayisini ekrana yan yana yazdirin

//==>ForLoop02	//100 den kucuk 3'un kati sayma sayilarini  ekrana yazdirin
		
//==>	//ilk bes sayma sayisinin toplamini veren program'i for loop ile yaziniz

//==>	//10 dan buyuk ilk uc sayma sayisinin toplamini veren for loop yaziniz
		
//==>	//20 den buyuk ilk 5 ayma sayisini veren for loop olusturunuz

//==>	//ilk 50 sayma sayisinin toplamini veren for loop olusturunuz
	
//==>	//5'e bolunebilen 100den kucuk sayma sayilarin toplamini ekrana yazdirin(for loop)		

//==>	//ilk 4 sayma sayisinin carpimini veren for loop olusturunuz		
		
//==>	//9! bulun
		
//==>	HA01 - Kullanıcıdan başlangıç ve bitiş değerlerini alın ve 
//			 	başlangıç değerinden başlayıp bitiş değerinde biten tüm tamsayıları ekrana yazdırın.		
		
		
		
//==>	HA02 - Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden veya sonrasından başlayıp 
//			 	bitiş değerinde veya öncesinde biten tüm çift tamsayıları ekrana yazdırın.		

//==>	HA03 - Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden veya sonrasından başlayıp 
//			 	bitiş değerinde veya öncesinde biten tüm 3 ile bölünebilen tamsayıları ekrana yazdırın.

//==>	HA04 - Kullanıcıdan başlangıç ve bitiş değerlerini alın ve 
//				başlangıç değerinden başlayıp bitiş değerinde biten tüm tamsayıların toplamını ekrana yazdırın.
		
//==>	HA05 - Kullanıcıdan başlangıç ve bitiş değerlerini alın ve 
//				başlangıç değerinden başlayıp bitiş değerinde biten tüm tamsayıların çarpımını ekrana yazdırın.	

//==>	HA06 - Kullanıcıdan başlangıç ve bitiş harflerini alın ve 
//				başlangıç harfinden başlayıp bitiş harfinde biten tüm harfleri büyük harf olarak ekrana yazdırın.
		
		char bas;
		char son;
		Scanner scan = new Scanner(System.in);
		
			System.out.print("Bir baslangic degeri giriniz: ");
			bas = scan.next().toUpperCase().charAt(0);
			System.out.print("Bir bitis degeri giriniz: ");
			son = scan.next().toUpperCase().charAt(0);
			
			
			for(char i=bas; i<=son; i++) {
				
				System.out.println(i);
			}
		
		scan.close();
	}

}
