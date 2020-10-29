package day13whiledowhileloops;

import java.util.Scanner;

public class HA03SayininBolenleri {

	public static void main(String[] args) {
		//  Kullanıcıdan bir sayı alın ve bu sayının bölenlerini ekrana yazdırınız. 
		//Ornegin; 12'nin bölenleri 1, 2, 3, 4, 6, 12 dir.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir sayi girin: ");
		int num = scan.nextInt();
		
		int i = 1;
		while(i<=num) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
			i++;
		}
//		
//		for(int bolen=1; bolen<=num; bolen++) {
//			if(num%bolen==0) {
//				System.out.print(bolen+" ");
//			}
//		}
		scan.close();
	}

}
