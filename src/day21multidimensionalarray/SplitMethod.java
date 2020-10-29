package day21multidimensionalarray;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		
		String str = "Ali Can okula basladi, nasil oldu? Iyi oldu ama zor.";
		//split() methodunu kullanmak icin mutlaka bir array olusturulmali
		String kelime [] = str.split(" ");	//l harfine gore parcalarsam l ler kalmayacak, imha edilecek. 4 parcaya ayrilacak
											// a harfine gore olsaydi 5 parcaya ayrilacakti.
											//bosluklara gore de parcalayabilirim.(Office word de kelime sayisi bu mantikla calisiyor)
		
		System.out.println(Arrays.toString(kelime));
		System.out.println("Kelime sayisi: " + kelime.length);
		
		
	//karakter sayisini bulalim
		
		String str2 = "Kahramanmaras";
		String harf[] = str2.split("");//Bildiğimiz gibi "" hiç birşey demek. ve Stringlerde her harfin öncesini ve sonrasını kesiyor
		System.out.println(Arrays.toString(harf));
		System.out.println("Harf sayisi: " + harf.length);
	}

}
