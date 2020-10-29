package day10stringmethods;

public class HA03toUpperAndLowerCase {

	public static void main(String[] args) {

		//Aşağıdaki kodların ekran çıktısı alınırsa ne olur diye once dusunun 
		//sonra kodları yazarak ekran çıktılarına bakın.
		
		String str = "Cat, caterpillar";

		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.substring(4).toLowerCase());
		System.out.println(str.substring(3,8).toUpperCase());
		System.out.println(str.toUpperCase().toLowerCase());
		
		String strA = "Cat ";
		System.out.println(strA.trim()); 
		
		String strB = " Cat"; 
		System.out.println(strB.trim()); 
		
		String strC = " Cat "; 
		System.out.println(strC.trim());
		System.out.println(str.substring(5,8));
	}

}
