package warm_up;

public class Method11 {

	public static void main(String[] args) {

		String str = "bad";

		System.out.println(hasBad(str));

	}

	public static boolean hasBad(String str) {

		if (str.length() > 2 && str.substring(0, 3).equals("bad")) {
			return true;
		}
		else if (str.length() > 3 && str.substring(1, 4).equals("bad"));
			return false;

	}

}
