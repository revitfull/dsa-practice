// Problem: Binary subarray with sum
// Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.
// A subarray is a contiguous part of the array.

// Platform: Leetcode
// Difficulty: Medium
// Topic: Sliding window, At most K method

// Approach: At most k method, though it can be solved using hashmap + prefix sum and three pointers as well
// Time Complexity: O(2n)
// Space Complexity: O(1)


class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return numSubarraysWithSumActual(nums, goal) - numSubarraysWithSumActual(nums,goal-1);
    }
    public int numSubarraysWithSumActual(int[] nums, int goal) {
        //this is a helper funciton which actually calculates the number of subarrays
        int r=0; int l=0; int count=0; int sum=0;
        while(r<nums.length){
            sum += nums[r];
            while(sum>goal && l<nums.length){
                sum -= nums[l];
                l++;
            }
            if(sum<=goal){
                count += (r-l+1);
            }
            
            r++;
        }
        return count;
    }
}