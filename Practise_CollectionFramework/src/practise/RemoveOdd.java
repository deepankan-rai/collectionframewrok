package practise;

import java.util.ArrayList;
import java.util.List;

public class RemoveOdd {
	
	public static List<Integer>removeOdd(List<Integer>list){
		
		ArrayList<Integer>even=new ArrayList<>();
		for(Integer i:list) {
			if((i%2)==0) {
				even.add(i);
			}
			
		}
	
			
)
			
	
		return even;
		
	}
	
	public static void main(String args[]) {
		List<Integer> ogList=new ArrayList<>();
		ogList.add(2);
		ogList.add(5);
		ogList.add(6);
		ogList.add(7);
		ogList.add(12);
		ogList.add(9);
		List<Integer> evenList=removeOdd(ogList);
		System.out.print(evenList);
	}

}
