
                                    //TWO POINTER APPROACH

/*This method is designed to remove duplicate elements from a sorted array of integers a[] by modifying the array in place. Here's how it works:

The method takes an array of integers a[] as input.
>It first checks if the length of the array is zero. If so, it returns 0 because there are no elements to remove.
>It initializes an integer variable i to 0. This variable represents the index where the next unique element will
 be placed in the modified array.
>It iterates through the array starting from index 1 (variable j). This loop is responsible for scanning through
 the array to find duplicate elements.
>Inside the loop, it checks if the element at index j is different from the element at index i. 
    >>If it's different, it means it's a new unique element.
     >>If the elements are **different, it **increments i by 1 to move to the next position where the
      unique element will be stored, and then it **assigns the value of a[j] to a[i].
       This effectively moves the unique element to the correct position in the modified array.

>>After scanning through the entire array, the loop terminates, and **i+1 represents the length of the modified 
array with duplicate elements removed.
Finally, the method returns i+1, which is the length of the modified array containing only unique elements.. */


public class duplicateelement {

    public static int removeElement(int a[]){

        if(a.length == 0)
         return 0;

         int i = 0;//This variable will track the index where the next unique element will be placed in the modified array

         //j This loop is responsible for scanning through the array to find duplicate elements.
         for(int j= 1; j<a.length ; j++){
            if (a[j] != a[i]){
                i++;
                a[i] = a[j];

            }
         }
        
/*i+1 represents the length of the modified array with duplicate elements removed. i tracks the last position of a unique element, so i+1 gives the 
total count of unique elements in the modified array.*/
      return i+1;
    }

    public static void main(String[] args) {

        int a[] ={0,0,1,1,1,2,2,3,3,4};
        System.out.println("k = "+removeElement(a));
        
        
    }
    
}
                                //NAIVE APPROACH
      
      /*                          //using extra space by using an array
    public class duplicateextra {
    public static int[]duplicate(int a[],int n){
        int temp [] = new int[n];// Create a new array to store unique elements

        int j = 0; 
        for(int i = 0; i<n-1; i++){
            if( a[i]!= a[i+1]){
                temp[j] = a[i];
                j++;
            }
    
        }
        // If different, add it to the new array and increment index
         temp [j] = a[n-1];
        return temp;  // Return the new array containing unique elements
    }
    public static void main(String[] args) {
       int a[]= {1,2,2,3,3,4,4,4,5} ;
       int n = a.length;
       int duplicate[] =duplicate(a, n);
       // Print the resulting array containing unique elements
       for(int i =0; i<duplicate.length; i++){
         System.out.print(duplicate[i]+" ");
       }

    }
    
}
*/