package day06ifstatement;

public class IfStatement02 {

	public static void main(String[] args) {

		//bir int variable oluştur. deger atayin. eger cift sayi ise ekrana cift, sayi tek ise tek yazdirin
		
		int num = 4;
		
		if (num % 2 == 0) {
			System.out.println("Cift");
			
		}
		
		if (num % 2 == 1) { // veya (num % 2 != 0) de kullanilabilir
			System.out.println("Tek");
			
		}
	}

}
