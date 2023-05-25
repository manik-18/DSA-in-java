class Solution {

    static void solve(int []nums,List<List<Integer>> ans,List<Integer> ds,boolean freq[]){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(nums[i]);
                solve(nums,ans,ds,freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean freq[]=new boolean[nums.length];
        solve(nums,ans,ds,freq);
        return ans;
    }
}








//Method 2  swapping


class Solution {

    static void swap(int i,int j,int []nums){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }

    static void solve(int index,List<List<Integer>> ans,int []nums){
        if(index==nums.length){
            List<Integer> al = new ArrayList<>();
            for(int x:nums){
                al.add(x);
            }
            ans.add(new ArrayList<>(al));
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(i,index,nums);
            solve(index+1,ans,nums);
            swap(i,index,nums);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        solve(0,ans,nums);
        return ans;
    }
}
