package day34collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorVeForEachLoop {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();
		list1.add("X");
		list1.add("Y");
		list1.add("Z");

		System.out.println(list1);

		// Tipi Iterator interface olan iterator isimli bir obje
		// urettik, bu objeyi list1 kullanarak urettik
		Iterator<String> iterator = list1.iterator();
		// hasNext() methodu bir sonraki eleman var mı, yok mu kontrol eder
		// ==> X,Y,Z

		// Aşağıdaki kod iterator kullanarak list'deki tüm elemanları ekrana yazdırır
//		while(iterator.hasNext()) {
//			System.out.print(iterator.next());
//		}

		// for-each loop kullanarak list1 in tüm elemanlarını yazdırın
		System.out.println();

		for (String w : list1) {
			System.out.print(w);
		}

		// Iterator ile for-each loop farkı:
		// for-each loop elemanları arasında gezer ama collection'ı değiştiremez
		// iterator ise elemanlar arasında gezer ve collection'ı değiştirebilir

		// for iech loop ile değisim yapmaya calısalım. değişim olmaz
		for (String w : list1) {
			w = w + "A";
		}
		System.out.println(list1);// [X,Y,Z]

		// iterator ile değisim yapmaya calısalım. Değişim olur

		while (iterator.hasNext()) {
			iterator.next();
			iterator.remove();//remove()==>elemanları tek tek siler
		}
		System.out.println(list1);// []

	}

}
