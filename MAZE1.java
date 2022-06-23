
public class MAZE1 {
	public static int countPaths(int r, int c) {
		if(r==1 || c==1) {
			return 1;
		}
		int left=countPaths(r-1,c);
		int right=countPaths(r,c-1);
		return left+right;
	}

	public static void main(String[] args) {
		// There is a maze of size (n X n), we need to find the all possible paths from source to sink
		//constraints:- we can move in only 2 directions------- 
		//                         a. RIGHT 
		//                         b. DOWN
		int n=3;
		System.out.println(countPaths(n,n));
		

	}

}
