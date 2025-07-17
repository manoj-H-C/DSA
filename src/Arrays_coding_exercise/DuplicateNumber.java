package Arrays_coding_exercise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {
    /*Write a function which takes integer array as a parameter
    and returns a new integer array with unique elements. (remove duplicates)

Example

removeDuplicates({1, 1, 2, 2, 3, 4, 5})
Output : [1, 2, 3, 4, 5]*/

//    public static int[] removeDuplicates(int[] arr){
//        int[] result = new int[arr.length];
//        int index = 0;
//        if(arr.length==0){
//            return new int[0];
//        }
//
//        for(int i=0;i< arr.length;i++){
//            boolean isDuplicate = false;
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[i]==arr[j]){
//                    isDuplicate=true;
//                    break;
//                }
//            }
//            if(!isDuplicate){
//                result[index++]= arr[i];
//            }
//        }
//        return Arrays.copyOf(result,index);
//    }
//
    //better approach using set

    public static int[] removeDuplicates(int[] arr){
        if(arr.length==0){
            return new int[0];
        }
        Set<Integer> result = new HashSet<>();
        for(int number : arr){
            result.add(number);
        }

        int[] finalArray = new int[result.size()];
        int index=0;
        for(int num : result){
            finalArray[index++]=num;
        }

        return finalArray;
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 4, 5};
        System.out.println(Arrays.toString(DuplicateNumber.removeDuplicates(array)));;
    }
}
