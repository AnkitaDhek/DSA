/*In binary search we dont have to iterate through all the elements of the given array.
we will take a start and a end value and will iterate between it 
Example of binary search is Dictionary 
*/ 
public class binarySearch {

    public static int Search(int a [],int key){
      
        int start = 0;
         int end = a.length-1;

         while(start <= end){
         int mid = (start+end)/2;
         if (a[mid] == key){
         return mid;
          }
          if (a[mid]< key){   //here if mid is <key so we will find the element on right side
            start = mid +1;  //and will shift the start to mid+1
          }
         else{                //for left side
            end =mid-1;
         }
       
    }
       return -1;

    }
    
    public static void main(String[] args) {
        int a[]= {8,20,43,45,78,80};
        int key = 45;
        System.out.println("index for the key is:"+ Search(a,key));
    }
    
}
