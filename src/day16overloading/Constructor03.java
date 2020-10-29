package day16overloading;

public class Constructor03 {
//Aşağıdakiler class variable ler
	String isim = "Ali Can";
	int yas = 33;
	int kilo = 85;
	String meslek = "Automation Tester";
	boolean emekli = false;
	
	//1. Adım: Şimdi constructor oluşturuyoruz. Javanın default oluşturduğu constructor ortandan kalkacak.
	// Constructorlar her zaman Main methodun dışında olur
	Constructor03(){ //==> default constructor. içi boş ve parametresiz
	
	}
	//3. Adım Şimdi yeni bir constructor oluşturuyoruz
	Constructor03(String isim, int yas, boolean emekli){ 
		this.isim = isim;
		this.yas = yas;
		this.emekli = emekli;
	}
	//5. Adım Şimdi sadece isim constructoru oluşturuyoruz
		Constructor03(String isim){ 
			this.isim = isim;
		}
	
	public static void main(String[] args) {

		//2. Adım: Şimdi Obje oluşturuyoruz. Her zaman main methodun içinde
		Constructor03 insan01 = new Constructor03();
		System.out.println(insan01.isim );//Ali Can
		
		//4. Adım yeni bir obje oluşturuyoruz. ikisinin farkı parametreler
		Constructor03 insan02 = new Constructor03("Ayhan Yıldız", 53, true);
		System.out.println(insan02.isim);
		System.out.println(insan02.yas);
		System.out.println(insan02.emekli);
		
		//6.Adım:  5. adımın constructoru
		Constructor03 insan03 = new Constructor03("Ayse Yıldız"); //Burada sadece ismini değiştirdik . 
		System.out.println(insan03.isim);						  //diğer bilgilerine dokunmadık
	}

}
