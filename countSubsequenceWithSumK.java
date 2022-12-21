import java.util.ArrayList;

public class countSubsequenceWithSumK {
	public static int ksub(int i,int sum,int arr[],int k) {
		if(i>=arr.length) {
			if(sum==k) return 1;
			else return 0;
		}
		//take
		sum+=arr[i];
		int l=ksub(i+1,sum,arr,k);
		
		// no take
		sum-=arr[i];
		int r=ksub(i+1,sum,arr,k);
		
		return l+r;
	}

	public static void main(String[] args) {
		// number of subsequences with sum k
		int arr[]= {5,2,1,3,4};
		int k=7;
		int sum=0;
		int ans=ksub(0,0,arr,k);
		System.out.println(ans);

	}

}
