
public class Largest {

    public static int Largest(int a[]){

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i =0 ; i<a.length ; i++){

            if (largest < a[i])
            {
                largest = a[i];
            }
            
            if (smallest > a[i]){
                smallest = a[i];
            }
            
        }
        System.out.println("Smallest value is:"+smallest);
        return largest;
    }

    public static void main(String[] args) {

        int a[] = {4,10,34,66,65};
        System.out.println("The largest number is "+Largest(a));
        
    }    
}
