package BitManupulation;

public class Consecutiveones {
    static void consecutive_ones(int n){
        int c = 0;
        while(n > 0){
            n = n & (n>>1);
            c++;
        }
        System.out.println(c);
    }
    public static void main(String[] args) {
        consecutive_ones(7);
    }

}
