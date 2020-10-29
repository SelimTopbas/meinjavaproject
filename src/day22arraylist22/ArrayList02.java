package day22arraylist22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		// toArray() methodu list'i Array'e cevirmek icin kullanilir
		
		List <String> list = new ArrayList<>();
		
		list.add("Ali");
		list.add("Can");
		
		System.out.println(list);
		
//		1. YöntemY: toArray() methdonunun içindeparametre olarak (new String[0]) kullanılmalı
		String arr[] = list.toArray(new String[0]);
		System.out.println(Arrays.toString(arr));
		
		
//		2. Yöntem: Oluşturduğumuz arrayin data typini Object yaparak
//		Object javada butun classlarin parent'idir. Yani Object Class ortak Ata'dir
//		Object class Javada parent'i olmayan tek klasdir
//		String, Object classin child'i oldugundan data type olarak bazi durumlarda String kullaniriz
		
		Object[] arr1 = list.toArray();
		System.out.println(Arrays.toString(arr1));
		
		
//==>	asList() methodu arraylari list'e cevirmek icin kullanilir
//		asList() methodu parametre olarak array'in ismini kabul eder
		
		String arr2[] = {"Aliye", "Canan", "Selim"};
		
		List<String> list1 = Arrays.asList(arr2);
		System.out.println(list1);
		
//		Arrayden list'e cevirme yaptiginizda elde ettigimiz list uzunluk olarak esnek degildir. 
//		Yani array'den olusturulan list'e ekleme ve cikarma yapilamaz.
		//Run Time Error verir. "UnsupportedOperationException"
//		list1.add("Emine");
//		list1.remove("Aliye");
//		System.out.println(list);
		
		list1.clear();
		System.out.println(list1);//Çalışıyor
		
	}

}
