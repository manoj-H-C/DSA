package strings;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }

    //sliding window
    public static int lengthOfLongestSubstring(String s){
        int left=0;
        int maxLen=0;
        Set<Character> set = new HashSet<>();

        //my logic
        for(int right=0; right<s.length(); right++){
            while (set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right-left+1);
        }

       return maxLen;
    }


}
