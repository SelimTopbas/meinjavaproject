package day26encapsulation;

public class Dog extends Mammal {

	public boolean sadik = true;
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println("Animan Classindan gelen yas: " + dog.age);
		System.out.println("Animal classindan gelen isim: " + dog.name);
		dog.eat(); //Animal daki eat methodu. system out yapmaya gerek yok. direk yazacak
		dog.move();// Bu da direk yazdırıyor
		
		System.out.println("Mammal class tan geldi: " + dog.dogum);
		dog.feed();
		
		System.out.println("Dog classtan geldi: " + dog.sadik);
		dog.bark();
		
	}
	
	public void bark() {
		System.out.println("Kopek havlar");
	}

}
