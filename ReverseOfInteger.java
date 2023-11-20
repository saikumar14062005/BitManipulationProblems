package BitManupulation;

public class ReverseOfInteger {
    static void reverse_of_integer(int n){
        int f = 31,l = 0;
        int rev = 0;
        while(f > l){
            if((n & (1 << f)) != 0){
                rev = rev | (1<< l);

            }
            if((n & (1 << l)) != 0){
                rev = rev | (1 << f);
            }
            f--;
            l++;
        }
        System.out.println(rev);

    }

    public static void main(String[] args) {
        reverse_of_integer(1);
    }
}
