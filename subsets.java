class Solution {
    public List<List<Integer>> subsets(int[] nums) {
      // created the list to store the power set 
        List<List<Integer>> res = new ArrayList();
      // calling the recursive genSubset method to generate the subset 
        genSubset(0,nums,new ArrayList(),res);
      
        return res;
        
    }
   public void genSubset(int index,int[] nums, List<Integer> curr, List<List<Integer>> res){
     
        res.add(new ArrayList(curr));   // empty set
        for(int i=index; i < nums.length;i++){
            curr.add(nums[i]);
            genSubset(i+1,nums,curr,res);
            curr.remove(curr.size()-1);
        }
    }
}
