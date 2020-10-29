package day37maps;

import java.util.TreeMap;

public class Maps03 {

	public static void main(String[] args) {
		
		/*	TreeMap: 1) TreeMap key'lerde null kullanmaya müsade etmez ama 
		 * 				value'larda istedigimiz kadar null kullanmaya musade eder
		 * 			2)	TreeMap elemanlarini console'a yazdirmak istenildiginde
		 * 				key'ler, natural order'a gore siralanir
		 * 			3)  TreeMap en yavaslaridir
		 */
		
		TreeMap<String, Integer> tMap = new TreeMap<>();
		
		tMap.put("Kanaat", null);
		tMap.put("Bezelye", 7);
		tMap.put("Elma", 10);
		tMap.put("Armut", 8);
		
		System.out.println(tMap);//tMap.put("", );

	}

}
