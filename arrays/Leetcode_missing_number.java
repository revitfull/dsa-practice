// Problem: Missing number
// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

// Platform: LeetCode
// Difficulty: Easy
// Topic: 

// Approach:
// using the sum of first n natural numbers formula

// Time Complexity: O(n)
// Space Complexity: O(1)  


class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n*(n+1))/2;
        int actualSum = 0;
        for(int num : nums){
            actualSum += num;
        }
        return sum - actualSum;
    }
}