class Solution {
    public List<List<Integer>> permute(int[] nums) {
      // list to store the permutations 
        List<List<Integer>> pl = new ArrayList<>();
      
        genPerm(pl,new ArrayList<>(),nums);    //recursive calls to generate the perms
      
        return pl;
        
    }
    public void genPerm(List<List<Integer>> pl, List<Integer> temp, int []nums){

        if(temp.size() == nums.length){
            pl.add(new ArrayList<>(temp));     // this line will add the perms stored in the temp list to the main pl list
        }else{
            for(int i=0;i<nums.length;i++){
                
                if(temp.contains(nums[i])) continue;
                // bactracking here
                temp.add(nums[i]);            // taking that element 
                genPerm(pl,temp,nums);
                temp.remove(temp.size()-1);  // not tking that element 
            }
        }
    }
}
