package warm_up;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calisma02 {
	// kullanıcı bir String ve pozitif tamsayi giriyor...java bize integer kadar
	// stringi kopyalayıp geri veriyor.

	public static void main(String[] args) {

		int num = 7;
		int length = 5;

		int arr[] = new int[length];

		for (int i = 0; i < 5; i++) {

			arr[i] = num * (i + 1);
		}

		System.out.println(Arrays.toString(arr));

	}

}
