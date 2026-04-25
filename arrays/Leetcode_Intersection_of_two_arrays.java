// Problem: Intersection of two sorted arrays 
// Given two integer arrays nums1 and nums2, return an array of their . Each element in the result must be unique and you may return the result in any order.

// Platform: LeetCode
// Difficulty: Easy
// Topic: two pointers (in case of sorted array)

// Approach:


// Time Complexity: O(n+m)
// Space Complexity: O(1)  

import java.util.HashSet;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersect = new HashSet<>();
        for(int num : nums1){
            set.add(num);
        }
        for(int num : nums2){
            if(set.contains(num)){
                intersect.add(num);
            }
        }
        int[] ansArr = new int[intersect.size()];
        int i=0;
        for(int num : intersect){
            ansArr[i] = num;
            i++;
        }
        return ansArr;
    }
}