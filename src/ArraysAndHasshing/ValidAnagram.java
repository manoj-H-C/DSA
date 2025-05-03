package ArraysAndHasshing;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {

       String s = "jam";
       String t = "jam";
        System.out.println(isAnagram(s,t));
        System.out.println(isAnagramApproach(s,t));
    }

    //easy approach

    public static boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()){
            return false;
        }
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();

        Arrays.sort(charS);
        Arrays.sort(charT);

        return Arrays.equals(charS, charT);
    }

    //best approach

    public static boolean isAnagramApproach(String s, String t){

        if(s.length() != t.length()){
            return false;
        }
        //create an array to count character frequencies
        int[] charCounts = new int[26]; //assuming only lower case english letters

        //increment count for each character in 's' and decrement for each in 't'

        for(int i =0; i<s.length(); i++){
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }

        //check if all counts are zero
        for(int count : charCounts){
            if(count != 0){
                return  false; //all counts are not zero , so not an anagram
            }
        }
        return true; //all counts are zero, so 't' is an anagram of 's'
    }


}
