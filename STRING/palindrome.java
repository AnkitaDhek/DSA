// A palindrome is a string that reads the same forward and backward. The algorithm works by comparing characters from
//  the start and end of the string, moving towards the center.


// Initialize: Determine the length of the string  S and set  n to be the index of the last character (S.length() - 1).
// Loop: Iterate from the start of the string to the middle (for (int i = 0; i <= n / 2; i++)).
// Compare: In each iteration, compare the 
// 𝑖
// i-th character from the start (S.charAt(i)) with the corresponding character from the end (S.charAt(n - i)).

public class palindrome {
        static int isPalindrome(String S) {
            
            int n = S.length()-1;
            for(int i =0 ; i<=n/2 ;i++ ){
                if(S.charAt(i) != S.charAt(n-i))//if (S.charAt(i) != S.charAt(n - i)) compares the ith character from the start with the corresponding ith character from the end.
                {
                   return 0;
                }
                
            }
            return 1;
        }


        public static void main(String[] args) {
            String S = "abba";
            System.out.println(isPalindrome(S));
        }
    }
    
    // Dry Run for "abba"
    // Initial Setup
    // Input String (S): "abba"
    // Length of S: 4
    // Last Index (n): 3 (since S.length() - 1)
   
    // Step 1: Initialization
    // n = 3

    // Step 2: Loop Initialization
    // The loop will run from i = 0 to i = n / 2 = 3 / 2 = 1. So, the loop will iterate twice (i = 0 and i = 1).
    // First Iteration (i = 0)
    
    // Compare S.charAt(0) with S.charAt(3):
    // S.charAt(0) = 'a'
    // S.charAt(3) = 'a'
    // Since S.charAt(0) == S.charAt(3), continue to the next iteration.
   
    // Second Iteration (i = 1)
    // Compare S.charAt(1) with S.charAt(2):
    // S.charAt(1) = 'b'
    // S.charAt(2) = 'b'
    // Since S.charAt(1) == S.charAt(2), continue. The loop ends here as i = 1 was the last iteration.
    // Step 5: Return Statement
 // Since all corresponding characters matched, return 1.
   
//  Dry Run for "abc"
// Initial Setup
// Input String (S): "abc"
// Length of S: 3
// Last Index (n): 2 (since S.length() - 1)
// Steps in the Code
// Step 1: Initialization

// n = 2
// Step 2: Loop Initialization

// The loop will run from i = 0 to i = n / 2 = 2 / 2 = 1. So, the loop will iterate twice (i = 0 and i = 1).
// First Iteration (i = 0)

// Compare S.charAt(0) with S.charAt(2):
// S.charAt(0) = 'a'
// S.charAt(2) = 'c'
// Since S.charAt(0) != S.charAt(2), return 0 immediately.