package day06ifstatement;

public class IfStatement01 {

	public static void main(String[] args) {

		if(6 > 2) {
			System.out.println("if body calisti");
			
		}
		System.out.println("if body calismadi");
	
	
	//bir int variable oluşturun ve ona bir değer atayın. atadığınız değer positiv ise ekrana positiv, 
	//negativ iseekrana negativ yazdırın
	
		int num = 12;
		
		if (num > 0) {
			System.out.println("Pozitif");
		}
	
		if (num < 0) {
			System.out.println("Negativ");
		}
		
		if (num == 0) { 
			System.out.println("notr");
			
		}
	}

}
