package day02wrapperclasses;

public class Wrapper01 {

	public static void main(String[] args) {

		//int data tipinin maximum ve minimum değerlerini bulup ekrana yazdırınız
		//int'in Wrapper Class'ı Integer dir.
		
		System.out.println(Integer.MAX_VALUE);//Bir classın içerisindeki methodlara ulaşabilmek için 
											  //class isminden sonra nokta koy ve listeden seçim yap
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		//Tüm primitivelerin max ve min değerlerini Wrapper Classlarını kullanarak ekrana yazdırınız
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
	}

}
