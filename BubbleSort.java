/*Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements 
if they are in the wrong order. This algorithm is not suitable for large data sets as its average and 
worst-case time complexity is quite high.
Its TC is O(N^2)
SC is O(N)
 */
public class Sorting {

    public static void sortingArray(int a[]){
        //first loop to count the no of iteration/rounds
        for (int i = 0; i<a.length-1; i++){
          //inner loop to traverse through the elements of the array 
            for (int j = 0 ; j< a.length - 1-i; j++){

                if (a[j] > a[j+1]){
              // swap arr[j+1] and arr[j]
               int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
            }
        }

        }  
}
//method to printing the sorted array
 public static void print(int a[]){
    for (int i = 0 ; i<a.length; i++){
        System.out.print(a[i] + " ");
    }
 }
public static void main(String[] args) {
    int a[] = {5,4,3,2,1};

    sortingArray(a);//calling method
    System.out.println("Sorted Array:");
    print (a);//calling print method
}

}
