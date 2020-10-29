package day30exceptions;

public class TryCatch02 {

	public static void main(String[] args) {

		String s = "";
		System.out.println(s.length());//0
		
		
		try {
			s+="t";
		}catch(Exception e) {
			s+="c";
		}finally {
			s+="f";
		}
		s+="a";
		System.out.println(s);
		
		//String'e null atandığı zaman veya instance variableye değer ataması yapılmadığında
		//length() methodu çalışmaz, ve NullPointerException alınır
		//NullPointerException Runtime Exception dır
		
		//Aşağıdakiler Exception verdiği için yoruma aldım...
	
		//String n = null;
		//System.out.println(n.length());
		
		//String m;
		//System.out.println(m.length());
	}

}
