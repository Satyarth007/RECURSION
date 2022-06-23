
public class stringpalindrome {
	public static boolean ispalindrome(String s ,String str, int i) {
		
		if(s.equals(str)) {
			return true;
		}
		else if(i>=0){
			str=str+s.charAt(i);
			i=i-1;
			ispalindrome(s,str,i);
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madam";
		String str="";
		int i=s.length()-1;
		System.out.println(ispalindrome(s,str,i));

	}

}
