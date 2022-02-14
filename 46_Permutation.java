class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        
        permutations(nums, ds, result, freq);
        return result;
    }
    
    public void permutations(int[] nums, List<Integer> ds, List<List<Integer>> result, boolean[] freq){
        if(ds.size() == nums.length){
            result.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i=0; i<nums.length; i++){
            if(!freq[i]){
                ds.add(nums[i]);
                freq[i] = true;
                permutations(nums, ds, result, freq);
                ds.remove(ds.size() -1);
                freq[i] = false;
            }
        }
    }
}
