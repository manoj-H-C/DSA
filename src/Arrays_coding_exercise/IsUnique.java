package Arrays_coding_exercise;

import java.util.HashSet;
import java.util.Set;

public class IsUnique {
    /*Write a program to check if an array is unique or not.

Example

int[] intArray = {1,2,3,4,5,6};
isUnique(intArray) // true*/

    public static boolean isUnique(int[] arr) {
        Set<Integer> result = new HashSet<>();
        for(int num: arr){
            if(!result.add(num)){
                return false;
            }
        }
        return true;
    }

//    public boolean isUnique(int[] intArray) {
//        // TODO
//        for(int i=0; i< intArray.length; i++){
//            for(int j=i+1; j<intArray.length; j++){
//                if(intArray[i]==intArray[j]){
//                    return false;
//                }
//            }
//        }
//        return true;
//    }


    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6};
        System.out.println(isUnique(intArray));
    }
}
