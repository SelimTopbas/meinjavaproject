package day15methodcreation;

import java.util.Scanner;

public class HA03RakamlarToplamiInterview {

	public static void main(String[] args) {
		// Kullanıcıya sayı girmesini söyleyin. Kullanıcının girdiği sayının rakamları toplamını 
		//ekrana yazdıran bir program yazın.	
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir sayi Giriniz: ");
		int num = scan.nextInt();
		
	islem(num);
	scan.close();
	}
	
	public static void islem(int num) {
		
		int sum = 0;
		while (num!=0) {
			sum+=num%10;
			num=num/10;
		}
		System.out.println(sum);
	}

}
