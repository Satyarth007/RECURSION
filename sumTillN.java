import java.util.Scanner;

public class sumTillN {
	
	// functional recursive call
	public static int sum(int n) {
		if(n<=0) return 0;
		
		else return n+sum(n-1);
	}
	
	// parametrized recursive call 
	public static void summ(int n,int sum) {
		if(n<1) { 
			System.out.println(sum);
			return;
		
		}
		summ(n-1,sum+n);	
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER N:- ");
		int n=sc.nextInt();
		int s=sum(n);
		summ(n,0);
		System.out.println(s);

	}

}
