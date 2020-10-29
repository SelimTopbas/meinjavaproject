package day17constructors;

public class Constructors05 {

	public static void main(String[] args) {
		
		Constructors04 obj1 = new Constructors04();//26. ADIM - Constructor04 ten bir obje oluşturduk
		System.out.println(obj1.num1); // 27.ADIM - Static OLMADIĞI için OBJECT üzerinden çağırmayı java normal görüyor
													
//										28. ADIM
		System.out.println(obj1.num2); // num2 static OLDUĞUNDAN OBJECT olarak cağırmamızı java istemiyor. Sarı uyarı veriyor
										// Bu yüzden class ismiyle aşağıdaki gibi çağıracağız
		
//												29.ADIM
		System.out.println(Constructors04.num2);//static OLAN bir variableyi bu şeklde çağrılmak java için uygun bir yöntem
												// 30. ADIM Constructor04 classında

//		static olmayan bir değer sonraki satıra değerini taşımaz
//		static olan değer ise değerini korur ve sonraki satıra taşır
//		static olmayan variablelere instance variable  veya object variable denilir. Obje diyoruz çünkü objelere asılı
//		static olan variablelere ise static variable veya class variable denilir.Class diyoruz çünkü classlara asılı
	}

}
