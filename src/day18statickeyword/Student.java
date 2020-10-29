package day18statickeyword;

public class Student {

	int number;
	String name;
	static String college = "ITS";
	
	Student(int r, String n, String college){
		number = r;
		name = n;
		college = college; //college static olduğu için bunu yazmamıza gerek yok. her yerden ulaşılabilir. problem oluşturmaz
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student(111, "Karan", "MIT");
		Student s2 = new Student(222, "Aryan", "Harvard");
		
		System.out.println(s1.number);
		System.out.println(s2.number);
		
		System.out.println(s1.name);
		System.out.println(s2.name);
		
		System.out.println(s1.college); //static olduğu için parametreli objede hiç bir değişikliğe uğramaz. cevap "ITS"olur.
		System.out.println(s2.college);// static olduğu için s1. veya s1. yazmamıza gerek yok. sadece college yazmamız yeterli
		
	}

}
