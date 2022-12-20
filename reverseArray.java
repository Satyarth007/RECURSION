
public class reverseArray {
	public static void swap(int arr[],int x,int y) {
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	public static void rev(int arr[],int l,int r) {
		if(l>=r) return;
		swap(arr,l,r);
		rev(arr,l+1,r-1);
	}

	public static void main(String[] args) {
		int arr[]= {5,4,3,2,1};
		rev(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}