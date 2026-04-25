// Problem: Union of two unsorted arrays  
// You are given two arrays a[] and b[], return the Union of both the arrays in any order.
// The Union of two arrays is a collection of all distinct elements present in either of the arrays. If an element appears more than once in one or both arrays, it should be included only once in the result.z
// Note: Elements of a[] and b[] are not necessarily distinct.
// Note that, You can return the Union in any order but the driver code will print the result in sorted order only.

// Platform: GFG
// Difficulty: easy
// Topic: 

// Approach:


// Time Complexity: O(2n + set)
// Space Complexity: O(1)  


class Solution {
        public static ArrayList<Integer> findUnion(int[] a, int[] b) {
            // code here
            ArrayList<Integer> ans = new ArrayList<Integer>();
            HashSet<Integer> set = new HashSet<>();
            
            for(int i : a){
                set.add(i);
            }
            
            for(int i : b){
                set.add(i);
            }
            
            for(int i : set){
                ans.add(i);
            }
            
            return ans;
        }
    }