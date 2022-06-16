
public class linearSearch {
	public static boolean search(int[] arr,int n,int key) {
		if(n==-1) {
			return false;
		}
		return ((arr[n]==key) || search(arr,n-1,key));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,6,4,99,1,41,22,35,7};
		int key=100;
		System.out.println(search(arr,arr.length-1 ,key));

	}

}
