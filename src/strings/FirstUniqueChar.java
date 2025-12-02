package strings;

public class FirstUniqueChar {
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqueChar(s));
    }

    public static int firstUniqueChar(String s){
        int[] count = new int[26];

        //count each character
        for(int i=0; i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }

        //find first with count 1
        for(int i=0; i<s.length();i++){
          if(count[s.charAt(i)-'a']==1) return i;
        }
        return -1;
    }

}
