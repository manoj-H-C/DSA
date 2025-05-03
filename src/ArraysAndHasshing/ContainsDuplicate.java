package ArraysAndHasshing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
        ContainsDuplicate mainRes = new ContainsDuplicate();
        int[] nums = {1, 2, 3};
        System.out.println(mainRes.hasDuplicate(nums));
        System.out.println(mainRes.hasDuplicateBruteForce(nums));
    }
    //best approach o(n) time complexity
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hasNumber = new HashSet<>();
        for(int num : nums){
            if(hasNumber.contains(num)){
                return true;
            }
            hasNumber.add(num);
        }
        return false;
    }

    //brute force approach o(n^2) time complexity

    public boolean hasDuplicateBruteForce(int[] nums){
        for(int i=0; i< nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j])
                    return true;
            }
        }
        return false;
    }

    //best practice to beat 90% code in leetcode but still o(n) time complexity

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hasNumbers = new HashSet<>();
        for(int num : nums){
            if(!hasNumbers.add(num)){
                return true;
            }
        }
        return false;
    }
}
