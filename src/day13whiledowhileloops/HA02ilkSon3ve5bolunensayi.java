package day13whiledowhileloops;

import java.util.Scanner;

public class HA02ilkSon3ve5bolunensayi {

	public static void main(String[] args) {
		//Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde
		//biten 3 ve 5 ile bölünebilen tüm tamsayıları ekrana yazdırınız.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir baslangic degeri girin: ");
		int num1 = scan.nextInt();
		System.out.println("Bir bitis degeri girin: ");
		int num2 = scan.nextInt();
		
		if (num1>num2) { //Kullanici buyuk sayi ile kucuk sayiyi karistirirsa...
			num1=num1+num2;
			num2=num1-num2;
			num1=num1-num2;
		}
		
		while(num1<=num2) {
			if(num1%3==0 && num1%5==0) {
				System.out.println(num1);
			}
			num1++;
		}
		scan.close();	
	}

}
