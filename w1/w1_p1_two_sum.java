class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] result = new int[2];
        
        HashMap<Integer, Integer> num_hash = new HashMap<Integer, Integer>();
        for(int i = 0, j = 1; i < len; i++) {
            if (num_hash.containsKey(target - nums[i])){
                result[0] = i;
                result[1] = num_hash.get(target - nums[i]);
                return result;
            }
            num_hash.put(nums[i], i);
        }
        return result;
    }
}