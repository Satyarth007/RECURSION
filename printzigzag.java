import java.util.Scanner;
public class printzigzag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE N : ");
		int n=sc.nextInt();
		pzz(n);
		

	}
	public static void pzz(int n) {
		if(n==0) {
			return;
		}
		System.out.print(n+" ");
		pzz(n-1);
		System.out.print(n+" ");
		pzz(n-1);
		System.out.print(n+" ");
	}

}
