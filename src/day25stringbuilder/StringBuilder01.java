package day25stringbuilder;

public class StringBuilder01 {

	public static void main(String[] args) {
		
//		StringBuilder class'i String uretmeye ve uretilen Stringleri manipule etmeye yarar. (manipule=degsitirmek)
		
		String str = "Ali";  
		str.substring(1);//==>value'su "li" olan bir object oluşturulur, ama str hala "Ali" olarak kalır
		
//		String class'i kullanarak String uretirsek, yaptigimiz degisiklikler ilk urettigimiz Stringi etkilemez. 
		System.out.println(str);//==>Ali
	
//		String class'ini kullanarak ürettiğiniz Strinler atamasız değiştirilemedği için String classına "immutable" denir
		
//		Ama illaki ilk ürettiğim String istersek, atama yapmak zorundayız
//		str = str.substring(1);//atama yapildi
//		System.out.println(str);//==>li
		
		
		
		
		
//		1.YONTEM
//		StringBuilder class'i kullanarak String uretirsek, yaptigimiz degisiklikler ilk urettigimiz Stringi etkiler.
//		ve atama yapmaya gerek yoktur
//		StringBuilder class'i değişimi yansıttığı için ona "mutable" denir
		
		StringBuilder strBld1 = new StringBuilder("Ahmet");
		strBld1.append("Can");//append() methodu, Stringe yeni bir String eklemek icin kullanilir(Concatenation)
		System.out.println(strBld1);
		//StringBuilder ten bir method kullanırsak, method sonrası herhangi bir atama yapmaya gerek yok
		
//		2.YONTEM
		StringBuilder strBld2 = new StringBuilder();//Bos bir String uretir ==> ""
		strBld2.append("Ali Can"); // Bos bir Stringe "Ali Can" ekledim
		
//		3.YONTEM (Çok kullanılmayan method)
		StringBuilder strBld3 = new StringBuilder(5); //Uzunlugu 5 character olan bos bir String uretildi
		
		strBld3.append("Ali"); //ilk 3 karakter doldu, ama son iki karakter boş
		strBld3.append("Canan");//iki boşumuz vardı. onları doldurur ve 3 yer daha oluşturur. mutable dir. 5 dedikten sonra az da 
									//çok ta karakter kullanabilirim

		
	}

}
