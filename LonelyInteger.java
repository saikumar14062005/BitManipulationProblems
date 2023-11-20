package BitManupulation;

import java.util.HashSet;

public class LonelyInteger {
    // using set or HashSet;
//    static int unique_integer(int arr[]){
//        HashSet<Integer> s = new HashSet<Integer>();
//        for(int i : arr){
//            if(s.contains(i)){
//                s.remove(i);
//            }
//            else{
//                s.add(i);
//            }
//        }
//        for(int i :s){
//            return i;
//        }
//        return -1;
//    }

    // HashSet method time complexity is 0(n) but it takes more space complexity so to reduce
    // that we came up with another super efficient method that is XOR  method

    static int Unique_Integer(int arr[]){
        int res = 0;
        for(int i : arr){
            res = res ^ i;
        }
        return  res;

    }
    public static void main(String[] args) {
        int arr[] = {1,1,5,2,3,3,2,5,6};
        int k = Unique_Integer(arr);
        System.out.println(k);
    }
}
