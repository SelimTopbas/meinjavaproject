package day29polymorphismexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception02 {

	// Checked Exception'ları (Compile Tmie Exception) handle etmek icin iki yol var
	// 1."throws" keyword'unu kullanmak. Bunu kullanıldığında console'da teknik
	// mesajlar görünür.
	// Bu yüzden çok tercih edilmez
	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream file = new FileInputStream("C/ogrenci.text");

	}

} 
//Ikıncısı try-catch block kullanmaktır. Bunu kullanırsanız console da teknık mesajlar yerıne
//kendi yazdıgınız mesajları gorebılırsınız. Bu yuzden try-catch kullanmak tercih edilir.
class ExceptionTryCatch {
	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream("C/ogrenci.text");
		} catch (FileNotFoundException e) {
			
			System.out.println("Dosya'nin path'i yanlis veya dosya silinmis olabilir");
			
		}

		
		
		
		
	}
}
