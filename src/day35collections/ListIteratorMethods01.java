package day35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods01 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list); // [A, B, C]

		// List iterator olusturma(list içerisinde gezip elemanlar üzerinde oynayacağım
		// bir List. bu daha zengin)

		ListIterator<String> listIterator = list.listIterator();// elemanlar arası gezmek için her zaman while döngüsü
																// kullanıyoruz
		while (listIterator.hasNext()) {
			Object element = listIterator.next(); // return ettiklerini element e atama yapacak.
			System.out.print(element + " ");
		}

		System.out.println();

		while (listIterator.hasPrevious()) {// next()methodun tam tersini yapıyor. tersten geziyor ve return ediyor
			Object element = listIterator.previous();
			System.out.print(element + " ");
		}

		// hasPevious() ve previous() methodlarını kullanarak bir listin elemanlarını
		// tersten yazdırmak istersek mutlaka ilk önce hasNext() ve next()
		// kullanmalıyız

	}

}
