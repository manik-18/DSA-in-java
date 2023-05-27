class Solution {

    static void solve(int index,String s,List<String> ds,List<List<String>> ans){
        if(index==s.length()){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                ds.add(s.substring(index,i+1));
                solve(i+1,s,ds,ans);
                ds.remove(ds.size()-1);
            }
        }
    }

    static boolean isPalindrome(String s,int i,int j){
        while(i<=j){
            if(s.charAt(i++)!=s.charAt(j--)){
                return false;
            }
        }
        return true;
    }

    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> ds = new ArrayList<>();
        solve(0,s,ds,ans);
        return ans;
    }
}
