package day22arraylist22;

public class HA01TumSayiCarpimi {

	public static void main(String[] args) {

//		Bir integer array oluşturunuz ve bu array’deki tum sayıların çarpımını 
//		For-each loop kullanarak bulunuz. Sonucu ekrana yazdırınız.
		
		int list[] = {1,2,3,4,5,6};

		int product =1;
		for(int w : list) {
			product*=w;
		}
		System.out.println(product);
	}

}
