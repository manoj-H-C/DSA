package leecode_100_days;

public class TribonacciNumber {
    public static int tribonacci(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        int first=0;
        int second=1;
        int third=1;
        int fourth=0;
        for(int i=3; i<=n; i++){
            fourth = first + second + third;
            first=second;
            second=third;
            third = fourth;
        }
        return fourth;
    }

    public static void main(String[] args) {
        int n=25;
        System.out.println(tribonacci(n));
    }
}
