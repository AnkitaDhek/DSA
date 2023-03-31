/*Linear search is also called as sequential search algorithm. It is the simplest searching algorithm. 
In Linear search, we simply traverse the list completely and match each element of the list with the item whose location is to be found.
 */

public class Linearsearch {

    public static int Search(int n[],int key){
        for(int i = 0; i< n.length; i++){
            if(n[i] == key){
                return i;
            }
        }

     return -1;//it will return -1 if there is no such number in the array
    }

    public static void main(String[] args) {

        int n[] = {78,99,55,100,4};
        int key = 55;  //key is the number whose index we had to find from the given array
        
        int index = Search(n,key);
        if (index == -1){
            System.out.println("NOT FOUND");
        }else{
        System.out.println("Key is at index"+index );
    }
    
   }   
}
