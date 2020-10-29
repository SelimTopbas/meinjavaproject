package day13whiledowhileloops;

public class HA01TumSayilar5inKati {

	public static void main(String[] args) {

		//8 den 180 e kadar 5 in kati olan tum tamsayıları ekrana yazdırınız.
		
		int num = 8;
		while(num<=180) {
			if(num%5==0) {
				System.out.print(num + " ");
			}
			num++;
		}
	}

}
