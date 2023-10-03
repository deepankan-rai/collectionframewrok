package practise;

import java.util.HashMap;
import java.util.Map;

public class CountString {
	
	public static Map<Character, Integer>countChar(String str){
		Map<Character,Integer>count=new HashMap<>();
		
		char[] arr=str.toCharArray();
		
		for(char ch:arr) {
			count.put(ch, count.getOrDefault(ch, 0)+1);
		}
		return count;
	}
	
	public static void main(String[] args) {
		  String inputString = "programming";

	        Map<Character, Integer> charCountMap = countChar(inputString);
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
	        }
	    
	}

}
