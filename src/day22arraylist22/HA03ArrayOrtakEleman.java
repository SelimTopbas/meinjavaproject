package day22arraylist22;

public class HA03ArrayOrtakEleman {

	public static void main(String[] args) {
//		İki String array oluşturunuz ve bu array’lerdeki ortak elemanları For-each loop kullanarak bulunuz. 
//		Sonucu ekrana yazdırınız. Ortak eleman yoksa ekrana “Ortak eleman yok” yazdırınız

		String arr1[] = { "Mahmut", "mehmet", "Can", "Selim", "Kemal" };
		String arr2[] = { "Ahmet", "mehmet", "Kamil", "Selim", "Salim" };

		int count = 0;
		for (String w : arr1) {
			for (String z : arr2) {
				if (w.equals(z)) {
					System.out.println(w);
					count++;
				}
			}
		}
		if(count == 0) {
			System.out.println("Ortak eleman yok");
		}
	}

}
