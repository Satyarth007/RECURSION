import java.util.*;

public class subsequenceArray {
	public static void printSub(int i,ArrayList<Integer> al,int arr[]) {
		if(i>=arr.length) {
			System.out.println(al.toString());
			return;
		}
		
		al.add(arr[i]);
		printSub(i+1,al,arr); //take
		al.remove(al.size()-1);
		printSub(i+1,al,arr); // no take   ,backtracking
	}

	public static void main(String[] args) {
		// printing subsequence of array
		ArrayList<Integer> al=new ArrayList<>();
		int arr[]= {5,1,3};
		int i=0;
		printSub(i,al,arr);

	}

}
