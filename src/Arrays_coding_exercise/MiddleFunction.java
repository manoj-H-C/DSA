package Arrays_coding_exercise;

import java.util.Arrays;

public class MiddleFunction {
    /*Write a function called middle that takes an array and returns a
    new array that contains all but the first and last elements.
myArray = [1, 2, 3, 4]
middle(myArray)  # [2,3]. */

    public static int[] middle(int[] array) {
        int n = array.length;
        int[] result = new int[n-2];
        for(int i=1; i<n-1; i++){
            result[i-1] = array[i];
        }
        return result;
    }

    public static void main(String[] args) {
       int[] myArray = {1, 2, 3, 4};
       int[] result = MiddleFunction.middle(myArray);
        System.out.println(Arrays.toString(result));
    }

}
