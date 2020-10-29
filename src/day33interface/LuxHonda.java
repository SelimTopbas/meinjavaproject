package day33interface;

public class LuxHonda extends Araba implements IcAraba, DisAraba {
	

	public static void main(String[] args) {

		LuxHonda luxHonda = new LuxHonda();
		luxHonda.benzin();
		luxHonda.direksiyon();
		luxHonda.kapi();
		luxHonda.klima();
		luxHonda.koltuk();
		luxHonda.move();
		
		System.out.println("Ic Araba interface'inden price: " + IcAraba.price); //2000
		System.out.println("Dis Araba interface'inden price: " + DisAraba.price);//3000
		
		System.out.println(old);//iki tane old isimli variable olmadığından interface adını kullanmaya gerek yok
		
		luxHonda.doseme();

	}

	@Override
	public void move() {
		System.out.println("3 Saniyede 100 km'lik  hıza ulaşır");

	}

	@Override
	public void kapi() {
		System.out.println("Parmak izi ayarlı kapı");

	}

	@Override
	public void direksiyon() {
		System.out.println("Gerçek deri direksiyon");
	}

	@Override
	public void koltuk() {
		System.out.println("Isıtmalı deri koltuk");
	}

	@Override
	public void klima() {
		System.out.println("Digital klima");
	}

}
