package bro_code_dsa;

public class InterpolationSearch {
    /* interpolation search = improvement over binary search best used for "uniformly" distributed data
    *                      "guesses" where a value might be based on calculated probe results
    *                       if the probe is incorrect, we narrow the search and try again */

    /*             average case : O(log(log (n)))
    *              worst case : O(n) [values increase exponentially]*/

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};

        int index = interpolationSearch(array,8);
        System.out.println(index);
    }

    private static int interpolationSearch(int[] array, int value) {
        int low =0;
        int high = array.length-1;
        while (value>=array[low] && value <=array[high] && low<=high){
            int probe = low + (high-low) * (value - array[low]) / (array[high]-array[low]);

            System.out.println("probe : " + probe);
            if(array[probe] == value){
                return probe;
            }else if(array[probe]<value){
                low = probe+1;
            }else {
                high=probe-1;
            }
        }
        return -1;
    }
}
