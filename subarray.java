
/*
A subarray is the contigious part of an array
the sub-arrays of the array {1, 2, 3} are 
{1}, {1, 2}, {1, 2, 3}, {2}, {2, 3}, and {3}
For solving this problem, we need to use three "for" loops; two loops for traversing 
the sub array (starting from index i and ending with index j)and third one for printing
 the elements of this sub array i.e. between ith and jth indices of the array.

*/
public class subarray {

    public static void Subarray(int a[]){
        for (int i =0 ; i<a.length; i++){  
            int start = i;
            for(int j=i; j<a.length;j++){
            int end = j;
           //for loop to print an array or we can say to iterate through all the elements 
           //of subbarray from start to end    
            for(int k = start; k<=end;k++){ 
                                                 
                System.out.print(a[k]+" ");
              }
             System.out.println();
             
            }
            System.out.println();
    }
    
}
public static void main(String[] args) {
    int a[] ={4,6,7,8,9,6};
    Subarray(a);
}
}