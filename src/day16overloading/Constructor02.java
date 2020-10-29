package day16overloading;

public class Constructor02 {

	public static void main(String[] args) {
		
		
//		1. Baska bir classtan ürettiğimiz object'i ürettiğimiz farklı bir class'da kullanabiliriz. 
//		2. Objectin özelliklerini değiştirebiliriz. Fakat bu değişim sadece o objeyle sınırlı kalır
//		Yeni üretilecek olan objectler bu değişimden etkilenmez
//		3. Eğer üretilecek her objenin değişime ugramış olmasını istiyorsanız classtaki özellikleri değiştirmelisiniz
		
		
		//Burada Constructor01 classındaki bilgileri çağırdık. burada değişiklik yapsak bile kaynak orası olduğu için,
		//değişiklik sadece bu classa (Constructor02) ait olur. Ama kaynakta hiç bir değişiklik olmaz. Hatta 
		//bu classta oluşturulan objelere ait olur. diğer objeler bundan etkilenmez. aşağıdaki iki örnek gibi...
		
		Constructor01 hondaAraba01 = new Constructor01();
		
		System.out.println("Zamli fiyat: " + (hondaAraba01.price + 1000));
		System.out.println("Year: " + (hondaAraba01.year -1));

		System.out.println("Make: " + (hondaAraba01.make.replace("Honda", "Toyota")));
		System.out.println("Type: " + (hondaAraba01.type.replace("Civic", "Camry")));
		
		Constructor01 hondaAraba02 = new Constructor01(); 
		System.out.println("yeni Zamli fiyat: " + (hondaAraba02.price + 1000));
		
	
	}

}
