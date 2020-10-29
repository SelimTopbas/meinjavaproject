package day23date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date01 {

	public static void main(String[] args) {

		// Bugunun tarihini ekrana yazdiralim

		System.out.println(LocalDate.now());
		
		// Bugunun zamanını saat, dakika, saniye ve salise olarak ekrana yazdiralim
		System.out.println(LocalTime.now());

		//Bugünün tarihin ve zamanını ekrana yazdıralım
		System.out.println(LocalDateTime.now());// 2020-05-20T17:02:19.740 Buradaki "T" tarih ile
												// zamani ayirmak icin konuluyor

	}

}
