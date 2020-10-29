package day15methodcreation;

public class MethodCreation01 {

	public static void main(String[] args) {
		
		System.out.println(toplama(3, 5.2));	//3. parantez içine parametre oluşturduysak burada mutlaka 
//											parantez içine değerler vermeliyiz. biz 3,5 verdik. buna argument denilir.  
//											Tanım: Methodu cağırırken method parantezinin içine yazılan değerlere 
//											argument denilir.
//											sonra 'toplama(3, 5)' i System.out... içine alıyoruz
//											Parametrenin data type'i ile Argumentin data type'i aynı olmalı.  
											//Yani parametre String iken diger argumente int deger verilmez
		System.out.println(carpma(3, 5));
		
	}

	//Bir methodu main methodun icinden cagirmak icin mutlaka 'static' kelimesini kullanmaliyiz
	
	public static double toplama(int num1, double num2) {// T1. Method parantez içine yazarken mutlaka data typi yazılmalı. 
															//sonra variablelere mutlaka isim verilmeli
													//2. örneğin parentez içine yazdağınız 'int num1' bir parametredir. 
													//Method parantezinin içinde oluşturulan variable'lara parametre denir
		return num1+num2;		// return etmek=dondurmek=sonucunu vermek
		
	}
	
	public static int carpma(int num1, int num2) {
		return num1*num2;
	}
	
}
