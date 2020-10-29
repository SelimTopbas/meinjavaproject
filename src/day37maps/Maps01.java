package day37maps;

import java.util.HashMap;

public class Maps01 {

	public static void main(String[] args) {

		/*
		 * Map bir interface'dir. Map interface'inin 3 tane child class'i vardır 
		 * 
		 * 1) HashMap: HashMap key-value yapısını kullanır. Key ve value programcı
		 * 				tarafından yazılır Key ve value'da null değeri kullanılabilir. Key'de birden
		 * 				fazlanull değeri kullanılırsa Java son kullanılan null'ı kabul eder. Value'da
		 * 				birden fazla null değeri kullanılabilir.
		 * 				HashMap console'a yazdırıldığında hem key değerleri, hem de value değerleri
		 * 				aralarına = sembolu kullanılarak yazdırılır.
		 * 
		 * 				HashMap'ler  ekrana yazdırırken rastgele sıralama yapar
		 * 				HashMap, Map'ler arasında en hızlısı dır
		 * 				HashMap'ler "thread safe" değildir
		 */
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		
		hashMap.put(3, "Ali");
		hashMap.put(1, "Mehmet");
		hashMap.put(2, "Mine");
		hashMap.put(4, "Kemal");

		System.out.println(hashMap);//{1=Mehmet, 2=Mine, 3=Ali, 4=Kemal}
		
		hashMap.remove(4);
		System.out.println(hashMap);//{1=Mehmet, 2=Mine, 3=Ali}
		
		System.out.println(hashMap.remove(1, "Mehmet"));//true (işlem tamam)
		
		System.out.println(hashMap.remove(2, "Ayse"));//false (Ayse olmadığı için false verir)
		
		System.out.println(hashMap.get(3));//Ali
		System.out.println(hashMap.get(5));//null
		
		
		System.out.println(hashMap.keySet());//[2, 3]
		System.out.println(hashMap.values());//[Mine, Ali]
		
		System.out.println(hashMap.size());//2
		
		System.out.println(hashMap.containsKey(2));//true
		System.out.println(hashMap.containsKey(5));//false
		
		System.out.println(hashMap.containsValue("Mine"));//true
		System.out.println(hashMap.containsValue("Emin"));//false
		
		hashMap.replace(2, "Emin");//Mine'yi Emin yapti
		System.out.println(hashMap);

		
		hashMap.clear();// tüm elemanları siler
		System.out.println(hashMap);{}
		

	}

}
