package day31abstraction;

public abstract class Abstraction01 {

	public static void main(String[] args) {

		//Abstract class'lardan  obje uretilemez.
		//Constractor'lari yoktur
		//Abstract class'lar concrete(body'li) ve abstrcat(body'siz) methodlar içerebilir
		//Abstract class'ların hem concrete class hem de abstract class olan child'ları olabilir
		//Abstrcat class'in child'ı concrete class ise Abstract class'daki abstract methodları
		//mutlaka overriding etmeli ve onlara body eklemelidir
		//==>Bunun faydası şudur; Child class'larda mecburen olması gereken methodları bu şekilde belirlemiş oluruz
		
		//Abstrcat class'in child'ı Abstract class ise Abstract class'daki herhangi bir şeyi
		//overridin etmek zorunda değildir
		
		  
	}
	
	public void concreteMethod() {
		System.out.println("Ben concrate'im");
		
	}

	public abstract void abstractMethod();
}
