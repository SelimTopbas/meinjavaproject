package day11stringmethodsandforloops;

public class ForLoop01 {

	public static void main(String[] args) {

//==>	//6, 5, 4, 3, 2, 1 i ekrana yazdiran bir for loop olusturun
		
		for(int i=6; i>=1; i--) {
			System.out.println(i);
		}
		
//==>	//3, 4, 5, 6, 7, 8 i ekrana yazdiran bir for loop olusturun
		
		for(int i=3; i<=78; i++) { //baslangic degeri kucuk ve bitis degeri buyuk ise i++ , aksi durumda i-- kullanilir
			System.out.println(i);
		}
		
		
//==>	//ilk 100 sayma sayisini 1 den 100 e kadar ekrana yan yana aralarinda bosluk olacak sekilde yazdirin
		for(int i=1; i<=100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();//dikkat etmeye gerek yok. sadece bosluk olmasi icin yazdik bunu
		
//==>	//ilk 100 sayma sayisini 100 den 1 e kadar ekrana yan yana aralarinda bosluk olacak sekilde yazdirin
		for(int i=100; i>0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		
//==>	//ilk 50 cift sayma sayisini ekrana yan yana yazdirin
		for(int i=2; i<=100; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
	
//==>	//ilk 50 tek sayma sayisini ekrana yan yana yazdirin
		for(int i=1; i<=99; i+=2) {
			System.out.print(i+" ");
		}
	}

}
