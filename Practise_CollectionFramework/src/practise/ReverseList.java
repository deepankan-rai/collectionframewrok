package practise;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {
	
	public static List<Integer> reverseList(List<Integer> list){
		ArrayList<Integer>reversedList=new ArrayList<>(list.size());
		
		for(int i=list.size();i>=0;i--) {
			reversedList.add(i);
		}
		return reversedList;
		
	}
	
	  public static void main(String[] args) {
	        List<Integer> originalList = new ArrayList<>();
	        originalList.add(1);
	        originalList.add(2);
	        originalList.add(3);

	        List<Integer> reversedList = reverseList(originalList);
	        System.out.println("Reversed List: " + reversedList);
	  }

}
