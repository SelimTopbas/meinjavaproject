package warm_up;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Day1a {
	public static void main(String[] args) {

	 
isAnagram(null, null);	  		
	  }
	
	 public static boolean isAnagram(String word1, String word2) {
	   
	  		int count = 0;
			for(int i=0; i<=word1.length()-1; i++) {
				for (int j=0; j<=word2.length()-1; j++) {
					
					if(word1.charAt(i) == word2.charAt(j)) {
						count++;
					}
				}
			}
			if (count == word1.length() && count == word2.length()) {
				return true;
			}else {
			return false;
			}
	    
	  }

}
