package BitManupulation;

public class CountingSetBits {
    static void count_setbits(int n){
        int c = 0 ;
        while(n != 0){
            n = n & n-1;
            c++;
        }
        System.out.println(c);

    }
    public static void main(String[] args) {
        count_setbits(8);
    }
}
