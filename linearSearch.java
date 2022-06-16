
public class linearSearch {
	public static boolean search(int[] arr,int n,int key) {
		if(n==-1) {
			return false; // because u reached the front end and didn't find the element
		}
		return ((arr[n]==key) || search(arr,n-1,key)); // return true if anywhere it finds the elements
	}

	public static void main(String[] args) {
		// RECURSIVE ALGORITHM FOR LINEAR SEARCH
		int arr[]= {8,6,4,99,1,41,22,35,7};
		int key=41; // try key=100 -> u will get false
		System.out.println(search(arr,arr.length-1 ,key));

	}

}
