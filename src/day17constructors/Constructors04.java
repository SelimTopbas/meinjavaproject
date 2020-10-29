package day17constructors;

public class Constructors04 {

//		25. ADIM - static ve static olmayan iki variable oluşturuyoruz ve 
//		Constructor05 te bu classtan(Constructor04 ten)bir obje oluşturuyoruz. 26. Adım orda
		int num1 = 12; 
		static int num2 = 22; 
	
	public static void main(String[] args) {
		
//		31. ADIM - main method static. java derki: Static methodların içinde 
//										sadece static elemalar kullanılabilir
			
//		30.ADIM	- num1++;//num1 static olmadığından. compile error. Hatayı kapatmak için yoruma aldım
			
		num2++;//num2 static olduğundan main methodun içinde kullanmamız problem olmuyor
		
		
		
	}

}
