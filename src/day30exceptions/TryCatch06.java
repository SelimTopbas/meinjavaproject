package day30exceptions;

public class TryCatch06 {

	public static void main(String[] args) {
		
		
		try {
			hop();

		} catch (Exception e) {
			e.printStackTrace();
			
			//printStackTrace() methodu Exception'ların nerede olustuğunun detaylı bilgisini verir
			//Exception satırlarını olusum sırasına göre console'da gösterir
		}

	}

	private static void hop() {
		throw new RuntimeException("cannot hop");
	}

}
