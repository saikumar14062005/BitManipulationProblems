package BitManupulation;

public class MaxAndValueInArray {
    static  int checkbits(int arr[],int mask){
        int count = 0 ;
        for(int i = 0 ;  i < arr.length;i++){
            if ((arr[i] & mask) == mask) {
                count++;
            }
        }
        return count;
    }
    static int MaximumAndValue(int ar[]){
        int ans = 0;
        int mask = 0;
        for(int i = 31 ; i >= 0 ;i--){
             mask = (1 << i) | ans;
            int count = checkbits(ar,mask);
            if(count >= 2){
                ans = ans | mask;
            }



        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {16,9,6,13};
        System.out.println(MaximumAndValue(arr));
    }
}
