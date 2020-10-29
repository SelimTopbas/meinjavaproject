package day39lambda;

import java.util.ArrayList;
import java.util.List;

public class L01 {

	// Lambda = Functional Programming
	// Normal Java = Structured Programming

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Ali");
		list.add("Can");
		list.add("Kemal");
		list.add("Mucella");
		list.add("Ayse");
		list.add("Emine");

		System.out.println(list);

		// List'in tüm elemanlarını ekrana yazdırın

		// 1. Yol: Structured Programming
		for (String w : list) {
			System.out.print(w + " ");

		}

		System.out.println();

		// 2. Yol: Functional Programming

		list.
			stream().
			forEach(t -> System.out.print(t + " "));// t -> System.out.print(t + " ") ==> Lambda Expression

		// list'in içindeki harf sayısı 5'ten az olanları yazdırınız

		System.out.println();
		// 1. Yöntem: Structured Programming
		for (String w : list) {
			if (w.length() < 5) {
				System.out.print(w + " ");
			}
		}

		System.out.println();

		// 2. Yol: Functional Programming
		list.
			stream().
			filter(t -> t.length() < 5).
			forEach(t -> System.out.print(t + " "));

		System.out.println();

		// list'in içindeki son harfi 'e' olanları ekrana yazdırınız

		list.
			stream().
			filter(t -> t.endsWith("e")).
			forEach(t -> System.out.print(t + " "));
		System.out.println();

		// list'in içindeki elemanlardan 'a' harfi içerenleri ekrana yazdırın
		list.
			stream().
			filter(t -> t.contains("a")).
			forEach(t -> System.out.print(t + " "));

		// list'in içindeki elemanlardan character sayısı 4'ten fazla olanları uppercase
		// yaparak ekrana yazdırınız
		System.out.println();
		list.
			stream().
			filter(t -> t.length() > 4).
			map(t -> t.toUpperCase()).
			forEach(t -> System.out.print(t + " "));

		
		list.
			stream().	// stream() ==> Elemanları yukarıdan aşağıya dizer
			filter(t -> t.length() > 4). // filter() ==> Belli şartlara göre eleman seçmemize yarar
			map(t -> t.toUpperCase()).	// map ==> Elemanları update etmek için kullanılır
			forEach(t -> System.out.print(t + " ")); // forEach ==> Loop'lar gibi her elemanı birer birer alarak islem yapar

		System.out.println();
		
		   //list'in icindeki elemanlarin eleman sayilarini ekrana yazdiriniz    
		list.
			stream().	
			map(t -> t.length()).
			forEach(t -> System.out.print(t + " "));
		
		//list'in icindeki elemanlardan icinde 'e' olanlarin eleman sayilarinin karesini ekrana yazdiriniz   
		System.out.println();
		list.
			stream().
			filter(t -> t.contains("e")).
			map(t -> (t.length()) * (t.length())).
			forEach(t -> System.out.print(t + " "));
		}

}
