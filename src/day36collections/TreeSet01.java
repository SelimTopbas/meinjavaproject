package day36collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {
		// TreeSet: 1) HashSet ile hemen hemen aynıdır. Duplicatuon'a musaade etmez,
		// 				key-value yapısı kullanır
		//			2) TreeSet, elemanlarını natural order'a göre dizer
		//				HashSet ise elemanları rastgele dizer
		//			3) HashSet elemanları sort etmediği için TreeSet'e göre daha hızlıdır.
		//			4) Natural Order'a sahip bir Set lazım olduğunda HashSet oluşturulur ve elemanlar eklenir 
		//				sonra bu HashSet TreeSet'e dönüştürülür. Böylelikle TreeSet'in hız problemi halledilir
		//				Natural orde'a sahip bir Set lazım olduğunda direkt TreeSet oluşturma genellikle kullanılmaz
		
		TreeSet<String> tSet = new TreeSet<>();
		tSet.add("ABC");
		tSet.add("String");
		tSet.add("Test");
		tSet.add("Pen");
		tSet.add("Ink");
		tSet.add("Jack");
		
		System.out.println(tSet);
		
		//HashSet oluşturup Java'nın elemanları hızlı eklemesini sağlarız
		HashSet<String> hSet1 = new HashSet<>();
		
		hSet1.add("ABC");
		hSet1.add("String");
		hSet1.add("Test");
		hSet1.add("Pen");
		hSet1.add("Ink");
		hSet1.add("Jack");
		
		System.out.println(hSet1);
		//Oluşturduğumuz HashSet'i TreeSet constructor'ına parametre olarak koyup TreeSet' e ceviririz, 
		//böylelikle TreeSet'in elemanları natural order yapma özelliğinden istifade etmiş oluruz
		
		TreeSet<String> tSet1 = new TreeSet<>(hSet1);
		System.out.println(tSet1);
		
		
	}

}
