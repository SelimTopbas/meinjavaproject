package day25stringbuilder;

public class StringBuilder02 {

	public static void main(String[] args) {
		
		// substring() methodu atama yapmadan Stringi değiştirmez

		StringBuilder str1 = new StringBuilder("animals");
		
		
//		str1 = str1.substring(3); hata verir, çünkü substring()methodu String classından gelir ve bir String return eder.
//		Halbuki str1 String değil StringBuilder'dir. Java, data type leri uyuşmadığından dolayı atamayı kabul etmez.
//		Bu hatadan kurtulmak için iki yol var.
//		1. Yol: String classından farklı bir isimde yeni bir  String oluşturup ona atama yapıyoruz.

		String str2 = str1.substring(3); 
		System.out.println(str2);
		
//		2. Yol:  str1.substring(3); ifadesini System.out.println(str1.substring(3)); şeklinde yazdırabiliriz
		System.out.println(str1.substring(3));
		
		
		
		
		System.out.println(str1.substring(1, 4)); //nim
		
//		indexOf() methodu belli bir character'in index'ini return eder
		System.out.println(str1.indexOf("m"));
		
//		length() methodu String classindna gelir ve Stiringin uzunluğunu return eder
		System.out.println(str1.length());//7
		
//		charAt()methodu belli bir indexteki chracteri returneder
		System.out.println(str1.charAt(5));//l return eder
		
//		insert() istenen indexe istenen characteri eklemeye yarar. Bu methodu append() gibi StringBuilder i direk değiştirir
		str1.insert(0, "X"); // atama yapmaya gerek yok
		System.out.println(str1);
		
//		delete() istenen index aralığındaki characteri siler
		str1.delete(0, 1);// atamaya gerek yok
		System.out.println(str1);
		
//		deleteCharAt() istenen indexteki characteri siler. Atama yapmaya gerek yok
		str1.deleteCharAt(6);
		System.out.println(str1);
		
//		reverse()methodu tersten yazdırır
		str1.reverse();
		System.out.println(str1);
		
//		toString() methodu StringBuilder'i Stringe çevirmek için kullanılır
		str1.toString();// artık str1 String tir
		
//		MÜLAKAT SORUSU
//		StringBuilder Javanın 5. versiyonunda oluşturuldu. StringBuffer'lar StringBuilder'in eski versiyonu ve
//		String builder lar daha hizli çalışır. Bu yüzden StringBuilder kullanmayı tercih ederim
		
		
		
 		
		
		
	}

}
