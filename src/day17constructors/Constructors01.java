package day17constructors;

public class Constructors01 {
	//NOT: Aşağıdaki variable ler static değiller. göreceğiz
	
	String isim = "Ali Can";  //1.ADIM - 2 adet instance variables oluşturduk
	int yas = 33;			//Aslında 1.Adımı constructor02 classında kullanmak için oluşturmuşuz
							//bu classta hiç kullanmadık

//==>	NOT1 - Method ile main method ayni class'da ise methodu sadece ismini yazarak kullanabilirsiniz.
//				Örn: buyume(); veya isimDegistir(); ikisi de Constructors01 class'ının içinde
//				Farklı classta nasıl kullanıldığına bakmak için Constructors02 classına bak
	
//		NOT2 - int yas=33; variable'i static olmadığı için buyume()methodunda değer verdik(zorundamıyız bilmiyorum).  
//				Biz buyume(33); dedik. static olmasaydı değer vermek zorunda kalmazdık. sadece buyume(); yeterli olurdu.
		
//		NOT3 - Method dışında oluşturulmuş static olmayan bir variable method, 
//				başka methodlar içinde obje oluşuturulmadan çağrılamaz
	
	public static void main(String[] args) {
		
		buyume(33); //34	//4. Adım - ve hemen NOT1 ve NOT2
		isimDegistir("Ayse Han"); //4. ve 5. Adım
		//6. Adım -  şimdi bu methodu başka classta kullanmaya çalışalım. constructor02 de...
	}

	public static void buyume(int yas) { //2.ADIM - buyume() methodu oluşturduk. yas++; ile. sonra yazdırdık
		yas++;
		System.out.println(yas);
	}

	public static void isimDegistir(String isim) {// 3. Adım - Bir tane de isimDegistir() methodu. isim yazdırdık
		System.out.println(isim);
	}
}
