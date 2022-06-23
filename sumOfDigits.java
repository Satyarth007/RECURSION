
public class sumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234;
		System.out.println(sumofdigits(n));
	}
	public static int sumofdigits(int n) {
		if(n==0) {
			return 0;
		}
		return (n%10)+sumofdigits(n/10);
	}

}
