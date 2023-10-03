package practise;

import java.util.HashMap;

public class PermutationPalindrome {

	
	public static boolean isPalindromePermutaion(String str) {
		
		int oddcount=0;
		String strr=str.replaceAll(" ", "").toLowerCase();
		
		HashMap<Character, Integer> count=new HashMap<>();
		
		for(char ch:strr.toCharArray()) {
			count.put(ch, count.getOrDefault(ch, 0)+1);
		}
		
		for(int i:count.values()) {
			if(i%2!=0) {
				oddcount++;
			}if(oddcount>1) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str="Tact Coa";
		boolean result=isPalindromePermutaion(str);
		System.out.print(result);
	}
}
