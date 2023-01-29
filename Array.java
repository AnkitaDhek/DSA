class Array{

    public static void reverseArray(int a[]){
       int first = 0 ,last = a.length-1;
       while(first<last){
       int temp = a[last];
         a[last] = a[first];
         a[first] =temp;

         first++;
         last--;
        }
       
    }
public static void main(String[] args) {

    int a[] = {2,4,6,7,8,9};
    reverseArray(a);
  
    for(int i =0 ; i<a.length ; i++){
        System.out.print(a[i]+" ");
     }
    }
 }

    
    