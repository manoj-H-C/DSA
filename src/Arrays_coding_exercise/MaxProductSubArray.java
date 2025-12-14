package Arrays_coding_exercise;

public class MaxProductSubArray {
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums){
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i]>=0){
                maxProduct = Math.max(maxProduct * nums[i], nums[i]);
                minProduct = Math.min(minProduct * nums[i],nums[i]);
            }else{
                int temp = maxProduct;
                maxProduct = Math.max(minProduct * nums[i],nums[i]);
                minProduct = Math.min(temp * nums[i],nums[i]);
            }

            result = Math.max(maxProduct, result);
        }
        return result;
    }
}
