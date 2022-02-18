class Solution {
    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int sum = nums[0];
        for(int i = 1; i < nums.length; i++){
            if( sum + nums[i] <= nums[i])
                sum = nums[i];
            else
                sum += nums[i];
            
            if(result < sum)
                result = sum;
        }
        return result;
    }
}
