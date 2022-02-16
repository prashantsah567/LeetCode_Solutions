class Solution {
    public int searchInsert(int[] nums, int target) {
        int result = 0;
        for(int i =0; i < nums.length; i++){
            if(target <= nums[i])
                return result;
            else
                result++;
        }
        return result;
    }
}
