package Arrays_coding_exercise;

public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        int currentValue = nums[0];
        int maxValue = nums[0];

        for(int i=1; i<nums.length;i++){
            if(currentValue < 0) currentValue=0;

            currentValue+= nums[i];

            if(currentValue > maxValue ) maxValue = currentValue;
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
