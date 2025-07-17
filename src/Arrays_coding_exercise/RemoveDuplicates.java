package Arrays_coding_exercise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    /*Given a sorted array nums, remove the duplicates in-place
    such that each element appears only once and returns the new length.
    Do not allocate extra space for another array;
    you must do this by modifying the input array in-place with O(1) extra memory.

Example:

Input: nums = [1, 1, 2]
Output: 2*/

    public static int remDuplicates(int[] nums){
        int n = nums.length;
        if(n==0){
            return 0;
        }
        Set<Integer> result = new HashSet<>();
        for(int number : nums)
        if(!result.contains(number)){
            result.add(number);
        }
        return result.size();
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(RemoveDuplicates.remDuplicates(nums));
    }
}
