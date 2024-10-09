import java.util.stream.IntStream;

class Solution {
    public:
    int sumOfMultiples(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> i % 3 == 0 || i % 5 == 0 || i % 7 == 0).sum();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Sum.sumDivisibleBy357(7));
        System.out.println(Sum.sumDivisibleBy357(10));
        System.out.println(Sum.sumDivisibleBy357(9));
    }
}