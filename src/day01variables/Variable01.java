package day01variables;

public class Variable01 {

	public static void main(String[] args) {
		
		int maas = 3000;
		
		char harf = 'S';// char lara değer atarken mutlaka tırnak içerisinde yazılır
		System.out.println(maas);		
		System.out.println(harf);
		
		boolean isOld = true; //booleanlar için sadece iki değer verilir. true veya false
		System.out.println(isOld);
		
		boolean isNew = false; 
	
		System.out.println(isNew);
		
		byte derinlik = -128; //-128 den 127 ye kadar ==> 8 bit
		System.out.println(derinlik);
		
		short sirnakNufus = 27989;
		System.out.println(sirnakNufus);
		
		long hucreSayisi = 9145379490329483459l; //integer sınırını aşan long sayıyı yazmak için sonuna 'l' veya 'L' eklenir
		System.out.println(hucreSayisi);
		
		double pi = 3.143459827345; //Java bütün ondalık sayıları otomatik olarak double kabul eder
		System.out.println(pi);
		
		float para = 5.25f;
		System.out.println(para); // bir ondalık sayıyı float yapmak için sonuna 'f' veya 'F'eklenir
		
		String ögrenciIsmi = "Ali Can"; 
		System.out.println(ögrenciIsmi);
	}

}
