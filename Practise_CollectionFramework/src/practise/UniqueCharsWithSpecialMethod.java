package practise;

import java.util.HashSet;

public class UniqueCharsWithSpecialMethod {
	
	public static boolean isUnique(String str) {
		HashSet<Character> set=new HashSet<>();
		
		for(char ch:str.toCharArray()) {
			if(set.contains(ch)) {
				return false;
			}
			set.add(ch);
		}
		return true;
	}
	
	public static void main(String[]args) {
		String str="abcdeafg";
		boolean result=isUnique(str);
		System.out.print(result);
	}


}
