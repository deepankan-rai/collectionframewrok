package practise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CommonElements {

	public static List<Integer> findCommon(List<Integer>list1,List<Integer>list2){
		
		HashSet<Integer>set1=new HashSet<>(list1);
		HashSet<Integer>set2=new HashSet<>(list2);
		
		HashSet<Integer>commonSet=new HashSet<>();
		
		for(int i:set1) {
			if(set2.contains(i)) {
				commonSet.add(i);
			}
		}
		List<Integer>commonList=new ArrayList<>(commonSet);
		return commonList;
	}
	
	
	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<>();
		list1.add(3);
		list1.add(6);
		list1.add(7);
		list1.add(2);
		list1.add(3);
		
		List<Integer> list2=new ArrayList<>();
		list2.add(6);
		list2.add(4);
		list2.add(7);
		list2.add(8);
		list2.add(0);
		list2.add(1);
		
		List<Integer> duplicateList=findCommon(list1,list2);
		System.out.print(duplicateList);
	}
}
