
public class linearSearch2 {
	public static int search(int[] arr,int n,int key) {
		if(n==arr.length) {
			return -1; // because u reached the front end and didn't find the element
		}
		if(arr[n]==key) {
			return n;
		}else {
			return search(arr,n+1,key);
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,6,4,99,1,41,22,35,7};
		int key=41; // try key=100 -> u will get false
		System.out.println(search(arr,0 ,key));
	}

}
