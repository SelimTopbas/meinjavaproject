package day12scopewhileloop;

public class ScopeKurallari {
	
	int num; // Class Variable veya Instance Variable  (Class icinde ve methodlarin disinda)
			//	==> değer atamadığımız için java otomatik olarak 0 atamış bulunuyor. (Default value)

	public static void main(String[] args) {//Main Method

		//Scope sozluk anlami 'kapsam'dir. Java anlami bir variable'yi nerelerde kullanabilecegimizi gosterir
		
	}
	
	public void toplama() {//Toplama Method
		num = 12; //int num = 12; de yazabilirdik. num = 12; yazdık çünkü class variable olarak tanımlamıştık
		System.out.println("toplama" + num);
	}

	public void carpma() {//Carpma Method
		
	}
}
//1. Kural: Class'in icinde method'larin disinda olan variable'leri butun methodlar istedikleri zaman 
			//istedikleri kadar kullanabilirler.
			//Bu variable'lara "Class Variable" veya "Instance Variable" denir. instance=gorunum, birseyin gorunur hali
			//Class variablelere deger atamasi vermezsek Java onlara default (baslangic) degerleri verir.
			//Java tu sayilar icin default olarak 0 degerini verir


//2. Kural: Bir method'un body'si icinde olusturulan variableler sadece o methodun icinde kullanilabilir. 
			//O methodun disindaki methodlar o variableyi kullanamazlar.
			//Methodun icinde olusturulan bu variablelere "Local Variable" denir
			//Body icerisinde olusturulan variable'lere deger atama ZORUNDAYIZ! Java onlara default value atamaz



//3. Kural: Methodlarin parantezleri icinde olusturulan variable'ler local variableler gibi 
			//sadece o methodlarin body'leri icinde kullanilabilir.
			//Bu variablelere de "Local Variable" denir. Parantez icinde olusturulan variable'lara ise deger atamasi yapilmaz


//4. Kural: Bir variable'i kullanmaya baslamadan once tanimlamaliyiz.
			//once num = num + 2; sonra int num = 12; diyemeyiz
			//once int num = 12; sonra  num = num + 2;demeliyiz


