// Problem: Longest common prefix
// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".

// Platform: LeetCode
// Difficulty: Easy
// Topic: String

// Approach:

// Time Complexity: O(n*m) //n=number of strings in the array //m=length of prefix
// Space Complexity: O(m)

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Start by assuming the entire first word is the prefix
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            // While the current word (strs[i]) does not start with the prefix
            // indexOf(prefix) returns 0 if it starts with the prefix
            while (strs[i].indexOf(prefix) != 0) {
                
                // Shorten the prefix by removing the last character
                prefix = prefix.substring(0, prefix.length() - 1);

                // If at any point the prefix becomes empty, there is no match
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }
}