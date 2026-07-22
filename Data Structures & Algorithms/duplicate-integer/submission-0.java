class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> h = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (h.contains(nums[i])) return true;
            h.add(nums[i]);
        }
        return false;

        // Arrays.sort(nums);
        // for(int i = 0; i < nums.length - 1; i++) {
        //     if (nums[i] == nums[i+1]) return true;
        // }
        // return false;

        // for(int i = nums.length -1; i> 0; i--) {
        //     if (nums[i] == nums[i-1]) return true;
        // }
        // return false;

    }
}