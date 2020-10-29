package day38interviewhazirlik;

public class InterviewHazirlik01 {

//	1) Java "Platform Independent" proglama dilidir
//			Yani; herhangi bir platformda yazılan Java kodu diger platforlarda da çalışır
//			Örneğin; Mac bilgisayarında yazılan kod, Windowsda da çalışır

//	2) IDE ==> Integrated Development Environment. Eclipse ve IntelliJ piyasada kullanılan meşhur iki IDE'dir

//	3) Constructor ==>  * Yeni bir object uretirken Constructor aktive olur ve object'i uretir
//						* Return type'i yoktur.
//						* Ismi class ismi ile ayni olmalidir
//						* Object uretmek icin Constructor uretmek zorunda degiliz. Cunku Java her class icin 
//							default bir constructor uretmistir
//						* Default constructor'lar parametresizdir.
//						* Biz herhangi bir constructor urettiğimizde default constructor'lar yok olur
//						* Constructor'lar vorload edilebilir
//						* Constructor'lar child class'lardan çağrılabilirler, ama override edilemezler
	
	
//	4) OOP Concept nedir? ==> OOP Concept aşağıdakilerden oluşur: (Interview'de madde madde anlat)(Video ya bak)
//						a) Inheritance
//						b) Encapsulation
//						c) Polymorphism
//						d) Abstraction (Abstraction ve interface arasındaki farkı mutlaka bil. interview sorulabilir)
//						e) Interface
						
//	5) Inheritance nedir? ==> Parent(super class) - child(sub class) ilişkisidir
//							* A class'i B class'ina extends ederse, A child olur, B parent olur
//							* A class'i B interface'ine emplements ederse A child olur, B parent olur
//							* A interface'i B interface'ine extends ederse A child olur, B parent olur
//							* Child, parent'daki kodların public ve protected olanlarını kullanabilir.
//							* Reusability(bir kere yazdığını tekrar kullanabilme), short codin, maintenance(tamir) faydaları vardır.
							
//	6) Encapsulation nedir? ==> Data hiding'tir. (Data gizleme demektir)
//								* Data'lar private yapılarak gizlenir
//								* Gizlenen Data'lar getter()ile okunur, setter() ile update edilir.
//								* Değiştirilmesini istemediğimiz kodları koruma altına almak için kullanılır
//								* Maintenance faydası da vardır
//								* Kodun hiç değiştirilemsini istemiyorsa ve sadece okunmasını istiyorsak 
//									o zaman setter() oluşturmayız (Immutable class)
//								* Kodun, ne değiştirilmesini ne de okunmasını istiyorsak, getter() ve setter() oluşturmayız
	
//	7) Polymorpihsm (Çoklu yapı) nedir? ==> overloading ve overridin'tir
	
//	8) Abstract Class nedir?
//							* Abstract class üretmek için "abstract" keyword kullanmalıyız
//							* Abstract class'lardan object üretilemez. (instantiate yapılamaz)
//							* Abstract class'larda hem abstract hem de concrete methodlar bulunabilir
//							* Abstract method'un bulunduğu class, kesinlikle abstract olmalıdır
//							* Abstract methodların(body'siz) concrate child'lar tarafından override edilme
//							   zorunluluğu vardır. Concrete'ler override edilmese de olur
//		Mutlaka söyle  ==>	* (Önemli!!!) Abstract class'i, child class'ları bazı görevleri 
//							   yapmak zorunda bırakmak için oluştururuz
	
//	9) Interface nedir? 
//							* Java, normalde multiple inheritance'a müsaade etmez. 
//								Bu yüzden Abstract class kullandığımızda multiple inheritance yapamayız. 
//								Fakat bazı projelerde multiple inheritance kullanmak zorunda kalırız. 
//								Bunu Java bize interface kullanma hakkı vererek halletmiştir.
//								Çünkü interface'lere multiple implementm/extends yapılabilir
//								Detaylar Eclipse'den bak
	
//	10) Overloading nedir? 
//							* Method ismi aynı tutularak parametrelerin sayıları, yerleri veya data type'leri 
//								değiştirilerek methodlar oluşturmadır
//							* Overloading, Compile Time'dir. Yani, overloading'te yaptığımız hata kod yazarken 
//								hatalı oluşturup oluşturulmadığı belli olur
//							* Aynı isme sahip method'larla farkli islemler yapabilmek için.
//								Mesela substring(4) ve substring(4, 7) methodlarının fonksiyonları esasında aynıdır
//								İkisi de bir Stringin belli bir bölümünü almaya yarar. Fakat bazı durumlarda bitiş index'ini
//								söylemek gerekir, bazı durumlarda gerekmez. Bunun için parametreleri farklılaştırırız.
//								Bu da overloading'i doğurur
	
//	11) Overriding nedir?
//							* Method signature' (Method ismi ve Parametreler) dokunmuyoruz, sadece body'i değiştiriyoruz
//								Overriding, inheritance olunca olur. (Parent-child ilişkisi)
//							* Aynı method'un farklı kullanımları için overriding gereklidir.
//								Animal'da ses(){Ses çıkarır} ==> Dog() {Havlama} ==> Kedi(){Miyavlama}
//							* Overriding, Run Time Error verir
	
//	12) Array ile ArrayList arasındaki farklar nelerdir?
//							* Array oluşturulurken uzunluğu belli edilmek zorundadır ve daha sonra uzunluk değiştirilemez. 
//							* Fakat ArrayList'lerde başlangıcta uzunluğu belirtme zorunluluğu yoktur. Eleman ekledikçe 
//								uzunluk artar, eleman sildikçe uzunluk azalır
							
//	13) String ile StringBuilder arasındaki farklar nelerdir?
//							* String'ler immutable'dir, StringBuilder ise mutable'dir.
//							* StringBuilder class'i daha fazla kullanışlı methodlara sahiptir.
//								Mesela, bir String'i tersten yazdırmak için kullanılan reverse() methodu gibi
	
	
					
	
	
	
	
	
	
}
