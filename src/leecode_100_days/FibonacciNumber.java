package leecode_100_days;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n=4;
        System.out.println(fib(n));
    }

    public static int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;

        int first=0;
        int second=1;
        int third=0;
        for(int i=2; i<=n;i++){
            third=first+second;
            first=second;
            second=third;
        }
        return third;
    }
}
