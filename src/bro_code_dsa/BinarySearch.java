package bro_code_dsa;

import java.util.Arrays;

public class BinarySearch {
    /* search algorithm that finds the position of a target value within a sorted array.
    * Half of the array is eliminated during each step */

    //must be a sorted array
    //first check middle number
    //if value is greater than middle number, left side is removed
    //again checking with middle value
    //if equals we find the value
    //if greater or less we remove the other side

    public static void main(String[] args) {
        int[] array = new int[1000000];
        int target = 777777;

        //using internal binary search method
        for(int i=0; i<array.length; i++){
            array[i]=i;
        }

//        int index = Arrays.binarySearch(array,target);
        int index = binarySearch(array,target);
        if(index==-1){
            System.out.println(target + " not found");
        }else {
            System.out.println(target + " found at index " + index);
        }
    }

    private static int binarySearch(int[] array, int target) {
        int low =0;
        int high=array.length-1;
        while (low<=high){
            int middle = low + (high-low)/2;
            int middleValue = array[middle];
            System.out.println(" middle element : " + middleValue);
            if(middleValue<target){
                low = middle+1;
            } else if (middleValue>target) {
                high=middle-1;
            }else {
                return middle;
            }
        }
        return -1;
    }
}
