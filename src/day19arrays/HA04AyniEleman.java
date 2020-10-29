package day19arrays;

public class HA04AyniEleman {

	public static void main(String[] args) {
		//Bir array’de herhangi iki elemanın aynı olup olmadığını kontrol eden bir program yazınız.
		//Aynı eleman varsa “Aynı eleman var” yoksa “Aynı eleman yok” yazdırınız.
		
	
		int arr[] = {10, 20, 20, 40, 20};
		int count = 0;
		
		for(int i=0; i<=4; i++) {
			for(int j=i+1; j<=4; j++) {
				if (arr[i] == arr[j]) {
					count++;
					break;
				}
			}
		}
		
		if (count>0){
			System.out.println("Ayni eleman vardir "  );
		}else {
			System.out.println("ayni eleman yok");
		}
	}

}
