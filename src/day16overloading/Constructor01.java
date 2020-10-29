package day16overloading;

public class Constructor01 {
	
	int price = 20_000;
	int year = 2020;
	String make = "Honda";
	String type = "Civic";
	
	//Benim Notum: Variable leri main methodun dışında oluşturduk. 
	

	public static void main(String[] args) {
		//Class oluşturduğumuzda Java class la beraber bir constructor oluşturur. 
		//Biz onu herhangi bir code yazmadan direk kullanabiliriz. Buna "Default Constructor" denir
		//Default constructor larda parametre olmaz
		//Default Constructor class oluşturulduğu anda java tarafından oluşturulur.
		//Biz kendimiz bir constructor oluşturduğumuzda Java default constructor ı imha eder
		
		
		
		
		Constructor01 hondaAraba = new Constructor01(); // Bu tek satır, bir tane obje ürettik demektir
		// Constructor01 = Data type (Non-primitive)
		// hondaAraba = isim
		// Constructor01() = constructor
		
		   
		
		System.out.println("Price: " + hondaAraba.price); //20000
		System.out.println("Year: " + hondaAraba.year ); //2020
		System.out.println("Make: " + hondaAraba.make); //Honda
		System.out.println("Type: " + hondaAraba.type);//Civic
		

	}

}
