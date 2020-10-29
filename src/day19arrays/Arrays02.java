package day19arrays;

public class Arrays02 {

	public static void main(String[] args) {
		
		//4 Elemanlı char bir array oluşturun, bu array e elemanla yerleştirin
		//Tum elemanları for dongusu kullanarak ekrana yazdırın
		//Sadece son elemanı ekrana yazdırın
		
		char arr[] = new char[4];
		
		arr[0] = 'a';
		arr[1] = 'b';
		arr[2] = 'c';
		arr[3] = 'd';
		
		for (int i=0; i<4; i++) {
			System.out.println(arr[i]);
			}
		
		System.out.println("Son eleman: " + arr[3]);
		
		//Array in length ini bulmak için "ArrayIsmi.length" yazmak yeterlidir. 
		//Strinlerde de length methodu kullanırıl ama Stringlerde kullandığımız parantezlidir. 
		//Yani String için length() , array için length
		
		System.out.println("Array Uzunluğu: " + arr.length);
		
		//Array deki son elemanı yazdırmak için length kullanınız
		
		System.out.println("Bu da son eleman: " + arr[arr.length-1]);
		
		
		
	}
}
