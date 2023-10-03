package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {
	
	 public static Map<String, List<String>> groupAnagrams(List<String> words) {
	        Map<String, List<String>> anagramGroups = new HashMap<>();

	        for (String word : words) {
	            char[] charArray = word.toCharArray();
	            Arrays.sort(charArray);
	            String sortedWord = new String(charArray);
	            if (!anagramGroups.containsKey(sortedWord)) {
	                anagramGroups.put(sortedWord, new ArrayList<>());
	            }
	            anagramGroups.get(sortedWord).add(word);
	        }

	        return anagramGroups;
	    }

	    public static void main(String[] args) {
	        List<String> words = new ArrayList<>();
	        words.add("bat");
	        words.add("tab");
	        words.add("act");
	        words.add("cat");

	        Map<String, List<String>> anagramGroups = groupAnagrams(words);

	        for (List<String> group : anagramGroups.values()) {
	            System.out.println(group);
	        }
	    }

}
