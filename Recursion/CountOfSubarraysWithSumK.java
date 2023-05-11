class Solution{
    
    static void fun(int arr[],int n, int sum,ArrayList<Integer> al,int s,int i,int[] count){
        if(i==n){
            if(s==sum){
                count[0]++;
            }
            return;
        }
        al.add(arr[i]);
        s+=arr[i];
        fun(arr,n,sum,al,s,i+1,count);
        al.remove(al.size()-1);
        s-=arr[i];
        fun(arr,n,sum,al,s,i+1,count);
    }

	public int perfectSum(int arr[],int n, int sum) 
	{ 
	    ArrayList<Integer> al = new ArrayList<>();
	    int[] count = {0};
	    fun(arr,n,sum,al,0,0,count);
	    return count[0]; 
	} 
}
