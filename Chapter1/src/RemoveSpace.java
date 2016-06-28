
public class RemoveSpace {
	public static void main(String[] args){
		//StringBuffer buffer=new StringBuffer("a s d f");
		//buffer.replace( , end, str);
		method2("23e21231231 231123123");
		
	}
	
	public static void method2(String str1){
		int len=str1.length();
		char[] str=str1.toCharArray();
		
		int spaceCount=0;
		for(int i=0; i<len; i++){
			if(str[i]==' ')
				spaceCount++;
		}
		
		int newLength= len+spaceCount*2;
		char[] newStr=new char[newLength];
		
		for(int i=len-1;i>=0;i--){
			if(str[i]==' '){
				newStr[newLength-1]='0';
				newStr[newLength-2]='2';
				newStr[newLength-3]='%';
				newLength=newLength-3;
			}
			else{
				newStr[newLength-1]=str[i];
				newLength=newLength-1;
			}
		}
		
		System.out.println(newStr);
	}
}
