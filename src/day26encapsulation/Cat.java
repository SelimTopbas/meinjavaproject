package day26encapsulation;

public class Cat extends Mammal{
	
	public boolean clean = true;
	
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		
		System.out.println(cat.age);
		System.out.println(cat.name);
		cat.move();
		cat.eat();
		System.out.println(cat.dogum);
		cat.feed();
		System.out.println(cat.clean);
		cat.meow();

	}
	
	
	public void meow() {
		System.out.println("Kediler miyavlar");
	}
}

