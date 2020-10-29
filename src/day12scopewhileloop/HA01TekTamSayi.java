package day12scopewhileloop;

public class HA01TekTamSayi {

	public static void main(String[] args) {
		// while loop kullanarak 3 ten 13'e kadar olan tum tek tam sayilari ekrana yazdirin

		int i = 3;
		while(i <= 13) {
			if(i%2==1) {
				System.out.print(i + " ");
			}
			i++;
		}
		
	}

}
