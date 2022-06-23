import java.util.*;
public class printing_array_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE N : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
	//	printarray(arr,0);
		printarray(arr,arr.length-1);

	}
	public static void printarray(int[] arr,int j) {
		if(j<0) {
			return;
		}
		System.out.print(arr[j]+" ");
		//pinting from start to end
	    //	printarray(arr,++j);
		printarray(arr,--j);
	}

}
