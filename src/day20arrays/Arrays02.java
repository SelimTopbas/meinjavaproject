package day20arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {

		//Bir integer array'in elemanlarını küçükten büyüğe diziniz ve ekrana iki durumu da yazdırınız
		
		int arr[] = {2, 11, 0, 23, 7};
		System.out.println("Siralanmadan once: " + Arrays.toString(arr));
		
		//Arrays.sort(); methoduna parametre olarak array'in ismi yazilirsa 
		//o array'in elemanlari kucukten buyuge (Ascending order, natural order) siralanmis olur
		Arrays.sort(arr);
		System.out.println("Siralanmadan sonra: " + Arrays.toString(arr));
		
		
		
		//Charlardan olusan olusan bir array olusturunuz ve ascending order yapiniz
		
		char arrCh[] = {'c', 'a', 'z', 'k', 'A'};
		System.out.println("Siralanmadan once: " + Arrays.toString(arrCh));
		
		Arrays.sort(arrCh);
		System.out.println("Siralanmadan sonra: " + Arrays.toString(arrCh));
		
		//Stringlerden olusan bir array olusturunuz ve ascending order yaoiniz
		String arrStr[] = {"Mahmut", "mehmet", "Can", "Selim", "Kemal"};//Küçük harfle başlayanları sona atıyor
		System.out.println("Siralanmadan once: " + Arrays.toString(arrStr));
		
		Arrays.sort(arrStr);
		System.out.println("Siralanmadan sonra: " + Arrays.toString(arrStr));
		
		//Boolean lar için Arrays.sort methodu kullanılamaz
		

		
		
		
	}

}
