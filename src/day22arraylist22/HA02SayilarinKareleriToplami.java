package day22arraylist22;

public class HA02SayilarinKareleriToplami {

	public static void main(String[] args) {
//		 Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin toplamını
//		For-each loop kullanarak bulunuz. Sonucu ekrana yazdırınız.

		int list[] = {1,2,3,4};
		
		int sum = 0;
		for(int w : list) {
			sum=sum+(w*w);
		}
		System.out.println(sum);
	}

}
