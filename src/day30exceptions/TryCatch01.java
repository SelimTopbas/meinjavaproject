package day30exceptions;

public class TryCatch01 {

	public static void main(String[] args) {

		
		int num1 = 12;
		int num2 = 0;
		
	
		
		//finally{} block, exception olsa da olmasa da her zaman calışır. 
		//finally{} block, try catch {} block tan sonra kullanılır
		try {
			System.out.println(num1/num2);
		}catch(ArithmeticException e) {//istediğimiz kadar catch kullanabiliriz. ama üstdeki, altdakinin child i olmalı
			System.out.println("Sifir ile bolme yapilamaz");
		}finally {
			System.out.println("İsleminiz bitmistir");
		}
		
		/*INTERVIEW - final, finally, finalize keywordler arasındaki farklar nelerdir
		
		   1) finally{} ==> finally block, try-cathc block'dan sonra kullanılır.
		 					Exception olsa da olmasa da çalışır
		   2) final	    ==> final keyword, Variable'larda final kullanılırsa, o variable'in değeri değiştirilemez
		  					Mesela pi sayısı final yapıldığı zaman değeri değiştirilemez.
		  					örn: final int pi = 3;
		  					
		  					Method'larda final kullanılırsa, method body'leri değiştirilemez, 
		  					dolayısıyla overriding yapılamaz
		  					
		  					Class'larda final kullanılırsa, o calss extend edilemez
		 					public final class Animal{  } ==> public class Dog extends Animal{  } dersem,
		 					'extends Animal' in altı kırmızı çizer. Yani class kısırlaşmış olur.
		 					Ama final class'in Parent'i olabilir. 
		 					
		 3) finalize() ==>  finalize methodu, Garbage Collecter'in imha edeceği dataları 
		 					imha edilecek hale getirir.
		 */
	}

}
