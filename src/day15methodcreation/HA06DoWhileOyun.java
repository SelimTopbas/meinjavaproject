package day15methodcreation;


import java.util.Scanner;

public class HA06DoWhileOyun {

	public static void main(String[] args) {
		//Sicak Soguk oyunu. Eger kullanici 124 ile 134 arasi bir tek sayi girerse kazanir
		// Bu araliga yaklasirsa "Sicak" uzaklasirsa "Soguk" mesaji alir

		int num = 0;
		oyun(num);
	}

	public static void oyun(int num) {
		
		Scanner scan = new Scanner(System.in);
		String a = "Tahminde Bulun: ";
		
		do {
			System.out.println(a);
			num = scan.nextInt();
		
			if(num<50) {
				System.out.print("Cok soguk! Yukari dogru Cik" + "\n" + "Tekrar ");
			}else if (num>=50 && num<75) {
				System.out.print("Soguk! Biraz daha yukari" + "\n" + "Tekrar ");
			}else if (num>=75 && num<100) {
				System.out.print("Ilik oldu. Ha Gayret! Biraz daha yukari" + "\n" + "Tekrar ");
			}else if (num>=100 && num<125) {
				System.out.print("Sicak! Ha Gayret" + "\n" + "Tekrar ");
			}else if (num>=125 && num<136 && num%2==0) {
				System.out.print("Kayniyor! Sayilarin arasindasin. Pes etme!" + "\n" + "Tekrar ");	
			}else if(num>=125 && num<136 && num%2==1){
				System.out.println("Tebrikler! Buldun sayiyi");
			}else if (num>=136 && num<150) {
				System.out.print("Sicak! Ha Gayret" + "\n" + "Tekrar ");
			}else if (num>=150 && num<175) {
				System.out.print("Ilik oldu. Ha Gayret! Biraz daha asagi" + "\n" + "Tekrar ");
			}else if (num>=175 ) {
				System.out.print("Okadar yukarilarda ucma. Biraz asagi" + "\n" + "Tekrar ");
			}
		}while(!(num>=125 && num<136 && num%2==1));
		
		scan.close();
	}
	
}
