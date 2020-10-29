package day29polymorphismexception;

public class Exception03 {

	public static void main(String[] args) {
		// Bölme işlemi yapan bir program yazalım
		int num1 = 12;
		int num2 = 0;
		try {
			System.out.println(num1 / num2);
		} catch (ArithmeticException e) {
			System.out.println("Sifir ile bolme yapilmaz");
		}
		
		//ArithmeticException, Run Time Exception'dır. Matematik kurralarına uygun olmayan bir islem yapıldığında
		//bu exception alınır.
		//try'dan sonra birden fazla cathc kullanılabilir. Ama üstteki catch alltaki catchin child'i olmalıdır
		//catch'leri specific'den Genel'e doğru dizilmeliL

		//Yukardaki kod'un devamı:
		
		catch (Exception e) {
			System.out.println("Her Exception'i yakala");
		}
	}

}
