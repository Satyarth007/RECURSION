class Solution {

    public static void fc(int idx,int[] arr,int target,List<List<Integer>> ans,List<Integer> store){
        if(idx==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(store));
            }
            return;
        }
        if(arr[idx] <=target){
            store.add(arr[idx]);
            fc(idx,arr,target-arr[idx],ans,store);
            store.remove(store.size()-1);
        }
        fc(idx+1,arr,target,ans,store);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        fc(0,candidates,target,ans,new ArrayList<>());
        return ans;
        
    }
}
