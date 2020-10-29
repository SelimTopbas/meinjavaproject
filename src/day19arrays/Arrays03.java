package day19arrays;

public class Arrays03 {

	public static void main(String[] args) {

		//Elemanları 1, 2, 3, 4, 5, olan bir integer array oluşturunuz
		//Bu array'de 3 elemanının olup olmadığını kontrol ediniz
		//3  varsa 3 var yazdırın. yoksa, ekrana 3 yok yazdırın
//		Kac tane 3 olduunu da yazdırın
		
		//Array oluşturup eleman eklemek için 1. Yol
		int arr1[] = new int[5];
	
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;
		arr1[4] = 5;
		
		//Array oluşturup eleman eklemek için 1. Yol
		
		int arr[] = {1, 2, 3, 4, 5};
		// bu satır yukarda yaptığımızın hepsini yaptı
		
		
		int count = 0; //buna flag denilir(bayrak)
	
		for (int i=0; i<=4; i++) { //Başlangıç değeri 0 çünkü index 0 dan başlyıor
			if (arr[i]==3) {
				count++;
			}
		}
			
		if (count>0) {
			System.out.println(count + " tane 3 var");
		}else {
			System.out.println("3 yok");
		}
		
	}

}
