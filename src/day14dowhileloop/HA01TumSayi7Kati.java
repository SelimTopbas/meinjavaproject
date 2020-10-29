package day14dowhileloop;

public class HA01TumSayi7Kati {

	public static void main(String[] args) {
		//9 den 190 e kadar 7 nin kati olan tüm tamsayıları ekrana yazdırınız.
		
		int num = 9;
		do {
			if(num%7==0) {
				System.out.print(num + " ");
			}
			num++;
		}while(num<=190);
		
	}

}
