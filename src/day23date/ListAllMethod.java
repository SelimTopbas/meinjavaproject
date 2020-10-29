package day23date;

import java.util.ArrayList;
import java.util.List;

public class ListAllMethod {

	public static void main(String[] args) {

		//addAll() methodu  iki list't birlestirmek icin kullanilir
		//index kullanmadan addAll()kullanirsaniz ya bas veya son tarafa ekleme yaparsiniz.
		//Fakat index kullanarak addAll() kullanirsaniz, list'i istenilen index'e ekleyebiliriz
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(11);
		list1.add(12);
		System.out.println(list1);
		
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(13);
		list2.add(14);
		list2.add(15);
		System.out.println(list2);

		list1.addAll(list2);
		System.out.println(list1);//[11, 12, 13, 14, 15]
		
		list2.addAll(list1);//bir onceki degisiklik korunarak return edildi
		System.out.println(list2);//[13, 14, 15, 11, 12, 13, 14, 15]
		
		
		
		List<Integer> list3 = new ArrayList<>();
		list3.add(1);
		System.out.println(list3);//[1]
		
		List <Integer> list4 = new ArrayList<>();
		list4.add(2);
		list4.add(3);
		list4.add(4);
		System.out.println(list4);//[2, 3, 4]
		

//==>	index kullanarak addAll();		
		list4.addAll(1, list3);
		System.out.println(list4);//[2, 1, 3, 4]

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
