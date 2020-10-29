 package day20arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// iki Array olusturup bu arraylarin birbirine esit olup olmadigini kontrol edeiniz
		
		//NOT: iki array'in esit olabilmesi icin:
		//		1. Elemanlari ayni olmali
		//		2. Esit elemanlarin index'leri esit olmali
		// 		{1,2,3} ve {1,2,3} esittir ama {1,2,3} ile {1,3,2} birbirlerine esit degildir
		
		int arr1[] = {2,1,3};
		int arr2[] = {1,2,3};
		
		System.out.println(arr1 == arr2);// false cunku reference'lar farkli "==" adresleri de kontrol eder
										//iki array farkli iki object oldugundan adresleri farklidir
		
		System.out.println(Arrays.equals(arr1,arr2));//true verir çünkü Arrays.equals() methodu sadece değerlere ve 
													//indexlere bakar, adreslere bakmaz
		
		

	}

}
