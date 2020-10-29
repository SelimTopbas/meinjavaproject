package day23date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Date04 {

	public static void main(String[] args) {
		// Date formatini dgistirmek
		
		LocalDate date = LocalDate.now();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		System.out.println(dtf.format(date));
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
		System.out.println(dtf1.format(date.plusMonths(7)));
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy/M/dd");
		System.out.println(dtf2.format(date));
		
		
		//Time Formatini Degistirmek
		
		LocalTime time = LocalTime.now();
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("hh:mm"); //Kullanırsak 24'lük zaman dilimini kullanır
		System.out.println(dtf3.format(time));
		System.out.println(dtf3.format(time.plusHours(3)));// 3 saat ekler
		
		//Baska ülkenin localzamanını almak
		System.out.println(LocalTime.now(ZoneId.of("Europe/Berlin")));


		
		
		
	}

}
