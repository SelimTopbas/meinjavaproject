package day27constructorcagirma;

public class Mammal extends Animal {

	public boolean dogum = true;

	public static void main(String[] args) {
			
		Mammal mammal = new Mammal();

	}

	public void feed() {
		System.out.println("Cocuklarini besler");
	}

	Mammal() {
		super(); //Parent'daki parameresiz constructor'i cağırır
				//super() keywordu kullanılmasa da olur. Ama bazıları kullanabilir. şaşırmamak lazım
				//super() kullanılacaksa mutlaka ilk satırda olmalıdır.
				//this() ve super() bir arada kullanılamaz. çünkü ikisinin de ilk satırda olma zorunluluğu var
		System.out.println("Mammal parametresiz constructor");
	}

}