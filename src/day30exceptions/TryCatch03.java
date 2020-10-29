package day30exceptions;

public class TryCatch03 {

	public static void main(String[] args) {

		System.out.println(exceptions());

	}

	@SuppressWarnings("finally")
	public static String exceptions() {

		String result = "";
		String v = null;

		try {
			try {
				result += "before";
				v.length(); //Exception verdiği için alt satırı es geçecek, catch e gidecek
				result += "after";

			} catch (NullPointerException e) {
				result += "cath";
				throw new RuntimeException();
			} finally {
				result += "finally";
				throw new Exception();
			}
		} catch (Exception e) {
			result += "done";
		}
		return result;
		
		//String'e null atadığımız zaman length, exception verir
		
		
		/*
		 		throw ile throws keywordlerinin farkı:
		 1)	throw method body'si icine yazılır, throws ise method parantezi ile curly brace'in arasına yazılır
		 2) throw'u method body'si icinde exception almak istediğimiz yerde kullanabiliriz
		 	throws ise mecburen method isminden sonra bir kere kullanılabilir
		 3)	1 throw sadece 1 tane exception üretir, 1 throws ile birden cok exception uretebilirsiniz
		 	Yani " ) throws NullPointerException, ArithmeticException { " mumkun
		 4) throw icin syntax ==> throw new NullPointerException;
			throws icin syntax ==> throws NullPointerException
		 
		 
		 
		 */
		 
		
	}

}
