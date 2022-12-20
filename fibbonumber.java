
public class fibbonumber {
	public static int fib(int n) {
		if(n==1) return 0;
		if(n==2) return 1;
		return fib(n-1)+fib(n-2);
	}
	

	public static void main(String[] args) {
		// code for n^th fib no.
		int n=7;
		int f=fib(n);
		System.out.println("N^th fib no :- "+f);

	}

}
