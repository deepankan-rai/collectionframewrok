package practise;

public class UniqueChars {
	
	public static boolean isUnique(String str) {
		int len=str.length();
		
		for(int i=0;i<len-1;i++) {
			for(int j=i+1;j<len;j++) {
				if(str.charAt(i)==str.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[]args) {
		String str="abcdeafg";
		boolean result=isUnique(str);
		System.out.print(result);
	}

}
