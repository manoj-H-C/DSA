package Arrays_coding_exercise;

import java.util.Arrays;

public class MaxProduct {

    /*How to find maximum product of two integers in the array where all elements are positive.

Example

int[] intArray = {10,20,30,40,50};
maxProduct(intArray) // (40,50)*/

//    public static String maxProduct(int[] arr){
//        int max=0;
//        String pairs="";
//        for(int i=0; i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i] * arr[j] > max){
//                    max=arr[i]*arr[j];
//                    pairs=Integer.toString(arr[i]) + "," + Integer.toString(arr[j]);
//                }
//            }
//        }
//        return pairs;
//    }

//    public static String maxProduct(int[] intArray) {
//        // TODO
//        int n= intArray.length;
//        int first = Integer.MIN_VALUE;
//        int second = Integer.MIN_VALUE;
//        int[] result = new int[2];
//        for(int num : intArray){
//            if(num > first){
//                second = first;
//                first = num;
//            }
//        }
//        result[0]=second;
//        result[1]=first;
//
////        return Arrays.toString(result);
//        return Integer.toString(second) + ", " + Integer.toString(first);
//        //return (first*second);
//    }

public static String maxProduct(int[] intArray) {
    int first = Integer.MIN_VALUE;
    int second = Integer.MIN_VALUE;

    for (int num : intArray) {
        if (num > first) {
            second = first;
            first = num;
        } else if (num > second) {  // Add this condition
            second = num;
        }
    }

    return second + ", " + first;
}

    public static void main(String[] args) {
        int[] intArray = {10,20,30,40,50};
        System.out.println(maxProduct(intArray));
    }
}
