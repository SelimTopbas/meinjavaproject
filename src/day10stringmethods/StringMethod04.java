package day10stringmethods;

public class StringMethod04 {

	public static void main(String[] args) {

		//contains() Methodu bir Stringin içinde bir characterin olup olmadığını kontrol eder
		//eğer o character Stringin içinde varsa true yoksa false return eder
		//çok kullanılan bir method
		
		
		String str1 = "karakartal";
		System.out.println(str1.contains("m")); //contains() methodun içi her zaman String olmalı. 
												//false, çünkü karakartalın içinde 'm' yok
		System.out.println(str1.contains("kar"));
		
		
		//trim() methodu bir Stringin sadece bas ve sonundaki boslukları siler. ortadaki boşlukları silmez
		
		String str2 = "        Ali Can     ";
		System.out.println("trim() kullanmadan önce : " + str2);
		System.out.println("trim() kulandıktan sonra :" + str2.trim());
		
		
		
		// isEmpty() bir Stringin içinde character olup olmadığına bakar
		//character yoksa true, varsa false return eder 
		
		String str3 = "Ali";
		System.out.println(str3.isEmpty());// false, çünkü String boş değil. character var
		
		String str4 = " ";
		System.out.println(str4.isEmpty());// false, cünkü space java icin bir characterdir
		
		
		String str5 = "";
		System.out.println(str5.isEmpty());// true, çünkü hic character yok
		
		//NOTE: isEmpty() true çikarsa length 0 dır
	}

}
