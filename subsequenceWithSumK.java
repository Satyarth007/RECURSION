import java.util.ArrayList;

public class subsequenceWithSumK {
	public static void ksub(int i,int sum,ArrayList<Integer> al,int arr[],int k) {
		if(i>=arr.length) {
			if(sum==k) {
				System.out.println(al.toString());
			}
			return;
		}
		// take
		al.add(arr[i]);
		sum+=arr[i];
		ksub(i+1,sum,al,arr,k);
		
		// no take
		sum-=arr[i];
		al.remove(al.size()-1);
		ksub(i+1,sum,al,arr,k);
	}

	public static void main(String[] args) {
		// subsquence of array whose sum is k
		ArrayList<Integer> al =new ArrayList<>();
		int arr[]= {5,2,1,3,4};
		int k=7;
		int sum=0;
		ksub(0,0,al,arr,k);

	}

}
