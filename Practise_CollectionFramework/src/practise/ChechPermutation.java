package practise;

import java.util.Arrays;

public class ChechPermutation {
	
	public static boolean CheckPermutation(String str1,String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		char[] chararr1=str1.toCharArray();
		char[] chararr2=str2.toCharArray();
		
		Arrays.sort(chararr1);
		Arrays.sort(chararr2);
		
		return Arrays.equals(chararr1, chararr2);
	}
	
	public static void main(String[] args) {
		String str1="hello";
		String str2="lloeh";
		
		boolean result=CheckPermutation(str1, str2);
		System.out.print(result);
	}

}
