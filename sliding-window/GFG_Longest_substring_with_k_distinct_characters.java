// Problem: Longest substring with K distinct characters
// You are given a string s consisting only lowercase alphabets and an integer k. Your task is to find the length of the longest substring that contains exactly k distinct characters.
// Note : If no such substring exists, return -1. 

// Platform: GFG
// Difficulty: Medium
// Topic: Sliding window

// Approach: the if statement was important to correctly update maxlen

// Time Complexity: O(n)
// Space Complexity: O(1)
// (map size max = 3 → effectively constant)

import java.util.HashMap;

class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        int l=0; int r=0; int maxlen=-1; 
        while(r<s.length()){
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r),0)+1);
            
            while(map.size()>k){
               map.put(s.charAt(l), map.getOrDefault(s.charAt(l),0)-1); 
               if(map.get(s.charAt(l))==0){
                   map.remove(s.charAt(l));
               }
               l++;
            }
            
            //this if statement here was important because it checks 
            //if we have k distinct characters in our current substring or not 
            if(map.size()==k){
                maxlen=Math.max(maxlen,r-l+1);
            }
            r++;
        }
        return maxlen; 
    }
}
