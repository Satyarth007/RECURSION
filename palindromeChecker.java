
public class palindromeChecker {
	public static boolean palin(int l, int r, String s) {
		
		if(l>=r) return true;   // when mid value crossed  , this will run in the last recursive call
		
		if(s.charAt(l) != s.charAt(r)) return false; // when mirrored element is not same
		
		else return palin(l+1,r-1,s);	// recursive call to solve the next  mirrored elements
		
	}

	public static void main(String[] args) {
		String s= "mom";
		
		// palindrome checker using recursion
		boolean ans = palin(0,s.length()-1,s);
		System.out.println(ans);

	}

}
