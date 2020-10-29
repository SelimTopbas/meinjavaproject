package day11stringmethodsandforloops;

public class StringMethods02 {

	public static void main(String[] args) {

//====> substring()	 methodu bir Stringin belli bir bolumunu kesip almak icin kullanilir
		
		String str1 = "Java calisana kolaydir";
		
		
//====>	1. Versiyon
		
		System.out.println(str1.substring(5)); //"calisana kolaydir" verir. index 5'i dahil eder
		System.out.println(str1.substring(8)); //"isana kolaydir". Index 8 dahildir
		System.out.println(str1.substring(22));//ekranda hicbirsey goremeyiz. cunku index 22 "hicbirsey" le bitiyor
		//System.out.println(str1.substring(25));//olmayan bir yerden kesmeye calistigimiz icin "Exception" verir.
		System.out.println(str1.substring(0)); // str1.substring(0) = str1 oldugundan substring(0) hic kullanilmaz
		
//====>2. Versiyon: bir indexten baslayip bir indexte bitirmek icin. bitirisi bir sonraki indexi soyleyecegiz
		System.out.println(str1.substring(5, 13)); // ilk index dahil olur. ikinci index dahil olmaz [5; 13) gibi
		System.out.println(str1.substring(6, 12)); // alisan
		System.out.println(str1.substring(6, 6)); // ekranda hic birsey gorunmez. 
		
		
	}

}
