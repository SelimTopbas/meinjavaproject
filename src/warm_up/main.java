package warm_up;

import java.util.ArrayList;
import java.util.List;

class Main {
	public static void main(String[] args) {
		String s[]= {"Tomato", "Potato", "Pair"};
		
		System.out.println(isFourLetters(s));
	}

	public static String[] isFourLetters(String[] s) {
		
		
		
		List<String> list = new ArrayList<>();

		for (int i = 0; i < s.length; i++) {
			if (s[i].length() == 4)
				list.add(s[i]);
		}
		String[] result = new String[list.size()];
		list.toArray(result);
		return result;

	}

}
