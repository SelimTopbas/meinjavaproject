package day16overloading;

public class Overloading02 {

	public static void main(String[] args) {

	}
	
//NOTE 1: 	Return type'i degistirmek overloading icin yeterli degildir.
//			Yani iki aynı isimde methodların tiplerinden biri void diğeri int yeterli değildir.
//			body iceriğini veya return typini değiştirmek yetmez
	
//			Java methorladın farlı olup olmadıklarını anlamak için iki şeye bakar:
//			a) Method ismine 
//			b) Parametrelere bakar
//			Method ismi ve parametreler Java icin method'ların imzası gibidir
//			Javada method imzası yerine "method signature" denir
	
//NOTE 2: 	(SINAV SORUSU) Access Modifierları değiştirmek te methodları Java acısından farklı hale getirmez
// 			Cünk access modifierlar method signature dahil değildir. 
	
//NOTE 3:	Methodların Body sini değiştirmek te methodları Java açısından farklı hale getirmez.
//			Çünkü bodyler de Method Signiture dahil değildir
		
//NOTE4:(INTERVIEW)	Kodu yazarken, yani kodu çalıştırmadan önce	Java sizi yaptığınız hatalardan dolayı uyarırsa,
//					"Compile Time Error" denir
	
//NOTE5:(INTERVIEW)	Kodu yazarken, herhangi bir hata yok, fakat kodu çalıştırdıktan sonra console da
//					kırmızı hata mesajları alırsak, bu hatalara "Run Time Error" denir

//INterview Soru: Overloadin compile time error mu run time error mu?
	
	
//	public static void carpma(int num1, int num2) {
//		
//		System.out.println(num1*num2);
//	}
	
	
	
//	public static int carpma(int num1, int num2) {
//		
//		return num1*num2;
//	}
//	
//	
//	private static int carpma(int num1, int num2) {
//		
//		return num1*num2;
//	}

}
