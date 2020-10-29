package day21multidimensionalarray;

public class SplitMethodSoru {

	public static void main(String[] args) {
		// Verilen bir cumledeki bosluklar haric karakter sayisini bulunuz
		
		//1. yol interview icin ideal olan yol
		String str = "Verilen bir cumledeki bosluklar haric karakter sayisini bulunuz.";
		
		str = str.replace(" ", "");
		
		String harf[] = str.split("");
		System.out.println(harf.length);
		
		//2.yol
		//Herzaman bosluk sayısı kelime sayısından bir azdır
		//Bosluk sayısı = kelime sayısı - 1
		
		String str2 = "Verilen bir cumledeki bosluklar haric karakter sayisini bulunuz.";
		String kelime[] = str2.split(" ");
		int boslukSayisi = kelime.length-1;
		
		String character[] = str2.split("");
		
		System.out.println(character.length - boslukSayisi);
		
	}

}
