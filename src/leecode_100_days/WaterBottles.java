package leecode_100_days;

public class WaterBottles {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;

        while (numBottles>=numExchange){
            int newBottles = numBottles/numExchange;
            int remBottles = numBottles % numExchange;
            total = total + newBottles;
            numBottles = newBottles + remBottles;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(numWaterBottles(9,3));
    }
}
