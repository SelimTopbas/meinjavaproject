package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterviewYontem2 {

	public static void main(String[] args) {

		// Kullanicidan bir String alin ve bu String'i tersten yazdirin(bu soru interwievde cok soruluyormus)
		// Bu sorunun kodunu bilmeden interview'e katilma
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir cumle veya kelime giriniz: ");
		String str = scan.nextLine();
		
		int length = str.length()-1;
		
		while(length>=0) {
			System.out.print(str.charAt(length));
			length--;
		}
		scan.close();
	}

}
