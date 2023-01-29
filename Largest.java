//programme to find the largst and the smallest num from the given array
/*here we used a method name  Integer MAX_VALUE and Integer MIN_VALUE whose values are +infinity and -infinity respectively,for finding theLARGEST value we compare
the values of elements of the array with variable largest intializeda with -infinity if any of the elment of the given array is greater than -infinity then then the 
value of the largest variable is updated with the array element and after iterating through all the elements of array  at last  largest value is printed.
*/
public class Largest {

    public static int Largest(int a[]){

        int largest = Integer.MIN_VALUE;//method whose value is -infinity
        int smallest = Integer.MAX_VALUE;// +infinity

        for(int i =0 ; i<a.length ; i++){

            if (largest < a[i])  //if -infinity < a[i]i.e 4  then value is updated
            {
                largest = a[i];   //largest = 4; for 1st iteration
            }
            
            if (smallest > a[i]){
                smallest = a[i];  
            }
            
        }
        System.out.println("Smallest value is:"+smallest);//to print the smallest value
        return largest;  //it will return the value of largest variable 
    }

    public static void main(String[] args) {

        int a[] = {4,10,34,66,65};
        System.out.println("The largest number is "+Largest(a));
        
    }    
}
