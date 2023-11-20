package BitManupulation;

public class RightMostSetBit {
    static void right_most_bit(int n){
        System.out.println( (int)((Math.log10(n ^ (n & n - 1)))/Math.log10(2))+1);
    }

    public static void main(String[] args) {
    right_most_bit(8);
    }

}
