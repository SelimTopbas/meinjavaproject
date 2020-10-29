package day11stringmethodsandforloops;

public class HA_Tekrar_StartsEndsWith {

	public static void main(String[] args) {
		
		String str = "Cat, caterpillar";


		System.out.println(str.startsWith("C"));
		System.out.println(str.startsWith("c")); 
		System.out.println(str.startsWith("B")); 
		System.out.println(str.startsWith("Cat")); 
		System.out.println(str.startsWith("c",5)); 
		System.out.println(str.startsWith("ter",7)); 
		System.out.println(str.startsWith("p", 11)); 
		System.out.println(str.startsWith(""));
		
		
		System.out.println(str.endsWith("r")); 
		System.out.println(str.endsWith("C")); 
		System.out.println(str.endsWith("")); 
		System.out.println(str.endsWith(" ")); 
		System.out.println(str.endsWith("lar")); 
		System.out.println(str.endsWith("caterpillar"));
		
	}

}
