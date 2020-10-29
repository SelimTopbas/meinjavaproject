package day12scopewhileloop;

public class WhileLoop01 {

	public static void main(String[] args) {

		// while iken demektir 
		// while I go to school ==> okula giderken
		// While I go to Uskudar, it rained
		
		int num = 0;
		while (num<4){ //num 4 ten kucuk iken... // Parantex icindeki condition true oldugu surece while loop calisir
			System.out.println("Ali");
			num++;  // Bu satiri unutursak While loop donguye girer. Bu unutulmamalidir
		}
//==>	while loop kullanarak 1 den 10'a kadar tam sayilari ekrana yazdirin
		int num2 = 1;
		while(num2 <=10) {
			System.out.print(num2 + " ");
			num2++;
		}
		
		System.out.println();// arada bosluk olsun diye yazdim

	
//==>	while loop kullanarak 1 den 20'e kadar çift tam sayilari ekrana yazdirin

		int num3 = 1;
		while(num3 <= 20) {
			if(num3%2==0) {
				System.out.print(num3 + " ");
			}
			num3++;
		}
		
		
		System.out.println();
		
		
//==>	while loop kullanarak 5 ten 120'a kadar 3'e bolunebilen tam sayilari ekrana yazdirin
		int num4 = 5;
		while(num4 < 121) {
			if(num4%3==0) {
				System.out.print(num4 + " ");
			}
			num4++;
		}
		
		
	}

}
