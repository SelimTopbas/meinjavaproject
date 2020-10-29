package day39lambda;

import java.util.ArrayList;
import java.util.List;

public class L02 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(9);
		list.add(13);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(4);
		list.add(12);
		list.add(15);
		
		//Tüm çift sayı olan elemanların küplerini ekrana yazdırınız
		list.
			stream().
			filter(t -> t % 2 == 0).
			map(t -> t * t * t).
			forEach(t -> System.out.print(t + " "));
		
		//list'deki tüm elemanların toplamını ekrana yazdırın
		System.out.println();
		int result01 = list.
							stream().
							reduce(0, (t,u) -> t + u);
		System.out.println(result01);
		System.out.println();
		
		//Tüm tek sayı olan elemanların çarpımını ekrana yazdırınız
		int result02  = list.
							stream().
							filter(t -> t % 2 == 1).reduce(1, (t,u) -> t * u);
			
		System.out.println(result02);
			System.out.println();
			
			
		
		//list'deki 3'e bölünebilen elemanların 2 fazlalarının toplamını bulunuz ve çarpımını ekrana yazdırınız
		int result03  = list.
				stream().
				filter(L02::isDivisibleByThree). // aşağıda method oluşturduk. onu çağırdık.
				map(t->  t+ 2).
				reduce(0, (t,u) -> t + u);

		System.out.println(result03);
		
		//list'deki tekrarı olmayan elemanları ekrana yazdırınız
		
		list.
			stream().
			distinct().
			forEach(System.out::println);//t -> System.out.print(t + " ") ==> Lambda Expression kullanıla bilir
										 // mümkünse 'Method Reference kullanmak iyidir'
										// Methad Reference ==> Class Ismi :: Method Ismi
		
		
		
	}
	
	private static boolean isDivisibleByThree(int t) {
		return t%3==0;
	}
	
}
