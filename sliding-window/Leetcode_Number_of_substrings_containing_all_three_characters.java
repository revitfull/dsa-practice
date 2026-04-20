// Problem: Number of substrings containing all three characters a,b & c
// Given a string s consisting only of characters a, b and c.
// Return the number of substrings containing at least one occurrence of all these characters a, b and c.

// Platform: LeetCode
// Difficulty: Medium
// Topic: Sliding Window OR minimum valid window

// Approach:
//minimum valid window appraoch

// Time Complexity: O(n)
// Space Complexity: O(3)  // array of size 3

class Solution {
    public int numberOfSubstrings(String s) {
        int[] lastSeen = {-1,-1,-1};
        int count =0;
        int n =s.length();
        for(int i=0; i<n; i++){
            lastSeen[s.charAt(i)-'a'] = i;
            
            if (lastSeen[0] != -1 && lastSeen[1] != -1 && lastSeen[2] != -1){
                int minPos = Math.min(lastSeen[0], Math.min(lastSeen[1] ,lastSeen[2]));
                count += (minPos + 1);
            }
        }
        return count;
    }
}
