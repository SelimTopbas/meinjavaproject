package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {

		// List olusturun isim list01 olsun. elemanlar integer olsun
		// List ler data type olarak primitive'leri kabul etmez
		// Primitive'lerde data type'ini non-primitive yapmak için wrapper class'ları
		// kullanırız

		List<Integer> list01 = new ArrayList<>();

//==>	bu list01'in icinde eleman olup olmadigini kontrol edelim. Bunun icin isEmpty() methodu kullanilir
		// bos ise true, dolu ise false return eder

		System.out.println(list01.isEmpty());// true, cunku ici henuz bos

		list01.add(123);
		System.out.println(list01.isEmpty());// false, cunku eleman atadik.

//==>	List den eleman silmek. remove() methodu kullanilir

		list01.add(124);
		list01.add(125);
		list01.add(124);
		System.out.println(list01);

		list01.remove(1); // index'i 1 olan elemani siliyor
		System.out.println(list01);

		list01.remove(0);
		System.out.println(list01);

		list01.remove(list01.size() - 1);// son elemani silme
		System.out.println(list01);

	}

}
