package day34collections;

import java.util.Arrays;
import java.util.Scanner;

public class Review01 {

	public static void main(String[] args) {

		// Kullanicidan adini ve soyadini aliniz

		Scanner scan = new Scanner(System.in);

		System.out.print("Adınızı giriniz: ");
		String ad = scan.next();
		System.out.print("Soyadınızı giriniz: ");
		String soyAd = scan.next();

		// 1)Ad ve soyadini console’a yazdirin
		System.out.println("Adınız ve Soyadınız: " + ad + " " + soyAd);

		// 2)Sadece adini console’a yazdirin
		System.out.println("Adınız: " + ad);
		// 3)Ad ve soyadinin ilk harflerini console’a yazdirin

		System.out.println("Adınızın ilk harfi: " + ad.charAt(0));
		System.out.println("Soyadınızın ilk harfi: " + soyAd.charAt(0));

		// 4)Ad ve soyadini console’a tersten yazdirin

		StringBuilder strB = new StringBuilder(ad + " " + soyAd); // Bu şekilde StringBuilder in içine ad ve soyad ları
																	// ekledik

		System.out.println(strB.reverse().toString());// toString koysan da olur koymasan da olur

		// 5)Ad ve soyadinda kullanilan tum karakterleri alfabetik sirada
		// console’a yazdirin.
		String tamAd = ad + soyAd;
		String harfArr[] = tamAd.split("");

		Arrays.sort(harfArr);
		System.out.println(Arrays.toString(harfArr));
		
		scan.close();

	}

}
