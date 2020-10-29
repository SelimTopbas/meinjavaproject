package day06ifstatement;

public class IfStatement03 {

	public static void main(String[] args) {

		// Bir char variable olusturun ve bir buyuk harf deger atayin
		// Eger atanan deger, haftanin gunlerinden herhangi birinin ilk harfi ise o gunleri yazdirin
		// Eger atanan deger, haftanin gunlerinden herhangi birinin ilk harfi degil ise 
		// ekrana “Boyle bir gun yok” yazdirin.
		char gun = 'x';
		
		if (gun == 'P') {
			System.out.println("Pazartesi, Persembe, Pazar ");
		}
		if (gun == 'S') {
			System.out.println("Sali ");
		}
		if (gun == 'C') {
			System.out.println("Carsamba, Cuma, Cumartesi");
		}
		if (gun != 'P' && gun != 'S'&& gun != 'C' ) { 
			// && isleminden true sonucu almak icn tum condition'lar true olmalidir (video 07:54)
			// || (pipe) isleminden True sonucu almak icin birtanesinin true olmasi yeterlidir
			System.out.println("Boyle bir gun yok!");
			
			// "P" olmamak VEYA "C" olmamak VEYA "S" olmamak ==> VEYA islemi icin || ==> | -> Pipe denir
	        // VEYA isleminden True sonucu alabilmek bir tanesinin True olmasi yeterlidir
	        // True||True = True <-> True||False = True <-> False||False = False
	        // True=1, False=0 ==> VEYA islemi toplamaya benzer
	        
	        
	        // "P" olmamak VE "C" olmamak VE "S" olmamak ==> VE islemi icin &&
	        // VE isleminden True sonucu alabilmek icin tum condition'lar true olamalidir
	        // True && True = True <-> True && False = False <-> False && False = False
	        // True=1, False=0 ==> VE islemi carpmaya benzer

		}
	}

}
