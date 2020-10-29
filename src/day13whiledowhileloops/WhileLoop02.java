package day13whiledowhileloops;

public class WhileLoop02 {

	public static void main(String[] args) {
		
		//Ilk 5 sayma sayisinin carpiminin sonucunu ekrana yazdiran program 
		
		int product = 1;
		int num = 1;
		while (num<=5) {
			product*=num;
			num++;
		}
		System.out.println(product);
	}

}
