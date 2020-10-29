package day38interviewhazirlik;

public class PassByValuePassByReference {

	public static void main(String[] args) {
		// Bir method'a variable yollandığında, Java o variable'in kopyasını oluşturur
		// ve maethod'a koypayı yollar bu yüzden variable'in orjinal değeri method
		// çalıştıktan sonra da aynı kalır.
		// Buna Pass By Value denir.
		
		//Pass by Refernece'da ise reference'in kopyasi olusturulur ve methoda yollanir
		//fakat reference'in kopyasi da kendisi gibi ayni object'i gosterdigi icin orjinal
		//deger degisir. (Hazine örneği. kopyası da, orjinali de aynı hazineyi gösterir)
		//(Ama Java bunu kullanmıyor. diğer program dillerinden kullanabilen var)
		
		
		
		int x = 12;
		System.out.println(increment(x));
		System.out.println(x);

	}

	public static int increment(int a) {
		a += 1;
		return a;

	}

}
