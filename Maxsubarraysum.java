//this is the programme to find the max sum of the subarray.
   //APPROACH 1
//Here we are using the BRUTE FORCE APPROACH(i.e basic approach).It is not an optimized approach as it has 
//TC of (O (n^3)) as here we use three  nested for loop
public class Maxsubarraysum {

    public static void subarraysum(int a[]){
       
     int maxSum = Integer.MIN_VALUE;  //maxsum = -infinity
    for(int i = 0; i<a.length;i++){
        for(int j = i; j<a.length; j++){
            int currSum = 0;
            for(int k =i ; k<j; k++){
                //subarray sum
                currSum += a[k];
            }

            if(maxSum < currSum){
                maxSum = currSum;    //value of maxsum is updated
            }
        }
    }
   System.out.println("max sum is :"+maxSum);

  }
    
   public static void main(String[] args) {
    int a[] = {3,6,7,8,1,5};
    subarraysum(a);

   } 
}
