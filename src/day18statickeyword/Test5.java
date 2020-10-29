package day18statickeyword;

public class Test5 {

	static int x = 10;

	public static void main(String[] args) {
		
		Test5 t1 = new Test5();
		Test5 t2 = new Test5();
		
		t1.x = 20;
		System.out.println(t1.x + " ");
		System.out.println(t2.x);

	}

}
