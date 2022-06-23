

public class MAZE1 {
	public static int countPaths(int r, int c) {
		if(r==1 || c==1) {
			return 1;
		}
		int left=countPaths(r-1,c); // recursively finds answer for left maze( row -1 , column)
		int right=countPaths(r,c-1); //recursively finds answer for right maze( row  , column-1)
		return left+right;
	}

	public static void main(String[] args) {
		// There is a maze of size (n X n), we need to find the all possible paths from source to sink
		//constraints:- we can move in only 2 directions------- 
		//                         a. RIGHT 
		//                         b. DOWN
		
		/*							      MAZE
		 							___________________
		 				   source	->	|__|__|__|__|__|__|
		 							|__|__|__|__|__|__|
		 							|__|__|__|__|__|__|
		 							|__|__|__|__|__|__|
		 							|__|__|__|__|__|__|
		 							|__|__|__|__|__|__|  --> sink
		 							
		 
		 */
		
		int n=3;  // passing rows and columns value
		System.out.println(countPaths(n,n));
		

	}

}
