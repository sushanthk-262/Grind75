class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int vote = 0; 
        int maj = nums[0];

        for(int i = 0; i < len; i++){
            int curr = nums[i];

            if(vote == 0) maj = nums[i];
            if(nums[i] == maj) vote++;
            else vote--;
        }
        vote = 0;
        for(int i = 0; i < len; i++){
            if(nums[i] == maj) vote++;
            if(vote > len / 2) return maj;
        }
        return maj;
    }
}