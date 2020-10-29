package day11stringmethodsandforloops;

public class HA_Tekrar_Replace {

	public static void main(String[] args) {
		//Aşağıdaki kodların ekran çıktısı alınırsa ne olur diye once dusunun sonra kodları yazarak ekran çıktılarına bakın.
		
		String str = "Cat, caterpillar";
		
		System.out.println(str.replace('t', 'm'));
		System.out.println(str.replace("t", "m")); 
		System.out.println(str.replace("x", "y")); 
		System.out.println(str.replace("", "|")); 
		System.out.println(str.replace("a", ""));
		System.out.println(str.replace("a", "amel")); 
		System.out.println(str.replace("at", "e")); 
		System.out.println(str.replaceFirst("c", "C")); 
		System.out.println(str.replaceFirst("at", "amel")); 
		System.out.println(str.replaceFirst("Cat, caterpillar", "Deve"));
	}

}
