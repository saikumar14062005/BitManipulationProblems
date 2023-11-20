package BitManupulation;

public class SwapOddAndEven {
    static int swap_odd_and_even(int n){
        return (((n & 0xaaaaaaa)>>>1) | ((n & 0x55555555) << 1));
    }
    public static void main(String[] args) {
        int k = swap_odd_and_even(181);
        System.out.println(k);
    }
}
