package BitManupulation;

public class CheckingPowerOf2 {
        static boolean checkPowerof2(int n){
            if(n == 0){
                return  false;
            }
            return ((n & n-1) == 0);
        }

    public static void main(String[] args) {
        System.out.println(checkPowerof2(63));
    }
}
