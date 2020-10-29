package day10stringmethods;

public class StringMethod02 {

	public static void main(String[] args) {

		//lastIndexOf() Methodu aradığınız karakterin String içindeki son görünümünün indexini return eder
		
		//lastIndexOf() BİRİNCİ VERSİYON
		String str1 = "Sivrihisar";
		
		System.out.println(str1.lastIndexOf('i')); // Ekrana 6 yazdırır. çünkü 'i' nin String icindeki son görünüm indexi 6 dır
		System.out.println(str1.lastIndexOf('r'));
		
		//lastIndexOf() İKİNCİ VERSİYON
		
		System.out.println(str1.lastIndexOf('i', 7)); // 7.ci characterden önceki ilk i yi buluyor
		
		//lastIndexOf() ÜÇÜNCÜ VERSİYON
		String str2 = "rivrihisari";
		System.out.println(str2.lastIndexOf("ri"));//Stringin içindeki 'ri' nin son görünümünü bulacak
													// son 'ri' deki 'r' harfinin indexini return edecek
	}

}
