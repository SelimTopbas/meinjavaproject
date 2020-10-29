package day37maps;

import java.util.Hashtable;

public class Maps02 {

	public static void main(String[] args) {

		/* HashTable:  	HashTable, HashMap ile hemen hemen aynıdır
		 * 				HashTable, console'a yazdırıldığında HashMap gibi rastgele sıralamada yazdırır
		 * 				HashTable, daha yavaştır
		 * 			  	Farkları:
		 * 				1) HashTable, Key ve value'larda null'a müsade etmez 
		 * 				2) HashTable, thread safe'dir. Bir kaç işi aynı anda yapabilir
		 * 
		 * 				HashMap' kullandığımız methodların tamamı HashTable'da da kullanılır
		 */
		
		Hashtable<String, String> hTable = new Hashtable<>();
		hTable.putIfAbsent("Dil", "Kalp");
		hTable.putIfAbsent("Gönül", "Kalp");
		hTable.putIfAbsent("Dil", "Tad Alma Organı");
		hTable.put("Ali", "");//Ali=, 
		//Aynı key değeri tekrar kullanılırsa, son value'yu kabul eder
		//hTable.put(null, "Ağızlık");// Run Time Error
		//hTable.put("Kanaat", null);// Run Time Error
		System.out.println(hTable);//{Dil=Kalp, Gönül=Kalp}
		

		
	}

}
