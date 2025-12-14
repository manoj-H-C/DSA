package strings;

public class IndexOfFirstOccurance {
    public static int strStr(String haystack, String needle) {
        int index = haystack.indexOf(needle);
        return index;
    }

    public static void main(String[] args) {
       String haystack = "leetcode";
       String needle = "sad";
        System.out.println(strStr(haystack,needle));
    }
}
