package day11stringmethodsandforloops;

public class ForLoop02 {

	public static void main(String[] args) {

//==>	//100 den kucuk 3'un kati sayma sayilarini  ekrana yazdirin
		for(int i=3; i<100; i+=3) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
//==>	//ilk bes sayma sayisinin toplamini veren program'i for loop ile yaziniz
		//1, 2, 3, 4, 5
		//int sum=0; 0+1=1 ==> 1+2=3 ==> 3+3 ==>6 ==> 6+4=10 ==> 10+5=15
		
		int sum=0;
		
		for(int i=1; i<=5; i++ ) {
			sum += i; //sum = sum + i;
		}
		System.out.println("Toplam: " + sum); // suslu parantezin disina yazdik. o yuzdek tek sonuc olan 15'i aldik
											  // icine yazsaydik her dongunun sonucunu ekrana yazdirirdi
		
//==>	//10 dan buyuk ilk uc sayma sayisinin toplamini veren for loop yaziniz
		int sum2=0;
		for(int i=11; i<=13; i++ ) {
			sum2 += i;
		}
		System.out.println("Toplam2: " + sum2);

//==>	//20 den buyuk ilk 5 ayma sayisini veren for loop olusturunuz
		int sum3 = 0;
		for(int i=21; i<=25; i++) {
			sum3 += i;
		}
		System.out.println("toplam3: " + sum3 );
		
		
//==>	//ilk 50 sayma sayisinin toplamini veren for loop olusturunuz
		
		int sum4 = 0;
		for(int i=1; i<=50; i++) {
			sum4+=i;
		}
		System.out.println("toplam4: " + sum4 );
		
//==>	//5'e bolunebilen 100den kucuk sayma sayilarin toplamini ekrana yazdirin(for loop)		
		int sum5 = 0;
		for(int i=5; i<100; i+=5) {
			sum5+=i;
		}
		System.out.println("toplam5: " + sum5 );
		
		
		
	}

}
