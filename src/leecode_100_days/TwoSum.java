package leecode_100_days;

import java.util.Arrays;

public class TwoSum {
    //brute force
    public static int[] twoSum(int[] nums, int target) {
        if(nums.length==0){
            return new int[0];
        }
        int[] result = new int[2];
        for(int i=0; i<nums.length;i++){
            for(int j=1; j<nums.length;j++){
                int total = nums[i]+nums[j];
                if(total==target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums,17)));
    }
}
