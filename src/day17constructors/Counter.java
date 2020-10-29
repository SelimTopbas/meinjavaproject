package day17constructors;

public class Counter {
	
	int count;
	static int stCount;
	
	public Counter() {
		count++;
		stCount++;
	}
	
	public int getCount() {
		return count;
	}
	
	public static int getStCount() {
		return stCount;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
