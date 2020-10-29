package day19arrays;

public class Arrays01 { //Arrays kelime anlamiyla tepsi demek
						//Birden fazla variableyi depolamak için kullanılabilen object'lerdir.
						//Arrayler objecttir. ve diğer objectler gibi heap memory de muhafaza edilir.
						//Bu arraylere ya pirimitivleri koyabiliriz veya non-primitivlerin adreslerin
						//örneğin String koyamam ama Stringin adresini koyabiliri. String- non-primitivdir.
						//Hepsi aynı data type olmalıdır.
	//KURAL3 - Bir Array oluşturumadan önce o Arrayin içine kaç variable koyacağımıza karar vermeliyiz
	//KURAL4 - Birr Arra içine koyabileceğimiz sayısına o Array'in LENGTH'i denir
				//O Array icine length'den fazla variable koyamayız
	//KURAL5 - Array'ler objectir bu yüzden Heap Memory're depolanırlar
	//KURAL6 - Array ler objectir bu yüzden valuların yanında methdolar vardır
	//KURAL7 - Arrayler objectir bu yüzden runtime'a oluşturulurlar. Yani yazdığım zaman değil Run düğmesine basarsam çalışır
	
						//Bir Array Nasıl Declare edilir?
						

	public static void main(String[] args) {
		// Bir int array olusturalim
		
		int arr1[] = new int[5];
		System.out.println(arr1);//array'in adresini verir
		System.out.println(arr1[0]);//0. indexteki elemani verir
		System.out.println(arr1[3]);//3. indexteki elemani verir
		
		arr1[0] = 12;
		arr1[4] = 22;
		arr1[1] = 7;
		arr1[2] = 262;
		arr1[3] = 129;
		System.out.println(arr1[0]);
		System.out.println(arr1[4]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		
		
		//Array deki elemanlari ekrana yazdirmak icin for dongusu kullanin
		
		for (int i = 0; i < 5; i++) {
			System.out.println(arr1[i]);
		}

		//Array da olmayan indexe deger atamasi yapin
		
		arr1[5] = 23;
				System.out.println(arr1[5]);
		
		//Array de olmayan indexe atama yapılırsa Run Time Error hatası alınır
		// Array de olmayan indexi kullanmaya çalışırsak "ArrayIndexOutOfBoundsException" alırız

		

	}

}
