// Character Conversion:

// Convert each character in the string to its corresponding alphabetic position. For instance, for the string s = "abc", the transformation is as follows:
// 'a' becomes 1
// 'b' becomes 2
// 'c' becomes 3
// So, the transformed string would be "123".
// Summing Digits:

// Perform a transformation where you repeatedly sum the digits of the resulting string. For example:
// For "123", summing the digits gives 1 + 2 + 3 = 6.
// Replace the string with this new sum and repeat the process k times.
// Final Output:

// After k transformations, return the final result as an integer.
// Example:
// Example 1:
// Input:
// s = "abc"
// k = 1
// Process:
// Step 1: Convert the string abc to "123" (based on alphabet positions).
// Step 2: Sum the digits of "123" → 1 + 2 + 3 = 6.
// Output: 6 (after 1 transformation).

public class sumofdigitafterconvert {
    class Solution {
        public int getLucky(String s, int k) {
        //This creates a new StringBuilder instance. It will be used to store the concatenated 
        //numeric positions of the characters in the input string.
            StringBuilder sb = new StringBuilder();
            
            // Convert characters to their respective positions
            char[] charArray = s.toCharArray(); // Convert string to character array "zbax", charArray will be ['z', 'b', 'a', 'x'].
            for (int i = 0; i < charArray.length; i++) { // iterates over each character in charArray using an index i.
                char ch = charArray[i]; // Access each character
                sb.append(ch - 96); // Convert character to its position and append
            }
            
            // Perform k transformations
            while (k > 0) {
                int sum = 0;
                for (int i = 0; i < sb.length(); i++) { // Loop through the StringBuilder
                    sum += (sb.charAt(i) - '0'); // Convert character to digit and add to sum
                }
                k--; // Decrease k after one transformation
                sb = new StringBuilder(String.valueOf(sum)); // Update sb with the new sum
            }
            
            return Integer.parseInt(sb.toString()); // Convert final result to integer While you can build a string using StringBuilder, it is not inherently a string itself. Instead, it holds a sequence of characters that can be manipulated but is still treated as an object of type StringBuilder.
        }
    }
    

}

// String.valueOf(sum):

// This part converts the integer sum to its string representation.
// For example, if sum is 17, String.valueOf(sum) returns the string "17".
// If sum is 8, it returns "8".

// new StringBuilder(...):
// This part creates a new instance of the StringBuilder class using the string created in the previous step.
// The constructor of StringBuilder accepts a String argument, which initializes the StringBuilder with the contents of that string.
// So, new StringBuilder("17") creates a StringBuilder containing the characters '1' and '7', while new StringBuilder("8") creates a StringBuilder containing the character '8'.
// Assignment to sb:

// The newly created StringBuilder instance replaces the previous StringBuilder stored in sb.
// This means that sb now holds a new value that represents the result of the current transformation (the sum of the digits).

// The line sb = new StringBuilder(String.valueOf(sum)); is used after calculating the sum of the digits from the previous StringBuilder (sb).
// This effectively resets sb to start fresh for the next transformation. Each time you complete a transformation (when k is decremented), you need to summarize the digits and create a new StringBuilder to hold that summarized value.
// 

// Initial Setup
// Input: s = "zbax"
// k: 2
// StringBuilder: sb starts as an empty string.

// Step 1: Convert Characters to Numeric Positions
// Convert s to Character Array:
// charArray = ['z', 'b', 'a', 'x']
// Traditional For Loop Execution:

// Iteration 1 (i = 0):
// ch = 'z'
// sb.append(ch - 96) → ASCII value of 'z' is 122; thus 122 - 96 = 26.
// sb now becomes "26".
// Iteration 2 (i = 1):

// ch = 'b'
// sb.append(ch - 96) → ASCII value of 'b' is 98; thus 98 - 96 = 2.
// sb now becomes "262".
// Iteration 3 (i = 2):

// ch = 'a'
// sb.append(ch - 96) → ASCII value of 'a' is 97; thus 97 - 96 = 1.
// sb now becomes "2621".
// Iteration 4 (i = 3):

// ch = 'x'
// sb.append(ch - 96) → ASCII value of 'x' is 120; thus 120 - 96 = 24.
// sb now becomes "262124".
// After completing this loop, sb contains the string "262124".

// Step 2: Perform k Transformations
// First Transformation (k = 2)
// Initialize sum:// sum = 0

// Inner For Loop:
// Iteration 1 (i = 0):
// sum += (sb.charAt(0) - '0') → sum = 0 + 2 → sum = 2.

// Iteration 2 (i = 1):
// sum += (sb.charAt(1) - '0') → sum = 2 + 6 → sum = 8.

// Iteration 3 (i = 2):
// sum += (sb.charAt(2) - '0') → sum = 8 + 2 → sum = 10.

// Iteration 4 (i = 3):
// sum += (sb.charAt(3) - '0') → sum = 10 + 1 → sum = 11.

// Iteration 5 (i = 4):
// sum += (sb.charAt(4) - '0') → sum = 11 + 2 → sum = 13.

// Iteration 6 (i = 5):
// sum += (sb.charAt(5) - '0') → sum = 13 + 4 → sum = 17.

// After Summing:
// sum = 17
// k-- → Decrement k: k = 1
// sb = new StringBuilder(String.valueOf(sum)); → sb becomes "17".
// Second Transformation (k = 1)
// Initialize sum:

// sum = 0
// Inner For Loop:

// Iteration 1 (i = 0):

// sum += (sb.charAt(0) - '0') → sum = 0 + 1 → sum = 1.
// Iteration 2 (i = 1):

// sum += (sb.charAt(1) - '0') → sum = 1 + 7 → sum = 8.
// After Summing:

// sum = 8
// k-- → Decrement k: k = 0
// sb = new StringBuilder(String.valueOf(sum)); → sb becomes "8".
// Final Step
// Return the Result:
// return Integer.parseInt(sb.toString());
// sb.toString() is "8", and Integer.parseInt("8") returns 8.
// Conclusion
// The final result returned by getLucky("zbax", 2) is 8.