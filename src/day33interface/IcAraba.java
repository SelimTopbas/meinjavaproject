package day33interface;

public interface IcAraba {

	int price = 2000;
	boolean old = true;

	public void direksiyon();

	public void koltuk();

	abstract void klima();
	
	
	//default keyword kullanırsak methoda body eklemek zorundayız. Aksi taktirde Compile Time Error alırız.
	public default void doseme() { // normalde interface'de concrate method olmazdı.
									// ama default veya static kullanarak interface'de concrate method kullanabiliyoruz
		System.out.println("Interface'de default keyword ile doseme yaptım");
	}
	
	public static void isitma() {
		System.out.println("Interface'de static keyword ile ısıtma yaptım");
	}

}
