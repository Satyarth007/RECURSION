
public class sortedOrNot {
	public static boolean answer(int [] arr,int i) {
		
		if(i==arr.length-1) {
			return true;
		}
		return (arr[i]<arr[i+1] && answer(arr,i+1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,6,5};
		boolean ans=answer(arr,0);
		System.out.println(ans);
	}

}
