// solve this without using stringbuilder & use two pointer appraoch on the fly 

class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder str = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            if(Character.isLowerCase(s.charAt(i))) str.append(s.charAt(i));
            if(Character.isUpperCase(s.charAt(i))) str.append(Character.toLowerCase(s.charAt(i)));
            if(Character.isDigit(s.charAt(i))) str.append(s.charAt(i));
        }

        int start = 0; int end = str.length()-1;
        while(start<end){
            // char ch = s.charAt(start);
            // char ch2 = s.charAt(end);

            if(str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }

        return true;
    }
}