package BitManupulation;

public class DecimalToBinary {
        static String dtob(int n){
//                int a;
//                double k  = Math.ceil((Math.log(n+1))/Math.log(2));
//                int j = (int) k;
////                System.out.println(j);
//                int[] arr = new int[j];
//                int i = 0;
//                while(n > 0){
//                        a = n % 2;
//                        arr[i] = a;
//                        i++;
//                        n = n/2;
//                }
//                for(int h = j ; h >= 0 ;h--){
//                        System.out.println(arr[j]);
//                }
                String k = "";
                int a;
                while(n > 0){
                      a = n % 2;
                      k = a + k;
                      n = n / 2;
                }
                return k;

        }
        public static void main(String args[]){
                String str = dtob(4);
                System.out.println(str);
        }
}
