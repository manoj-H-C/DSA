package Arrays_coding_exercise;

public class FindANumberInArray {

    /*Write a program to to check if an array contains a number in Java.

int[] intArray = {1,2,3,4,5,6};
searchInArray(intArray, 6); // 5*/

    public static int searchInArray(int[] intArray, int valueToSearch) {
        int result =0;
        // TODO
        for(int i=0; i<intArray.length; i++){
            if(intArray[i]==valueToSearch){
                result=i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6};
        System.out.println(searchInArray(intArray,5));
    }

}
