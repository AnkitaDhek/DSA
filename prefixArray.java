
public class prefixArray {

    public static void PrefixSum(int a[]){

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int[a.length];

        prefix[0] = a[0];
       
        for (int i = 1 ; i<prefix.length ; i++){
          prefix[i] = prefix[i-1] + a[i];
        }

        for (int i = 0 ; i < a.length ; i++){
          int  start = i;
            for (int j = i ; j<a.length ; j++ ){
                int end = j;
 //we used ternary operator which says if start = 0 then print prefix[end] else print prfix[end] - prefix[start -1]
                currSum = start == 0 ? prefix[end]:prefix[end] - prefix[start -1];

                if (maxSum < currSum){
                    maxSum =  currSum;
                }
            }
        }
System.out.println("max sum :"+ maxSum);
    }

    

public static void main(String[] args) {
    int a[] = {1,-2,6,-1,3};
    PrefixSum(a);
}
}