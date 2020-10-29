package day36collections;

import java.util.HashSet;

public class HashSet01 {

	public static void main(String[] args) {
		// HashSet 1) Tekrarlı eleman kullanımına (Duplication) izin vermez
		// 2) Key-Value yapısını kullanır. Key'ler ve value'lar HashSet icin unique'dir
		// Normalde Key'ler her zaman unique'dir, Value'lar kullanılan class'a bağlı
		// olarak unique olabilir veya olmaya bilir. Kullanılan class HashSet ise
		// Value'lar da unique olur ama ArrayList ise unique olma zorunluluğu yokturx

		HashSet<String> hSet = new HashSet<>();

		// List'lerde add() methodu hep yeni elemanı sona eklera ama HashSet'lerde böyle
		// bir zorunluluk yok.
		// HashSet'ler elemanları rastgele dizer, kural yoktur.

		hSet.add("Apple");
		hSet.add("Mango");
		hSet.add("Ali");
		hSet.add("Grape");
		hSet.add("Orange");
		hSet.add("Fig");
		//Aynı eleman HashSet'e eklenmek istendiğinde CompileTime veya RunTime Error alınmaz
		//Son eklenen eleman, ilk eklenen elemanın üstüne yazılır

		hSet.add("Apple");
		System.out.println(hSet);

	}

}
