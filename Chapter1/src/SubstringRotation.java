
public class SubstringRotation {
	public static void main(String args[]){
		isSubstring("balampichkari","ampichkaribal" );
		isSubstring("hkari","ampichkaribal" );
		isSubstring("sdf","asd" );
	}
	
	public static void isSubstring(String str1, String str2){
		if((str1.length()!=str2.length())){
			System.out.println("String1 is not a rotation of String2");
		}
		else{
			String str3=str1+str1;
			if(str3.contains(str2)){
				System.out.println("String1 is rotation of String2");
			}
			else
				System.out.println("String1 is not a rotation of String2");
		}
			
	}
}
