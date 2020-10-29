package day23date;

import java.time.LocalDate;

public class Date02 {

	public static void main(String[] args) {
		// Date Manipulation(Date uzerinde degisiklikler yapmak)
		
	
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
//==>	Gun Ekleme		
		System.out.println(date.plusDays(3));// 3 gun sonrasini gosteriyor
		System.out.println(date.plusDays(35));// gun fazla olunca ay veya yil da degisir
		System.out.println(date.plusDays(-1));//cok kullanilmayan method. bunun icin baska method var

//==>	Hafta Ekleme
		System.out.println(date.plusWeeks(4));		
		
//==>	Ay Ekleme	
		System.out.println(date.plusMonths(2));//2 ay sonrasini return eder
		
//==>	Yil Ekleme
		System.out.println(date.plusYears(3));
		
//==>	Gun Cikarma
		System.out.println(date.minusDays(5));
		
//==>	Hafta Cikarma
		System.out.println(date.minusWeeks(2));
			
//==>	Ay Cikarma
		System.out.println(date.minusMonths(2));
		
//==>	Yil Cikarma
		System.out.println(date.minusYears(7));
		

		
	}

}
