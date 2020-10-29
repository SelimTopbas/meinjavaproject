package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {

	public static void main(String[] args) {
		// ["Ali", "Can", "Ayse", "Ali"] olusturun

		List<String> list = new ArrayList<>();

		list.add("Ali");
		list.add("Can");
		list.add("Ayse");
		list.add("Ali");

		System.out.println(list);

		list.remove("Ali");
		System.out.println(list);

		System.out.println(list.remove("Ali"));// true verir ve "Ali" yi siler
		System.out.println(list.remove("Selim"));// false verir çünkü "Selim" diye array yok

		list.remove("Kemal");// remove() methodu listede olmayanlar için hata vermez
		System.out.println(list);
		// int de yaptığımızda hata mesajı vermişti. çünkü int değerlerini index
		// algılıyor. ama burada String. hata yok

		System.out.println(list.remove(0)); // index'i 0 olan elemanı (Can) siler ve sildiğini (Can) yazdırır

//==>	"Ayse" elemanını "Aysegul" yapalım. set() methodu kullanilir

		list.set(0, "Aysegul");
		System.out.println(list);

		// list'e "Kenan" ve "Zeynep" ekleyin

		list.add("Kenan");
		list.add("Zeynep");
		System.out.println(list);
		

//==>	tum listeyi silme. clear() methodu
		list.clear();
		System.out.println(list.isEmpty());// sildiğimizden emin olmak için bu yöntem kullanılır
		System.out.println(list);

	}

}
