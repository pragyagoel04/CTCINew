
public class CompressString {
	public static void main(String args[]){
		System.out.println(compress("a"));
		System.out.println(compress("aaa"));
		System.out.println(compress("aaaabbbbccccaaaa"));
		System.out.println(compress("aaaaaaasssssaaaaacccccccfffffasdasfsesedgrthr"));
		System.out.println(compress("gkfajbslfjhahabdrg"));
		
	}
	
	public static String compress(String str){
		String result="";
		//System.out.println(str.length());
		int sum=1;
		for(int i=0;i<str.length()-1;i++){
			if(str.charAt(i)==str.charAt(i+1))
				sum++;
			else{
				result=result+str.charAt(i)+sum;
				sum=1;
			}
		}
		result=result+str.charAt(str.length()-1)+sum;
		//System.out.println(result);
		return result.length() < str.length() ? result : str;
	}

}
