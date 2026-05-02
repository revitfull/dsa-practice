// Leetcode Easy


class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // Carry stops here!
            }
            digits[i] = 0; // It was a 9, so it becomes 0 and loop continues
        }

        // If we reach here, it means EVERY digit was a 9
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
        
        // int n = digits.length;
        // if(digits[n-1] != 9){
        //     digits[n-1]++;
        //     return digits;
        // }

        // boolean alldigitsnine = true;
        // for(int num : digits){
        //     if(num != 9){
        //         alldigitsnine = false;
        //     }
        // }

        // if(alldigitsnine){
        //     int newdigits[] = new int[n+1];
        //     newdigits[0]++;
        //     return newdigits;
        // }

        // int iscurrentdigits9 = 1;
        // while(digits[n-iscurrentdigits9] == 9){
        //     digits[n-iscurrentdigits9] = 0;
        //     iscurrentdigits9++;
        // }
        // digits[n-iscurrentdigits9]++;
        
        // return digits;
        /////////////////////////////////////////////////////////////////////////////////
        //if all digits are 9

        // long digit = 0;
        // long unit = (int) Math.pow(10, n-1);
        // for(int num : digits){
            
        //         digit += num * unit;
        //         unit = unit/10;
            
        // }
        // if(digit == 0){
        //     digit = digits[n-1];
        // }
        // int checkifall9 = (int) Math.pow(10, n);
        // if(checkifall9 - 1 == digit){
        //     int[] newdigits = new int[n+1];
        //     newdigits[0] = 1;
        //     return newdigits;
        // }

        //if only units place is 9
        
        
    }
}