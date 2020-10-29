package day38interviewhazirlik;

public class PostAndPreIncrement {

	public static void main(String[] args) {

		
		//Post increment
		int a = 12;
		a = a++;
		System.out.println(a);// 12

		//Post increment
		int b = 12;
		b++;
		System.out.println(b);// 13

		//Pre increment
		int c = 12;
		 ++c; //veya c = ++c; şeklinde de yazılabilir
		System.out.println(c);//13

	}

}
