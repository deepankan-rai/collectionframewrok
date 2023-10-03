package practise;

public class CheckOneEditAway {
	

	public static boolean isOneEdit(String str1, String str2) {
		int len1=str1.length();
		int len2=str2.length();
		
		if(Math.abs(len1-len2)>1) {
			return false;
		}
		
		  String shorter = len1 < len2 ? str1 : str2;
	      String longer = len1 < len2 ? str2 : str1;
		
		int index1=0;
		int index2=0;
		boolean diff=false;
		
		while(index1<shorter.length() && index2<longer.length()) {
			if(shorter.charAt(index1)!=longer.charAt(index2)) {
				if(diff) {
					return false;
				}
				diff=true;
				
				if(len1==len2) {
					index1++;
				}
			}else {
				index1++;
			}
			index2++;
		}
		return true;
	}
	
	public static void main(String[] args) {
        String str1 = "pale";
        String str2 = "ple";
        boolean result = isOneEdit(str1, str2);
        System.out.println(result);
	}

}
