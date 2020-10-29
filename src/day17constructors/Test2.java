package day17constructors;

public class Test2 {
	int x = 5;
	
	Test2(){
		System.out.println("-x" + x);
	}
	
	Test2(int x){
		this();
		System.out.println("-x" + x);
	}

	public static void main(String[] args) {
		
	Test2 mc1 = new Test2(4);
	Test2 mc2 = new Test2();
	}

}
