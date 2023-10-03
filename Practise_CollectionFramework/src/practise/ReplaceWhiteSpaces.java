package practise;

public class ReplaceWhiteSpaces {
	
	public static void replaceSpaces(char[]str,int length) {
		int spaceCount=0;
		
		for(int i=0;i<length;i++) {
			if(str[i]==' ') {
				spaceCount++;
			}
		}
		
		int newIndex=length+spaceCount*2;
		
		for(int i=length-1;i>=0;i--) {
			if(str[i]==' ') {
				str[newIndex-1]='0';
				str[newIndex-2]='2';
				str[newIndex-3]='%';
				newIndex-=3;
			}else {
				str[newIndex-1]=str[i];
				newIndex--;
			}
		}
	}
	
	public static void main(String[] args) {
		String str="My John Smith    ";
		int length=13;
		char[]ch=str.toCharArray();
		replaceSpaces(ch,length);
		
		String result=new String(ch);
		System.out.print(result);
	}

}
