class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1) return nums[0];
        int currentmin = nums[0];
        int currentmax = nums[0];
        int maxproduct = nums[0];
        for(int i=1; i<nums.length; i++){

            // Store currentMax before it gets updated
            int temp = currentmax;

            currentmax = Math.max(nums[i], Math.max(nums[i] * currentmin, nums[i] * temp));
            // Use 'temp' here instead of the updated 'currentMax'
            currentmin = Math.min(nums[i], Math.min(nums[i] * currentmin, nums[i] * temp));
            maxproduct = Math.max(maxproduct, currentmax);
        }
        return maxproduct;
    }
}