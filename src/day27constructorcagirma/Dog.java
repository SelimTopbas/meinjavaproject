package day27constructorcagirma;

public class Dog extends Mammal {

	public boolean sadik = true;

	public static void main(String[] args) {

		Dog dog = new Dog();

		
	}

	public void bark() {
		System.out.println("Kopekler havlar");
	}
	
	Dog(){
		super(); //Kullansak ta olur kullanmasak ta
		System.out.println("Dog parametresiz constructor");
	}

}
