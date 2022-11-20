class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> plu = new ArrayList<>();
        Arrays.sort(nums);
        genPerm(plu,new ArrayList<>(),nums,new boolean[nums.length]);
        
        return plu;
        
    }
    
    public void genPerm(List<List<Integer>> plu,List<Integer> temp,int[] nums,boolean[] flag){
        if(temp.size()==nums.length){
            plu.add(new ArrayList<>(temp));
        }else{
            for(int i=0;i<nums.length;i++){
                if(flag[i] || i>0 && nums[i]== nums[i-1] && flag[i-1]) continue;
                
                flag[i]=true;
                temp.add(nums[i]);
                genPerm(plu,temp,nums,flag);
                flag[i]=false;
                temp.remove(temp.size()-1);
                
                
          }
        }
    }
}
