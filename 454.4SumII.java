class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
            int result = 0;
    
    //create a hashmap
    //Key is sum of nums1+nums2, Value is the count or the # of times we see that sum
    Map<Integer,Integer> map = new HashMap<>();
    
    for(int i: nums1){
        for(int j: nums2){
            map.put(i+j, map.getOrDefault(i+j,0)+1);
        }
    }
    //iterate through nums3 and nums4 to find their sum.
    //if nums3+nums4 are -(nums1+nums2), then the overall sum would be ZERO and we have a tuple
    for(int k: nums3){
        for(int l: nums4){
            if(map.getOrDefault(-(k+l),0) >=1){
                result+=map.getOrDefault(-(k+l),0);
            };
        }
    }
    
    return result;

}
    }
