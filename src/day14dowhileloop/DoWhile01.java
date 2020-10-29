package day14dowhileloop;

public class DoWhile01 {

	public static void main(String[] args) {
		
		
		int num = 1;
		do {
			System.out.println(num);
			num++;
		} while (num < 4);
		
		

		// 10 ile 20 arasindaki tek tamsailari do-while ile yazdir

		int num2 = 10;
		do {
			if (num2 % 2 == 1) {
				System.out.println(num2);
			}
			num2++;
		} while (num2 < 20);

	}

}
