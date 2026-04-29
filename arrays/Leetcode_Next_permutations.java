// Problem: Next permutations

// Platform: LeetCode
// Difficulty: Medium
// Topic: arrays

// Approach:
// specific algorithm you must know beforehand, you can't build the algorithm in interview 

// Time Complexity: O()
// Space Complexity: O(1)  


class Solution {
    public int[] reverse(int[] arr, int a, int b){
        while(a<b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
        return arr;
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;
        
        for(int i=n-2; i>=0; i--){

            if(nums[i] < nums[i+1])
            {
                index = i;
                break;
                // int smallest = i+1;
                // int c = n-1;
                // while(c > i){
                //     if(nums[c] > nums[i] && nums[c] <= nums[smallest]){
                //         smallest = c;
                //     }
                //     c--;
                // }
                // int temp = nums[i];
                // nums[i] = nums[smallest];
                // nums[smallest] = temp;
                
            }
        }
        if (index != -1) {
            // Since the suffix is descending, the first element 
            // from the right > nums[index] is our best candidate.
            for (int i = n - 1; i > index; i--) {
                if (nums[i] > nums[index]) {
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                    break;
                }
            }
        }
        reverse(nums, index + 1, n - 1);
    }
}