import java.util.Scanner;

public class firstIndex {
	public static int firstIdx(int[] arr, int i, int key) {
		
		if( i == arr.length) return -1;
		
		
		if(arr[i]== key ) return i;
		
		int a = firstIdx(arr,i+1,key);
		return a;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int arr[]= {4,3,6,9,3,6,7,2};
		int key=9;
		
		int ans= firstIdx(arr,0,key);
		System.out.println(ans);

	}

}
