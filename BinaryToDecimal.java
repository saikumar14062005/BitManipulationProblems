package BitManupulation;

public class BinaryToDecimal {
//    static int btod(String str) {
//        int sum = 0;
//        int n = str.length()-1;
//        for (int i = 0; i < str.length(); i++) {
//            int k = str.charAt(i) - '0';
//            System.out.println("the value at the index"+i+"is"+k);
//            System.out.println("n value is at index"+i+"is"+n);
//            if(k == 1){
//                sum = sum + (int) Math.pow(2,n);
//                System.out.println("the vaue of power"+(int) Math.pow(2,n));
//            }
//            n--;
//            System.out.println("the value of n"+n);
//
//        }
//        return sum;
//    }
    static int btod(String str){
        int res = 0,powof2 = 1;
        for(int i = str.length()-1 ; i>= 0;i--){
                if(str.charAt(i) == '1'){
                    res = res + powof2;
                }
                powof2 = powof2 * 2;
        }
        return res;
    }
    public static void main(String[] args) {
//            Integer k = Integer.parseInt("3");

        System.out.println(btod("1000"));


    }
}
