package day03operators;

public class TypeCasting01 {

	public static void main(String[] args) {

		
		byte by1 = 101;
		int sayi1 = by1; //Küçük data tipini büyük data tipine çevirmek için extra bir kod yazmaya gerek yok
						// Java bunu otomatik olarak yapar. Buna Auto Widening denir
		
		System.out.println(sayi1);//101
		
		int sayi2 = 53;
		byte by2 = (byte) sayi2; //Büyük data tipini küçük data tipine çevirmek java tarafından yapılmaz. 
								//Örnekteki gibi sağ tarafa dönüştürmek istediğimiz data tipini parantez içinde yazmalıyız
		System.out.println(by2); //53
		
		double sayi3 = 23.5;
		int by3 = (int)sayi3;
		System.out.println(by3); //23
		
		
		float sayi4 = -23.9f;
		short by4 = (short)sayi4;
		System.out.println(by4); //-23
		
		double sayi5 = 4.8;
		double sayi6 = 1.4;
		double sonuc = sayi5 / sayi6;
		System.out.println(sonuc); //3.428571428571429
		
		int sonuc2 = (int)(sayi5 / sayi6);
		System.out.println(sonuc2); //3

		int sayi7 = 5;
		int sayi8 = 3;
		int sonuc3 = sayi7 / sayi8; //Normalde Sonuç=1.6666666... Lakin data tipi int olursa sadece tam kısmını görürüz
		System.out.println(sonuc3);
		
		int sayi9 = 129;
		byte by5 =   (byte) sayi9;// otomatik (byte) yazmak istiyorsak sayi9'un üzerine gelip 'add cast to by' seçeriz
		System.out.println(by5);// normalde byte'ta 256 adet sayı var. 255 bir tane 256 dan eksik olduğu için sonuç: -1
								//yani 255 i 256 ya böler. kalan -1 olur
		
			
	}

}
