package day18statickeyword;

public class Static01 {

	static int en =12;
	static int boy = 10;
	static int alan; //onceki hali = int alan=en*boy;
	static double pi = 4;
//	static alan = en*boy;
	
//	Eger bir variablenin değerini olustururken hesap yapmamiz gerekirse "static block" olusturmak iyidir
//	"int alan=en*boy;" yerine static block olusturup bu islemlemleri static blockun icine yazmak daha iyidir. 
//	Bu şekilde formülleri ve variableleri koruma altına alabiliriz 
	
	static {//bu static blocktur. 
		alan = en*boy; 
		pi = 3.14;    //Static block variable'lara değer atamak için de kullanılabilir.
	}				
	
	static {
//		int x = 12; ==> boyle birsey yaparsam, x'i sadece bu blocta kullanabilirim. 
//						baska blockta kullanamam. o yuzden static variable olusturmam lazim
	}
//	Classın içinde ve methodların (main method dahil) constructorların dışında olmalı. ama önce ama sonra.
//	Static block class oluşturulduğu zaman oluşturulur ve main method dahil tüm methodlardan
//	ve constructorlardan önce çalıştırılır
//	Birden fazla static block varsa yukardan asagiya calisir. en ustteki ilk calisir
	
	public static void main(String[] args) {
		System.out.println(pi); //"pi" static variable olmasına rağmen static blockunun içindekini aldı.
	}

//INTERVIEW	- Static class oluşturulabilir ama alt claslar (inner class) static class olabilir
			//Üst classlar(outer class) static olamaz
	
//	static Keyword anlat derlerse aşağıdaki 4 başlığı anlatacağız
//	variable
//	method ==> class ismiyle methodlari cagirabiliyoruz.Static icinde static olmayanları çağıramıyoruz
//	block 
//	class
	
	public static class AltClass{
		
	}

}
