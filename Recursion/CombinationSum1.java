class Solution {

    static void fun(int []arr,int index,int target,List<List<Integer>> ans,ArrayList<Integer> ds){
        if(index==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(target>=arr[index]){
            ds.add(arr[index]);
            fun(arr,index,target-arr[index],ans,ds);
            ds.remove(ds.size()-1);
        }
        fun(arr,index+1,target,ans,ds);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        fun(candidates,0,target,ans,new ArrayList<>());
        return ans;
    }
}
