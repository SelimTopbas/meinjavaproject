package day06ifstatement;

import java.util.Scanner;

public class HA02SesliSessizHarf {

	public static void main(String[] args) {
		// Kullanıcıdan bir harf alın eğer harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdırın. 
		//“b, c, d, e” den biri ise ekrana “Sessiz harf” yazdırın.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Asagidaki harflerden birini girin" + "\n" + "a, e, i, o, u, b, c, d, f........:");
		char harf = scan.next().charAt(0);
		
		if (harf == 'a' || harf == 'e' || harf == 'i' || harf == 'o' || harf == 'u'){
			System.out.println("Sesli harf");
		} else if (harf == 'b' || harf == 'c' || harf == 'd' || harf == 'f') {
			System.out.println("Sessiz harf");
		}else {
			System.out.println("Yanlis secim yaptiniz");
		}
			
		scan.close();

	}

}
