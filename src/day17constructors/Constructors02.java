package day17constructors;

public class Constructors02 {
	public static void main(String[] args) {
		
		Constructors01 obj1 = new Constructors01(); //==> 8. ADIM - Obje urettik. Artık bu obje üzerinden 
																	//Constructor01 classındaki buyume() methoduna ulaşabilirim
												
//==>	//buyume(); 7. ADIM - Constructor01 classından buyume() methodu nu çağırıyoruz ama Java bunu kabul etmedi. 
//							  çünkü bu classta değil. Constructor01 classında. (Kırmızı Hata verdiği için yorum yaptım)
//							  Eğer başka bir classdaki methodu kullanmak istiyorsak, o classta(yani Constructor02 de) 
//							  bir tane object oluşturup, o obje sayesinde istediğimiz methodu kullanabiliriz
			
		obj1.buyume(33); //9. ADIM - Method ismiyle ulaşamadım. ama obje ile buyume()methoduna ulaşabildim. (Değer vererek çalışıyor)
//				|			Yani burada Constructor02 classından, Constructor01 classındaki methodu kullandım. (10.Adım en aşağıda)
//				|
//				|------->	buyume() methodu static olduğundan(Constructor classındaki) Java object kullanarak buyume() methodunu 
//							çağırmamızı istemez ve codun altı sarı renkle çizilir. O yüzden aşağıdaki gibi çağıracağız. sırası gelecek
//							==>Sarı uyarı rengi gitsin diye yoruma aldım. 
		Constructors01.buyume(45);
		
//		22.ADIM - (11. ve 9. Adım ile alakalı)-isimDegistir() methodu static olduğundan Java object kullanarak 
//					isimDegistir() methodunu çağırmamızı istemez ve codun altı sarı renkle çizilir. 
//					(Hem static hem obje olarak çağırıyoruz. Olmaz! Class üzerinden çağrılmalı) 
		
		obj1.isimDegistir("Kemal Can"); //11.ADIM    ==> Sarı renk gitsin diye yoruma aldım
		
		Constructors01.isimDegistir("Merhaba Naci"); // 23.ADIM - 22. adımda anlatılıyor. 24. adım not olarak aşağıda.
		
		System.out.println(obj1.isim);//Ali Can - //12.ADIM - obj1 üzerinden isim variablesine ulaşabiliyoruz. Ali Can-çünkü 
//													bu isim değişken Constructors01 classında Ali Can diye tanımlı. Değişiklik olmadı
		System.out.println(obj1.yas);//33 		//13.ADIM -  12. Adım ile aynı...
												//14.ADIM Constructor03 Classında. Static değer ile yapacağız
		
//		17.ADIM - Şimdi ben bu Class'tan Constructor03 deki methodları kullanmak istiyorum. ilginç olan, daha herhangi bir 
//					obje oluşturmadan ordaki variablelere ve methodlara ulaşabiliyorum. çünkü variableler static.==>18.Adım
		
		System.out.println(Constructors03.ad);//Selim Can //18.ADIM. Görüldüğü gibi Constructors03 teki variableye ulaşabildim
		
//		19.ADIM - Bir variable veya method static olarak oluşturulmuşsa, o variable veya methoda object oluşturmadan 
//				sadece class ismini kullanarak ulasabilirsiniz
		
		System.out.println(Constructors03.kilo);//43 //20.ADIM
		
//		21. ADIM - Aşağıdaki iki methodlara da ulaşabiliyoruz.
		
		Constructors03.artirma(45);//46, çünkü constructors03 classında artırma methodunda yas++ yazmıştık. bir arttı
		Constructors03.degistirme("Ayse Topbas");//değiştirme kullandık. Ayse Topbas yazacak
	}
//==> 10. ADIM - Kısacası, Constructor01 classından Constructors02 classında obj1 adında bir object ürettim. Biz Constructor01 classından 
//			buyume() methodunu istiyoruz. Constructor01 classı da bizi Constructor02 classında ürettiğimiz obj1 e yönlendiriyor.
//			Tabiri caizse buyume() methodu her ne kadar Constructor01 classında bulunuyorsa da, obj1 objesini oluşturduğumuz anda 
//			Java onları buyume() methodu gibi methodları ve variableleri (isim, yas gibi) obj1 e asılı vaziyete alıyor. 
//			ve biz bu şekilde buyume() methoduna ve variablelere ulaşabiliyoruz.
	
//==> 24.ADIM - 10. adımdaki gibi static olmayan variableler ve methodlar objectlere asılı duruyor. Ama static olan variableler 
//			ve methodlar objelere değil classlara asılı duruyor. o yüzden variablelere ve methodlara objeler üzerinden değil de 
//			classlar üzerinden ulaşıyoruz. 25. Adım Constructor04 te
	
}
