package day18statickeyword;

public class Test4 {
	static int x = 10;

	public static void main(String[] args) {

		System.out.println(Test4.x);//variable static olmadığı için kabul etmedi. ben static e çevirdim
		
	}
	static {
		int x = 20;
		System.out.println(x + " ");
	
	}
	

}
