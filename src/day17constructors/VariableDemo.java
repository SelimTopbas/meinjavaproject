package day17constructors;

public class VariableDemo {

	
	static int count = 0;
	
	public void increment() {
		count++;
	}
	public static void main(String[] args) {

		VariableDemo obj1 = new VariableDemo();
		VariableDemo obj2 = new VariableDemo();
		obj1.increment();
		obj2.increment();
		
		System.out.println(obj1.count);
		System.out.println(obj2.count);
	}

}
