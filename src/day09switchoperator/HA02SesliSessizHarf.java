package day09switchoperator;

import java.util.Scanner;

public class HA02SesliSessizHarf {
	public static void main(String[]args) {
		
//		Kullanıcıdan bir harf alın 
//		eğer harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdırın. 
//		“b, c, d, f” den biri ise ekrana “Sessiz harf” yazdırın.
//		Bu harflerin dışında bir character için “Geçersiz character” yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Aşağıdaki küçük harflerden birini giriniz" + "\n" + "a, e, i, o, u, b, c, d, f: ");
		char ch = scan.next().charAt(0);
		
		switch(ch) {
			case 'a':
				System.out.println(ch + " bir sesli harftir");
				break;
			case 'e':
				System.out.println(ch + " bir sesli harftir");
				break;
			case 'i':
				System.out.println(ch + " bir sesli harftir");
				break;
			case 'o':
				System.out.println(ch + " bir sesli harftir");
				break;
			case 'u':
				System.out.println(ch + " bir sesli harftir");
				break;
			case 'b':
				System.out.println(ch + " bir sessiz harftir");
				break;
			case 'c':
				System.out.println(ch + " bir sessiz harftir");
				break;
			case 'd':
				System.out.println(ch + " bir sessiz harftir");
				break;
			case 'f':
				System.out.println(ch + " bir sessiz harftir");
				break;
			default:
				System.out.println("İstenilen karakterin dışında bir karakter girdiniz!");
		}
		scan.close();	
	}

}
