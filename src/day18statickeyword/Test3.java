package day18statickeyword;

public class Test3 {
	
	int x = 10;
	
	public static void main(String[] args) {

		Test3 t1 = new Test3();
		System.out.println(t1.x);
		
	}
	static {
		int x = 20;
		System.out.println(x + " ");
	
	}
	

}
