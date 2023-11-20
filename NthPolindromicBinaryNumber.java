package BitManupulation;

public class NthPolindromicBinaryNumber {

    static int reverse_of_integer(int n,int len){
        int f = len-1,l = 0;
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
        return rev;

    }

    static int Nth_polindromic_number(int n){
        int l = 0 ; int c = 0;
        int count = 0;
        while(count < n ){
            l++;
            count = count + (int)(Math.pow(2,(l-1)/2));
        }
        count = count - (int)(Math.pow(2,(l-1)/2));
        c = n - count -1;
        int ans;
        ans = (1 << (l-1)) | (c << (l/2));
        ans = ans | reverse_of_integer(ans,l);

        return ans;



    }
    public static void main(String[] args) {
//        System.out.println(Math.pow(2,(-1/2)));
        int k = Nth_polindromic_number(21);
        System.out.println(Integer.toBinaryString(k));
    }
}
