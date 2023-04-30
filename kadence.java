//APPROACH 3 :KADENCE ALGORITHM
/*(It is the most optimized approach with a TC of O(n))

it basically says whereever we get current sum -ve while transversing  the array then intialize it with 0;
The algorithm won’t work if all elements of array are negative. We will make small changes to algorithm to make it
 work for negative numbers for too.
*/
public class kadence {
    public static void sumsubarray(int a[]){
        
    int ms = Integer.MIN_VALUE;
    int cs = 0;

    for (int i =0 ; i<a.length; i++){
           cs = cs + a[i];    

           if(cs<0){  //if the value of ms is -ve then it returns cs as 0
            cs = 0;
           }

           ms = Math.max(cs, ms);//math method it compare ms and cs and whoever has the max sum get stored in ms
        }

        System.out.println("Max subarray sum  is :"+ms);

    }
    public static void main(String[] args) {
        int a[] = {-2,-3,4,-1,-2,1,-2,1-5,-3};
        sumsubarray(a);  //calling the function
    }
     
}
    

