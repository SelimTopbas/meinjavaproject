package day01variables;

public class Variable02 {

	public static void main(String[] args) {
		char harf1 = 'a'; //a'nin ASCII code değeri 97
		char harf2 = 'b'; //b'nin 98
		
		System.out.println(harf1); // a
		System.out.println(harf2); // b
		System.out.println(harf1 + harf2); //cevap: 97 + 98 = 195
		
		//ab yazdırmak için aşağıdaki yöntem kullanılabilir
		System.out.print(harf1);
		System.out.println(harf2);
		
		// Bir char'in sayi degeri ASCII tablosu kullanmadan nasıl bulunur?
		//Data type'i int olan bir variable oluştur ve char'i bu variable'a ata
		
		int aCharDeger = 'a';
		System.out.println(aCharDeger); //97
		
		int unlemCharDeger = '!';
		System.out.println(unlemCharDeger);
		
		int yuzdeCharDeger = '%';
		System.out.println(yuzdeCharDeger);
		
		int yCharDeger = '*';
		System.out.println(yCharDeger);

	}

}
