package day11stringmethodsandforloops;

public class ForLoop03 {

	public static void main(String[] args) {

//==>	//ilk 4 sayma sayisinin carpimini veren for loop olusturunuz
		// 1, 2, 3, 4 ==> 1x2x3x4 = 24
		
		int product = 1;
		for(int i=1; i<5; i++) {
			product = product * i;
		}
		System.out.println("Sonuc: " + product);
		
//==>	//Ilk 7 cift sayma sayisin toplamini yazin		
		int product2 = 1;
		for(int i=2; i<=13; i+=2) {
			product2 = product2 * i;
		}
		System.out.println("Sonuc2: " + product2);
		
//==>	//9! li hesaplayan programi for loop ile yaziniz		
		int product3 = 1;
		for (int i=9; i>=1; i--) {
			product3 = product3 * i;
		}
		System.out.println("9! = " + product3);
		
		
	}

}
