// Problem: Majority element
// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

// Platform: LeetCode
// Difficulty: Easy
// Topic: Boyer-Moore Voting Algorithm

// Approach:
// Boyer-Moore Voting Algorithm

// Time Complexity: O(n+m)
// Space Complexity: O(1)  

class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1) return nums[0];
        int majority = nums[0];
        int count = 0;
        int i=0;
        while(i<nums.length){
            if(count==0){
                majority = nums[i];
            }
            if(majority == nums[i]){
                count++;
            } else {
                count--;
            }
            i++;
        }
        return majority;
    }
}