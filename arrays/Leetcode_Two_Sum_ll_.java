//Question : Two sums 2

// Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

// Return the indices of the two numbers index1 and index2, each incremented by one, as an integer array [index1, index2] of length 2.

// The tests are generated such that there is exactly one solution. You may not use the same element twice.

// Your solution must use only constant extra space.

//Approach/Notes : despite it having negative numbers, we didnt need to rely on prefix sum+hashmap and solved it using 
// two pointers to save extra space, two pointers worked because the array was sorted

//Difficulty : Easy
//Platform : Leetcode

//Topic: Two pointers

//TC : O(n)
//SC : O(1)

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0; int r=numbers.length-1;
        while(l<r){
            int currentSum = numbers[l] + numbers[r];
            if(currentSum==target){
                return new int[] {l+1,r+1};
            }else if(currentSum<target){
                l++;
            }else{
                r--;
            }
        }
        return new int[] {-1,-1};
    }
}