package day24varargsaccessmodifiers;

import java.util.Scanner;

public class Deneme {

	public static void main(String[] args) {
		
		
		 
		
		
//		
//	Scanner scan = new Scanner(System.in);
//	String str = scan.nextLine();
//	System.out.println("Bir string; ");
//	String str = scan.nextLine();
//	System.out.println("inteeger: ");
//	int n = scan.nextInt();
	
	String word = "madam";
	int idx = word.length() - 1; 
	int i;
	int count = 0;
	for(i = 0; i<idx; i++);{
		for(int j=idx; j>0; j++) {
			
			if (word.charAt(i) != word.charAt(j)) {
				count++;
			}
		}
	}
	
	if(count==0) {
		System.out.println("dsa");
	}
	
//	 int i = 0, j = word.length() - 1; 
//	  
//     
//     while (i < j) { 
//
//         
//         if (word.charAt(i) != word.charAt(j)) 
//           
//
//       
//         i++; 
//         j--; 
//     } 
//
//     
//    System.out.println("eia");
 
		
		
	
	}

}
