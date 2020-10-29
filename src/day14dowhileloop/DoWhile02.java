package day14dowhileloop;

public class DoWhile02 {

	public static void main(String[] args) {
		//do-while ile while loop'larin farki
		//condution yanlış olursa bile do while döngüsü en az bir kere çalışır. ama while döngüsü çalışmaz
		
		// eğer interview de sorulursa farklar aşağıdaki gibi...
		
		int num1=7; 
		while(num1<7) {//false oldugu icin ekrana hic birsey yazdirmaz. while de önce condution a bakılır sonra iş yapılır
			System.out.println("While: " + num1);
			num1++;
		}

		int num2=7; 
		do {//condution yanlis iolmasina ragmen bir sefer calisir ve ekrana 7 yazdirir. do while önce iş yapar sonra condutiona bakar
			System.out.println("Do while: " + num2);
			num2++;
		}while(num2<=2);
	
	}

}
