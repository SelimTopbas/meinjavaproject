package day16overloading;

public class Overloading01 {//Asırı yükleme

	public static void main(String[] args) {
		
		/*
		 * Iki sayinin toplamini ekrana yazdıran bir method oluşturun
		 */
		
		toplama(2,3); //Çift parametreli
		toplama(7); //1. Method. tek parametreli
		toplama(2.3, 4); //2. Method
		toplama(5,4.1); //3. Method
	}
		//Methodun body kısmını değiştirmek Methodları farklılaştırma anlamına gelmez.yeterli değil. 
	
//===============>			OVERLOADING YAPMA YOLLARI:
/*	
//==>	1.  Parametrelerin miktarını değiştirerek aynı isimli methodlar oluşturulabiliyor
//			aynı isimli method oluşturulmak istiyorsak parametrelerin miktarını değiştirerek 
//			aynı isimli method oluşturabiliriz
//NOT:      aynı adı taşıyan iki method dan birisini çağırırsak, java parametrelere bakar. çağrılanla istenen 
//			parametre miktarlardan hangisi eşitse onu alır.
//	
//==>	2.	Parametre sayısını değiştimeden herhangi bir parametrenin data type'ni değiştirerek te 
//			aynı isimli methodlar oluşturulabilir
//			parametre miktarları aynı olursa java data typlerine bakar. 
//			Data typlerden hangisi eşit ise onu alır. parametre miktarlarını kullanmaz
//NOT:		toplama(2,3); çağrısı toplama(int num1, int num2) var olduğu sürece toplama(int num1, int num2) yi kullanır
//			çünkü argument data type ile parametre data type birebir ortusuyor. 
//			Fakatr birebir ortusen data type yoksa auto wideninge
//			göre Java kullanacağı methodu secer. Auto wideninge göre kullanabileceği bir method yoksa Java hata verir
//	
//==>	3. 	!!!FARKLI data typeindeki parametrelerin yerlerini değiştirerek te aynı isimli  methodlar oluşturulabilir
	*/
	public static void toplama(int num1, int num2) {//Çift parametreli method
		
		System.out.println(num1+num2);
		
	}
	
	public static void toplama(int num1) {//1. yöntem. tek parametreli method
		
		System.out.println(num1+num1);
	}
	public static void toplama(double num1, int num2) {//2. yöntem. Sadece bir double yi değiştirdik. int aynı kaldı. çalışır
		
		System.out.println(num1+num2);
		
	}
	public static void toplama( int num2, double num1) {//3. yöntem. double ile int yerleri (2. yöntemden)değiştirildi
		
		System.out.println(num1+num2);
		
		
		
		//Method double isterken ben int, short, byte... girebilirim. ama method int isterken ben double giremem.auto widening
	}
}
