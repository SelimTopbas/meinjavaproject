package day22arraylist22;

public class HA04CharacterYukaridanAsagiya {

	public static void main(String[] args) {
//		Bir String oluşturunuz, bu String’deki character’leri yukarıdan aşağıya for-each loop kullanarak yazdırınız.

		String str  =  "Selim Topbas";
		
		String arr []  = str.split("");

		for(String w : arr) {
			System.out.println(w);
		}
	}

}
