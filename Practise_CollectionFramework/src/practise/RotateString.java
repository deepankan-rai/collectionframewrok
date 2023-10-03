package practise;

public class RotateString {
	
	public static boolean isSubstring(String str1,String str2) {
		return str1.contains(str2);
	}
	
	public static boolean isRotation(String str1,String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		String str3=str1+str1;
		
		return isSubstring(str3, str2);
	}
	
	public static void main(String args[]) {
		String str1="waterbottle";
		String str2="erbottlewat";
		
		boolean res=isRotation(str1, str2);
		System.out.print(res);
	}

}
