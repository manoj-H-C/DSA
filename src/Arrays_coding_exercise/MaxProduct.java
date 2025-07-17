package Arrays_coding_exercise;

public class MaxProduct {

    /*How to find maximum product of two integers in the array where all elements are positive.

Example

int[] intArray = {10,20,30,40,50};
maxProduct(intArray) // (40,50)*/

    public static String maxProduct(int[] arr){
        int max=0;
        String pairs="";
        for(int i=0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] * arr[j] > max){
                    max=arr[i]*arr[j];
                    pairs=Integer.toString(arr[i]) + "," + Integer.toString(arr[j]);
                }
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        int[] intArray = {10,20,30,40,50};
        System.out.println(maxProduct(intArray));
    }
}
