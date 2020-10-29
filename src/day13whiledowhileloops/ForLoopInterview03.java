package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview03 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin
		//bu sayinin tersinin iki fazlasini ekrana girin

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir sayi giriniz: ");
		String num = scan.next();
		
		String ters = ""; //Nasil ki int icin (int sum=0) ve for dongusu icin (sum=sum+i) yaziyorduk; oyle de
							//String'ler icin (String ters="") ve for dongusu icin 'ters=ters+num.charAt(i)' yaziyoruz
		
		for(int i=num.length()-1; i>=0; i--) {
			ters = ters + num.charAt(i) ; //char'i Stringe cevirmek icin sonuna +"" ekleyebiliriz. ama biz eklemedik :)
			
		}
		//System.out.print(ters);
		
		int tersInt = Integer.valueOf(ters); //Stringi sayiya cevirdik
		tersInt += 2;
		System.out.println(tersInt);
		
		scan.close();
		
	}

}
