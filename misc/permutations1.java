class Solution {
    public List<List<Integer>> permute(int[] nums) {
          List<List<Integer>> ans = new ArrayList<>();
	        helper(nums,0,ans);
	        return ans;
    }
    public void helper(int[] nums, int index, List<List<Integer>> ans)
	    {
		//BASE CASE
	    	if(index==nums.length){
	    		    ArrayList<Integer> list =new ArrayList<>();
	    	        for(int i = 0 ; i<nums.length ; i++){
	    	            list.add(nums[i]);
	    	        }
	    	        ans.add(list);
	    	        return;
	    	}
	        for(int i = index; i<nums.length; i++){
	            swap(i,index,nums);
	            helper(nums, index+1, ans);
	            swap(i,index,nums);
	        }
	    }
	    public static void swap(int i , int j, int[] nums){
	    	  int t=nums[i];
	    	    nums[i]=nums[j];
	    	    nums[j]=t;
	    }
}