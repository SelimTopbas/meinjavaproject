package day30exceptions;

public class TryCatch05 {

	public static void main(String[] args) {
		try {
			hop();
			
		}catch (Exception e) {
			System.out.println(e.getMessage());//e.getMessage() nin anlamı: mesajı yakalı teknik mesaj olmadan yazdır
		}		
	}
	
	private static void hop() {
		throw new RuntimeException("cannot hop");
	}

}
