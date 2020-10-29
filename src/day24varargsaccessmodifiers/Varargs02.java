package day24varargsaccessmodifiers;

public class Varargs02 {

	public static void main(String[] args) {
		// Varargs'in yanlış kullanımları

//==> 	KURAL 1:	Varargs her zaman son parametre olmalidir
		//         Cunku ilk parametre yaparsaniz girdiginiz her deger
		//         varargs'in icine duser, siz asla ikinci parametreye deger


		valueChar("Character: ", 'a');
		valueChar("Character: ", 'a', 'b');//"Character" bir String, 'a' ve 'b' ise Vararg in elemanları. 
//		bir methdoda varargın yanında başka parametreler de kullanabiliriz. Ama tek kural==>Vararg her zaman en sonda olmalı

	}

//Kural 1:
	public static void valueChar(String s, char... c) {//Birinci parametre String. Vararg değil. char bir vararg tır. 

		for (char w : c) {
			System.out.print(s);
			System.out.println(w);
		}

	}

//		public static void product(int... x, int y) {   ==> bu sekilde kullanamayiz, cunku varargtan sonra parametre olamaz
//		}
	
	
//==>	KURAL 2: Parametre olarak birden fazla varargs kullanamazsınız		
//		Cunku Varargs en sonda olmalidir ve en sonda olmak tek olmayi gerektirir

//		public static void product(int... x, int... y) {   ==> kullanamayiz, cunku varargtan sonra Tekrar Varargs olamaz
//		}
	
	
	
	
}
