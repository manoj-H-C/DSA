package strings;

public class IsAnagram {
    public static void main(String[] args) {
       String s = "anagram";
       String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        // Add counts for s
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        // Subtract counts for t
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']--;
        }

        // If all values are zero → it's an anagram
        for (int c : count) {
            if (c != 0) return false;
        }

        return true;
    }
}
