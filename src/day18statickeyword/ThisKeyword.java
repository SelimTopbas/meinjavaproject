package day18statickeyword;

public class ThisKeyword {
	
	int x = 12;
	static int y = 13;
	
	ThisKeyword(int x){
		//this kullandigim zaman icinde bulundugum classtaki intance veya static variablelere ulsmak istiyorum demektir
		
		//this() icinde bulundugumuz classtaki parametresiz constructoru kullanmak icin kullanilir
		//this() kullanılacaksa MUTLAKA ilk satıra yazılmalıdır. Aksi halde Compile time error verir. 
		//this("Ali") içinde bulunduğumuz classdaki String parametreli constructoru çağırmak için kullanılır
		this();
		this.x = x;
		System.out.println("Parametreli contructor");
	}
	
	ThisKeyword(){
		System.out.println("Parametresiz contructor");
	}
	
	//Bir süslü parantez içerisinde birden fazla this() kullanılmaz
	
	public static void main(String[] args) {
		
		ThisKeyword obj1 = new ThisKeyword(15);
		System.out.println(obj1.x); // 15
		
//		ThisKeyword obj2 = new ThisKeyword(44);
//		System.out.println(obj2.x);
	}

}
