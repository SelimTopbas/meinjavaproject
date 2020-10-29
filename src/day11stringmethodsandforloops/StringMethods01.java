package day11stringmethodsandforloops;

public class StringMethods01 {

	public static void main(String[] args) {

//====> startsWith() methodu bir Stringin istenen harfle baslayip baslamadigini 
		//kontrol eder. Istenen harfle basliyor ise true, baslamiyor ise false return eder.
		
		String str1 = "Ali Can";
		
//====> startsWith() 1. Versiyon
				
		System.out.println(str1.startsWith("A")); // true		
		System.out.println(str1.startsWith("C")); // false. Cunku C ile baslamiyor
		System.out.println(str1.startsWith("a")); // false. Cunku kucuk a ile baslamiyor
		System.out.println(str1.startsWith("B")); // false. Cunku B yok
		
		// Birden fazla Stringe de bakilabilir
		
		System.out.println(str1.startsWith("Ali")); // true	
		
//====> startWith() 2. Versiyon
		
		System.out.println(str1.startsWith("a", 3));   //false. index 3 e gidecek ve bakacak. 
													   //index 3 'a' ile basliyor mu diye.	
		System.out.println(str1.startsWith("a", 5));   //true. index 5 'a' ile basliyor
		System.out.println(str1.startsWith("Can", 4)); //true
		
//====> endsWith() methodu bir Stringin istenen harfle bitip bitmedigini 
		//kontrol eder. Istenen harfle bitiyor ise true, bitmiyor ise false return eder.
		
		
		String str2 = "Ayse Canan";
		System.out.println(str2.endsWith("n")); //true
		System.out.println(str2.endsWith("Canan")); //true
		System.out.println(str2.endsWith("CANAn"));//false
		System.out.println(str1.endsWith("")); //"" ve " " tamamiyle farklidir. ikincinin icinde bosluk var.
											   //birincinin icinde hicbirsey yok. true
		
		String str3 = "Ali ";
		System.out.println(str3.endsWith(" "));
		System.out.println(str3.endsWith("")); // hicbirsey ile mi bitiyor? evet. hicbirsey ile bitiyor
		
		
	}

}
