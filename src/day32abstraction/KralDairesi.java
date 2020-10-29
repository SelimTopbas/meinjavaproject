package day32abstraction;

public class KralDairesi extends Otel {

	public static void main(String[] args) {
		KralDairesi musteri3 = new KralDairesi();
		musteri3.kahvalti();
		System.out.println("Wifi Ücret: " + musteri3.wifi(10));
		System.out.println("TV Ücret: " + musteri3.tv("international", 12));

	}

	@Override
	public void kahvalti() {
		System.out.println("Kahvaltınız teras kat Kral Restaurant'dadir");
	}

	public int tv(String international, int saat) {

		if (international.equals("international")) {
			return saat * 5;
		} else {
			return 0;
		}

	}

}
