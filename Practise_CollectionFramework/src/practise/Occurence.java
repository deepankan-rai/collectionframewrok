package practise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Occurence {

	
	 public static Map<Integer, Integer> countOccurrences(List<Integer> list) {
	        Map<Integer, Integer> occurrencesMap = new HashMap<>();

	        for (Integer i : list) {
	            occurrencesMap.put(i, occurrencesMap.getOrDefault(i, 0) + 1);
	        }

	        return occurrencesMap;
	    }

	    public static void main(String[] args) {
	        List<Integer> numberList = List.of(1, 2, 3, 2, 1, 3, 4, 5, 4, 6);

	        Map<Integer, Integer> occurrences = countOccurrences(numberList);
	        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
	            System.out.println("Number: " + entry.getKey() + ", Occurrences: " + entry.getValue());
	        }
	    }
}
