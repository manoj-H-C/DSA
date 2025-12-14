package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingString {
    //used linked hash map  o(n)
    public static void main(String[] args) {
        String value = "swiss";
        System.out.println(firstNonRepeatingString(value));
    }

    public static Character firstNonRepeatingString(String value){

        char[] chars = value.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char ch : chars){
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }

        return '_';
    }
}
