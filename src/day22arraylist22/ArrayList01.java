package day22arraylist22;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {

		// equals() methodu iki listin birbirine esit olup olmadığını kontrol eder
		// List'ler esit ise "true", değilse "false" return eder
		// equals() methodu aynı indexde aynı elemanın olup olmadığını kontrol eder
		// equals() methodundan true alabilmek için listler birbirinin fotokopisi gibi olmalıdır.
		// equals() methodu objelerin reference'lerine bakmaz

		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();

		System.out.println(list1.equals(list2));// true. equals() methodu adresleri kontrol etmez, sadece degerleri
												// kontrol eder

		list1.add("A");
		System.out.println(list1.equals(list2));// false. cunku "A" Stringi ekledik

		list2.add("A");
		System.out.println(list1.equals(list2));// true. ayni elemanlar mevcut

		list1.add("C");
		list1.add("D");
		list2.add("D");
		list2.add("C");

		System.out.println(list1.equals(list2));// false. çünkü elemanlar aynı olmasına rağmen aynı indextekiler eşit
												// değiller.

	}

}
