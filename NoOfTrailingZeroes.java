package BitManupulation;

public class NoOfTrailingZeroes {
    static  int no_of_trailing_zeroes(int n){
        return (int)((Math.log10((n & n-1) ^ n)/ Math.log10(2)));
    }
    public static void main(String[] args) {
        int k = no_of_trailing_zeroes(8);
        System.out.println(k);
    }
}
