package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterviewYontem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir cumle veya kelime giriniz: ");
		String str = scan.nextLine();
		
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		scan.close();
	
	}

}
