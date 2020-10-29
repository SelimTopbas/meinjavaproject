package day09switchoperator;

import java.util.Scanner;

public class HA04KacGunCekenAylar {

	public static void main(String[] args) {

//		Kullanıcıdan ay ismi alın 
//		eğer ay ismi 31 çeken aylardan biri ise ekrana “Bu ay 31 gündür” yazdırın. 
//		Eğer ay ismi 30 çeken aylardan biri ise ekrana “Bu ay 30 gündür” yazdırın.
//		Eğer ay ismi 28 veya 29 çeken aylardan biri ise ekrana “Bu ay Şubat ayıdır” yazdırın.
//		Bu isimlerin dışındaki isimler için “Geçersiz ay ismi” yazdırın.
		

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Bir ay ismi giriniz: ");
		String ay = scan.next();
		
		switch(ay.toLowerCase()) {
		case "ocak":
			System.out.println(ay + " ayı 31 gündür");
			break;
		case "subat":
			System.out.println(ay + " ayı 28 gündür. Lakin 4 yılda bir 29 çeker. 29 Çeken yıla 'Artık Yıl' diyoruz");
			break;
		case "mart":
			System.out.println(ay + " ayı 31 gündür");
			break;
		case "nisan":
			System.out.println(ay + " ayı 30 gündür");
			break;
		case "mayis":
			System.out.println(ay + " ayı 30 gündür");
			break;
		case "haziran":
			System.out.println(ay + " ayı 30 gündür");
			break;
		case "temmuz":
			System.out.println(ay + " ayı 31 gündür");
			break;
		case "agustos":
			System.out.println(ay + " ayı 31 gündür");	
			break;
		case "eylul":
			System.out.println(ay + " ayı 30 gündür");
			break;
		case "ekim":
			System.out.println(ay + " ayı 30 gündür");
			break;
		case "kasim":
			System.out.println(ay + " ayı 30 gündür");
			break;
		case "aralik":
			System.out.println(ay + " ayı 31 gündür");
			break;	
			
		default:
			System.out.println("Gecerli Ay ismi giriniz");
		
		}
		scan.close();
	}

}
