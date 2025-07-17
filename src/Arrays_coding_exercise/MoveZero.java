package Arrays_coding_exercise;

import java.util.Arrays;
import java.util.Collections;

public class MoveZero {
    // to left side

//    public static int[] zeroes( int[] arr){
//       int n= arr.length;
//       int index = n-1;
//       for(int i=n-1; i>=0;i--){
//           if(arr[i]!=0){
//               arr[index--]=arr[i];
//           }
//
//       }
//        while(index >= 0){
//            arr[index--]=0;
//        }
//       return arr;
//    }

    //to right side
    public static int[] zeroes( int[] arr){
       int n= arr.length;
       int index = 0;
       for(int i=0; i<n;i++){
           if(arr[i]!=0){
               arr[index++]=arr[i];
           }

       }
        while(index < n){
            arr[index]=0;
            index++;
        }
       return arr;
    }
    public static void main(String[] args) {
        int[] prices = {7,0,0,1,5,0,3,6,4};
        System.out.println(Arrays.toString(zeroes(prices)));
    }

}
