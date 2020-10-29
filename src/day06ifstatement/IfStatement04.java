package day06ifstatement;

public class IfStatement04 {

	public static void main(String[] args) {
		// Bir tane Strin variable olusturun ve bir gun ismini kucuk harflerle deger olarak atayin
		// Eger atadiginiz deger hafta ici gunlerinden biri ise
		// ekrana “hafta ici” yazdirin.
		// Eger atadiginiz deger hafta sonu gunlerinden biri ise
		// ekrana “hafta sonu” yazdirin.

String gun = "persembe";

if (gun.equals("pazar") || gun.equals("cumartesi")) {
	System.out.println("Hafta sonu");
	
}

if (gun.equals("pazartesi")  || gun.equals("sali")|| gun.equals("carsamba") || gun.equals("persembe") || gun.equals("cuma")) {
	System.out.println("Hafta ici");

	
}

	}

}
