// Problem: Longest repeating character replacement
// You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.
// Return the length of the longest substring containing the same letter you can get after performing the above operations.
// // Note : If no such substring exists, return -1. 

// Platform: Leetcode
// Difficulty: Medium
// Topic: Sliding window, String

// Approach: ) Windowlength - maxfrequency <= k) logic used here

// Time Complexity: O(n)
// Space Complexity: O(1) or 0(26)

class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        // Memory already looks like this: [0, 0, 0, 0, 0....]
        int r=0; int l=0; int maxFreq =0; int maxlen =0;
        while(r<s.length()){
            arr[s.charAt(r)-'A']++;
            if(arr[s.charAt(r)-'A'] > maxFreq){
                maxFreq = arr[s.charAt(r)-'A'];
            }

            //no need of while loop here right?
            if((r-l+1)-maxFreq > k){
                arr[s.charAt(l)-'A']--;
                l++;
            }

            if((r-l+1)-maxFreq <= k) {
                maxlen = Math.max(maxlen, r-l+1);
            }
            r++;
        }
        return maxlen;
    }
}