package day14dowhileloop;

import java.util.Scanner;

public class HA02TumSayi4ve6kati {

	public static void main(String[] args) {
		//Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç değerinden başlayıp 
		//bitiş değerinde  biten 4 ve 6 ile bölünebilen tüm tamsayıları ekrana yazdırınız.
		
		Scanner scan = new Scanner(System.in);
		
		int num1;
		int num2;
		
		do {//kullanici baslangic ve bitis degerlerini karistirir ise...
			System.out.print("Bir baslangic degeri girin: ");
			num1 = scan.nextInt();
			System.out.print("Bir bitis degeri girin: ");
			num2 = scan.nextInt();
			if(num1>num2) {
				System.out.println("Baslangic degeri bitis degerinden buyuk olamaz");
			}
		}while(num1>=num2);
		
		do {
			if(num1%4==0 && num1%6==0) {
				System.out.print(num1 + " ");
			}
			num1++;
		}while(num1<=num2);
		scan.close();	
	}

}
