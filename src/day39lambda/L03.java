package day39lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class L03 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Ali");
		list.add("Mark");
		list.add("Jackson");
		list.add("Amanda");
		list.add("Ali");
		list.add("Mark");
		
		//List elemanlarından tekrarlı olanları 1 kere yazmak şartıyla ekrana alfabetik sıralı olarak yazdırıdınız
		list.
			stream().
			distinct().
			sorted().
			forEach(System.out::println);
		
		System.out.println("------------");
		
		//List elemanlarından tekrarlı olanları 1 kere yazmak şartıyla ekrana elemanları uzunluklarına göre sıralayarak yazınız
		list.
			stream().
			distinct().
			sorted(Comparator.comparing(t -> t.length())).
			forEach(System.out::println);
		
		System.out.println("------------");

		//List elemanlarından tekrarlı olanları 1 kere yazmak şartıyla ekrana elemanların sonr harflerine göre sıralayarak yazdırınız
		list.
			stream().
			distinct().
			sorted(Comparator.comparing(t -> t.substring(t.length()-1))).
			forEach(System.out::println);
		
		System.out.println("------------");

		//List elemanlarından tekrarlı olanları 1 kere yazmak şartıyla ekrana alfabetik sıraya göre ters yazdınızı
				list.
					stream().
					distinct().
					sorted(Comparator.reverseOrder()).
					forEach(System.out::println);
		
	}

}
