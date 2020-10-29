package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		//MÜLAKATTA SORARLAR: Array ve Array List arasındaki fark
		//Array list denilen şey esnek array dir
		//biz normalde array oluşturmadan önce kaç boyut istediğimizi belirlemek zorundaydık
		//ve sonradan hiç bir array ekleyemiyorduk.
		//bu list array bu kalıbı bozuyor. array oluşturacağız ama boyutunu söylemeye gerek yok.
		//sonradan ne kadar boyut eklemek istersek, array list boyut kapasitesini arttırıyor.
		
		//Hocanın Notu
		//Array'lerde length sabittir, değiştirilemez
		//ArrayList'lerde (List) length esnektir. Siz eleman ekledikçe List length'ini artirir, 
		//siz eleman sildikçe list length'ini azaltır
		
				//List<String> list01 = new List<>(); ==> olmaz
				//ArrayList<String> list01 = new List<>(); ==> olmaz
				//ArrayList<String> list01 = new ArrayList<>(); ==> Bu olabilir ama
				//asagidaki daha cok kullanilir.
				//List<String> list01 = new ArrayLi st<String>();==> bu da olur ama 
				//asagidaki daha cok kullanilir.

		
		List<String> list01 = new ArrayList<>(); // java.util den import edilmeli. List yerine Array
		
		System.out.println(list01);//Ekranda yazdırmak için de Arrays.toString... yazmaya gerek yok. sadece array ismi yeterli
		
		//Liste eleman eklemek icin add() methodu kullanilir
		
		list01.add("Ali");
		System.out.println(list01);
		
		list01.add("Can");
		System.out.println(list01); //once ekleneni one koyar ==> [Ali, Can]
		
		//Veli'yi Ali ile Can arasına koymak istiyorum
		list01.add(1, "Veli");
		System.out.println(list01);
		
		
		// list01'i [Han, Ali, Veli, Can, Ayse] sekline getirin
		
		list01.add(0, "Han");
		list01.add(2, "Kemal");
		list01.add("Ayse");// en sonunucuyu en sona atacağı için yerini belirtmeye gerek yok. direkt "Ayse" yazmak yeterli
		System.out.println(list01);
		
		
		//list01'in eleman sayisini ekrana yazdirin
		System.out.println("list01'in eleman sayisi: " + list01.size());//6
		
		
	}

}
