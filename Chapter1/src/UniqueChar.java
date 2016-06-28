
public class UniqueChar {
	public static void main(String args[]){
		boolean check = CheckDuplicate("you are fantastic");
		System.out.println("Result: "+check);
		
	}
	
	public static boolean CheckDuplicate(String str){
		int count=0;       						//0000000000.......
		if(str.length() > 256){
			return false;
		}
		for(int i=0; i<str.length(); i++){
			int val=str.charAt(i)- 'a';        	//a=97...y=121...val=24
			
			if ((count & (1 << val)) > 0) {		//000000.. & 100000000....24
				return false;
			}
			count = count | (1 << val);			//100000000...24
		}
		return true;
	}

}
