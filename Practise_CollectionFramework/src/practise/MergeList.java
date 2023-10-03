package practise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MergeList {
	
	public static List<Integer> mergeListDuplicate(List<Integer>list1,List<Integer>list2){
		HashSet<Integer>mergedSet=new HashSet<>();
		
		mergedSet.addAll(list1);
		mergedSet.addAll(list2);
		
		List<Integer> mergedList=new ArrayList<>(mergedSet);
		
		return mergedList;
	}
	
	 public static void main(String[] args) {
	        List<Integer> list1 = new ArrayList<>();
	        list1.add(1);
	        list1.add(2);
	        list1.add(3);

	        List<Integer> list2 = new ArrayList<>();
	        list2.add(3);
	        list2.add(4);
	        list2.add(5);

	        List<Integer> mergedList = mergeListDuplicate(list1, list2);
	        System.out.println("Merged list without duplicates: " + mergedList);
	 }

}
