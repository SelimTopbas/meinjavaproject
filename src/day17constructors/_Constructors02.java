package day17constructors;

public class _Constructors02 {

	public static void main(String[] args) {
		
//		buyume(44);// bu classta olmadığı için çağıramam. ya class ismiyle ya da object kullanarak çağırabilirim.
		
		_Constructors01.buyume(78);//static method olduğu için class ismiyle de ulaşabiliyorum. Ama burada hangi
									//değeri verirsem ekrana o çıkar
								
		
		_Constructors01 obj1 = new _Constructors01(); //Object kullanarak çağırıyorum.
		
		
		System.out.println(obj1.Isim);//_Constructor01 classındaki değerler ekrana yazdırılır
		
		obj1.yas++;		//Bu şekilde de _Constructor01 deki değerler üzerinden oynama yapabiliriz
		System.out.println(obj1.yas);
		
	}

}
