package practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicate {
	
	public static List<Integer> findDuplicate(List<Integer> list){
		ArrayList<Integer>duplicate=new ArrayList<>();
		HashMap<Integer, Integer> countMap=new HashMap<>();
		
		for(Integer num:list) {
			countMap.put(num, countMap.getOrDefault(num, 0)+1);
		}
		
		for(Map.Entry<Integer, Integer>entry:countMap.entrySet()) {
			if(entry.getValue()>1) {
				duplicate.add(entry.getKey());
			}
		}
		return duplicate;
	
	}
	
	public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);
        numbers.add(5);

        List<Integer> duplicateList = findDuplicate(numbers);
        System.out.println("Duplicate elements in the list: " + duplicateList);
	}

}
