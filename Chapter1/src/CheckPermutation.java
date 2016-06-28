import java.util.Arrays;

public class CheckPermutation {
	public static void main(String args[]){
		System.out.println(permutation("the eyes","they see"));
	}
	public static boolean permutation(String str1, String str2){
		if(str1.length()!=str2.length()){
			return false;
		}
		char[] a=str1.toCharArray();
		char[] b=str2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		return Arrays.equals(a, b);
	}

}

