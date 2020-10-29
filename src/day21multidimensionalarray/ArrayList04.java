package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {

	public static void main(String[] args) {

		// ["A", "C", "B", "C"] olusturun

		List<String> list = new ArrayList<>();

		list.add("A");
		list.add("C");
		list.add("B");
		list.add("C");

		System.out.println(list);

		// list'de eleman olarak "B" var mi? cok kullanilan method

		System.out.println(list.contains("B"));// eger "B" eleman olarak varsa true yoksa false reurn eder
		System.out.println(list.contains("Z"));

		// list'deki elemanlari alfabetik siraya gore diziniz
		// Collections ==> bir araya etirilmis parcalar. ayakkabilik, kalemlik
		// Bir list'deki elemanlari alfabetik siraya (natural order) dizmek icin
		// Collections classindan sort() methodu kullanilir
		// orn: Collections.sort(); argument olarak list adi yazilir

		Collections.sort(list);
		System.out.println(list);

	}

}
