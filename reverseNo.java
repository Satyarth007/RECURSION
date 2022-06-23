
public class reverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234;
		int digits=(int)(Math.log10(n)+1);
		System.out.println(fun(n,digits));

	}
	 public static int fun(int n,int digits) {
		if(n%10==n) {
			return n;
		}
		 
		int rem=n%10;
		return rem*(int)(Math.pow(10,digits-1))+fun(n/10,digits-1);
	}
	

}
