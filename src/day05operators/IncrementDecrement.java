package day05operators;

public class IncrementDecrement {

	public static void main(String[] args) {


		
		//int data tipinde bir variable oluturarak bunu carpma ve bolme kullanarak artirin ve azaltin
		
		int num1 = 12;
		//carpma uzun yol
		num1 = num1 * 3;
		System.out.println(num1);
		
		//carpma kisa yol
		num1 *= 3;
		System.out.println(num1);

		//bölme uzun yol
		num1 = num1 / 9;
		System.out.println(num1);

		//bölme kisa yol
		num1 /= 2;
		System.out.println(num1);
	}

}
