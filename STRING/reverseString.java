      //approach 1: by concatination of String

// public class reverseString {
//     public static void main(String[] args) {
//         String str = "ANKITA";
//         String rev = "";  //Initializes an empty string to store the reversed string.
//         int n = str.length();

//         for(int i = n-1; i>=0; i-- ){
//             rev +=  str.charAt(i);
//         }
//         System.out.println("Reversed string is:"+rev);
//     }
    
// }





         //Approach 2 by using character Array


//          public class reverseString {
//                 public static void main(String[] args) {
//                     String str = "ANKITA";
//                     String rev = "";
// //inbuilt method used to convert the string to the character array
//                     char a[] = str.toCharArray();
//                     int n =a.length;

//                     for(int i = n-1; i>=0; i--){
//                         rev = rev+a[i];
//                     }

//                     System.out.println("reverse string:"+rev);

//          }
//         }


            //CASE 2

//         The method initializes n to the last index of the array (s.length - 1).
// It uses a for loop to swap the characters from the start to the middle of the array.
// After the loop, the array s is reversed in place.
// The dry run shows how the characters are swapped step by step until the array is fully reversed.

        // Loop Condition: The loop runs from i = 0 to i < n / 2. This ensures that each element from the start is swapped with its corresponding element from the end, working towards the middle of the array.
        // Swapping Elements:
        // temp = s[i]; - Temporarily store the value at the i-th position.
        // s[i] = s[n - i]; - Assign the value from the n - i-th position to the i-th position.
        // s[n - i] = temp; - Assign the stored value from the i-th position to the n - i-th position.



        public void reverseString(char[] s) {
            int n = s.length-1;
            
            for(int i = 0; i<n/2; i++){
              char temp = s[i];
              s[i] = s[n-i];
              s[n-i] =temp;
            }
          
             
         }
     



