package day18statickeyword;

public class Counter {
	
	int count = 0;
	
	Counter(){
		count++;
		System.out.println(count); //eğer bu main methodun içinde olsaydı tek sonuç alacaktık. o da 1 olurdu.
	}								//burda olduğu için alt alta 1, 1, 1 yazar

	public static void main(String[] args) {

		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();

		
	}

}
