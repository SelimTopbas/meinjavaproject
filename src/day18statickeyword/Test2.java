package day18statickeyword;

public class Test2 {

	static int x = 10; // normalde static yoktu. ama kırmızı hata verdi. o yüzden static ekledim. hata kalktı.
	
	public static void main(String[] args) {
		
		System.out.println(x);
		
	}
	static {
		
		System.out.println(x + " ");
	
	}
}
