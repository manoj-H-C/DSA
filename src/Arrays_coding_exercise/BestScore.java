package Arrays_coding_exercise;

import java.util.Arrays;

public class BestScore {
    /*Given an array, write a function to get first, second best scores from the array
    and return it in new array.

Array may contain duplicates.

Example

myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
firstSecond(myArray) // {90, 87}*/

    public static int[] findTopTwoScores(int[] array){
        int firstHighestScore = Integer.MIN_VALUE;
        int secondHighestScore = Integer.MIN_VALUE;
        for(int score : array){
            if(score > firstHighestScore){
                secondHighestScore = firstHighestScore;
                firstHighestScore = score;
            }
        }
        return new int[]{firstHighestScore, secondHighestScore};
    }

    public static void main(String[] args) {
        int[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        System.out.println(Arrays.toString(BestScore.findTopTwoScores(myArray)));
    }
}
