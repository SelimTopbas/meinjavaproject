package day06ifstatement;

import java.util.Scanner;

public class HA12MileniumOnYuzYil {

	public static void main(String[] args) {
		// Kullanıcıdan notunu alın ve aşağıdaki kurallara göre ekrana A, B, C veya D yazdırın.
		// 1. 50 den az - D 
		// 2. 50(dahil) ile 60 arası - C 
		// 3. 60(dahil) ile 80 arası - B. 
		// 4. 80(dahil) ustu- A
	
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Notunuzu Giriniz: ");
		int not = scan.nextInt();
		
		if (not < 0) {
			System.out.println("Eksi değerli not girdiniz");
		}
		else if(not < 50) {
			System.out.println("D aldınız");
		}else if (not < 60) {
			System.out.println("C aldınız");
		}else if (not < 80) {
			System.out.println("B aldınız");
		}else if (not <= 100) {
			System.out.println("A aldınız");
		}else {
			System.out.println("Hatalı not girdiniz");
		}
	
		scan.close();
	}

}
