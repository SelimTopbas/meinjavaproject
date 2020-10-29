package day33interface;

public class BasicHonda extends Araba implements IcAraba, DisAraba {
	//class, interface'e impliments yapar
	//interface, interface extends yapar
	// class, class'a extends yapar.

	public static void main(String[] args) {
		BasicHonda basicHonda = new BasicHonda();

		basicHonda.diesel();
		basicHonda.kapi();
		basicHonda.direksiyon();
		basicHonda.koltuk();
		basicHonda.klima();
		basicHonda.move();
	}

	@Override
	public void kapi() {
		System.out.println("Otomatik kilit System kapı");
	}

	@Override
	public void direksiyon() {
		System.out.println("Yüksek kalite plastik direksiyon");
	}

	@Override
	public void koltuk() {
		System.out.println("Birinci Sınıf suni koltuk");
	}

	@Override
	public void klima() {
		System.out.println("Ac Camı Serinle klima sistemi");
	}

	@Override
	public void move() {
		System.out.println("15 saniyede 100 km'lik hıza ulaşır");
	}

}
