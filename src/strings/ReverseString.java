package strings;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};

        reverseString(s);
    }

    public static void reverseString(char[] array){
        int left=0;
        int right = array.length-1;
        while (left<=right){
            char temp = array[left];
            array[left] = array[right];
            array[right]=temp;

            left++;
            right--;
        }
        System.out.println(array);
    }
}
