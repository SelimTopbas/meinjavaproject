package day07nestedif;

import java.util.Scanner;

public class HA01CinsiyetKontrol {

	public static void main(String[] args) {
		// Kullanıcıdan cinsiyetini girmesini isteyin.
		//Erkek ise yaşını kontrol edin. Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın. 
		//Yaşı 18 den büyük eşit ise ekrana “Adam” yazdırın.
		//Kadin ise yasini kontrol edin. Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın. 
		//Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lutfen cinsiyetinizi giriniz: ");
		String cins = scan.nextLine();
		
		if (cins.equalsIgnoreCase("Erkek")) {
			System.out.print("Yasinizi Giriniz: ");
			String yas = scan.nextLine();
			int yeniYas = Integer.parseInt(yas);
			if (yeniYas < 18) {
				System.out.println("Erkek cocuk");
			}else if(yeniYas >= 18) {
				System.out.println("Adam");
			}
						
		}else if (cins.equalsIgnoreCase("Kadin")){
			System.out.print("Yasinizi Giriniz: ");
			String yas = scan.nextLine();
			int yeniYas = Integer.parseInt(yas);
			if (yeniYas < 18) {
				System.out.println("Kiz cocuk");
			}else if (yeniYas >= 18) {
				System.out.println("Kadin");
			}
		}else {
			System.out.println("Yanlış seçim yaptınız");
		}
scan.close();

	}

}
