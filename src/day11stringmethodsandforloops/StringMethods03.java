package day11stringmethodsandforloops;

public class StringMethods03 {

	public static void main(String[] args) {
		// concat() method concatenation yapmanin yani iki Stringi birlestirmenin diger yotemidir
		
		String str1 = "Ali";
		String str2 = "Veli";
		
		System.out.println(str1 + str2);
		System.out.println(str1.concat(str2)); // yukardaki ile asagidaki ayni sonucu verir
											
		
		System.out.println(str1.concat(str2).concat(str1)); // concat istenildigi kadar pespese kullanilabilir
		System.out.println(str1.concat(" ").concat(str2)); // Bosluk ta birakila bilir. veya araya birseyler eklenebilir
		
//====> replace() methodu var olan bir characterin butun gorunumlerinin yerine baska bir character yazmaya yarar
		// ornegin: ata ==> ana
		// tek harfliler icin tek tirnak kullanilabilir. birden fazla character icin cift tirnak kullanilmaz
		
//====> 1. Versiyon		
		String str3 = "ata";
		System.out.println(str3.replace("t", "n")); // ana. birinci karakter degistirmek istedigimiz; 
													//ikincisi ise hangisiyle degistirmek istedigimiz
		System.out.println(str3.replace('a', 'o')); // oto. tum 'a' harfini 'u' ya cevirir(tek tirnak kullandim)
		System.out.println(str3.replace("x", "y"));// x harfi olmadigi icin herhangi bir degisim yapmaz ve hata vermez
		System.out.println(str3.replace("", "y")); //yaytyay. hic bir seylerin arasina y koyar. 
		System.out.println(str3.replace("t", "")); //aa. yani 't' yi siler. 
													//bu yontem bir characteri Stringden silmek icin kullanilir 
		System.out.println(str3.replace("at", "Mustaf"));//Mustafa
		
//====> 2. Versiyon ====> replaceFirst() methodu degistirmek istedigimiz characterin sadece ilk gorunumunu degistirir
		
		String str4 = "karakartal";
		System.out.println(str4.replaceFirst("k", "K")); // Karakartal. ilk 'k' gorunumunu 'K' yapti
		System.out.println(str4.replaceFirst("a", "e")); // kerakartal
		System.out.println(str4.replaceFirst("ka", "A")); //Arakartal
		System.out.println(str4.replaceFirst("kara", ""));//kartal
		System.out.println(str4.replaceFirst("karak", "K")); //Kartal
		System.out.println(str4.replaceFirst("karakartal", "fener"));//fener
		
//Soru: 
		String text = "Ali okula gitti. Ali otobuse bindi. Ali eve geldi. Ali yemek yedi. Ali uyudu.";
		System.out.println(text.replace("Ali", "Veli"));
		
//====> replaceAll() ile replace() methodu tamamen ayni islevi gorurler. lakin replace() methodunda istenilirse 
		//tek harfli karakterler icin tek tirnak kullanula bilir. ama replaceAll() sadece cift tirnak
		
		

	}

}
