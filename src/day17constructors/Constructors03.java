package day17constructors;

public class Constructors03 {
	
	static String ad = "Selim Can"; // 14. ADIM - Aynı variable ile static oluşturuyoruz
	static int kilo = 43;						//karışmasın diye sadece isimleri değiştirdik
	
	public static void main(String[] args) {

	}
	
	public static void artirma(int yas) { // 15. ADIM - Aynı şekilde int methdou (Constructor01 classındaki gibi)
		yas++;											//Kafa karışmasın diye isimlerini değiştirdik.=artirma()
		System.out.println(yas);
	}
	
	public static void degistirme(String isim) {//16. ADIM - 15. Adım ile aynı şekilde...
		System.out.println(isim);				//Şimdi Constructor02 classına main methoda gidiyoruz(17. Adıma)		
	}
}
