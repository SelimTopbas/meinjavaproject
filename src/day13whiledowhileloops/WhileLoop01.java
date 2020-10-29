package day13whiledowhileloops;

public class WhileLoop01 {

	public static void main(String[] args) {
		// While loop kullaarak ilk 5 syma sayisinin toplamini ekrana yazdiran program

		int sum = 0;
		int num = 1;
		while (num<=5) {
			sum+=num;
			num++;
		}
		System.out.println(sum);// en son toplami icin System.out... loop disina yazilmali
								// adimlari gormek icin System.out... loop icine yazilmali
		
	}
	

}
