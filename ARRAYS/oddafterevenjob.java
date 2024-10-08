public class oddafterevenjob {
   
        public static void main(String[] args) {
            // Initialize the array with some elements
            int[] arr = {3, 8, 5, 12, 7, 10, 1, 4, 9, 6};
            
            // Call the method to rearrange even and odd numbers and get the result array
            int[] result = rearrangeEvenOdd(arr);
    
            // Print the result array
            System.out.println("Array after arranging even numbers first, followed by odd numbers:");
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
        }
    
        // Method to rearrange the array and return the result
        public static int[] rearrangeEvenOdd(int[] arr) {
            int[] result = new int[arr.length];
            int index = 0;
    
            // First, add even numbers to the result array using a for loop
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    result[index++] = arr[i];
                }
            }
    
            // Then, add odd numbers to the result array using a for loop
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    result[index++] = arr[i];
                }
            }
    
            // Return the result array
            return result;
        }
    }
    /*Initial Setup
Input array (arr): {3, 8, 5, 12, 7, 10, 1, 4, 9, 6}
Result array (result): {0, 0, 0, 0, 0, 0, 0, 0, 0, 0} (initially filled with zeros)
Index (index): 0
First Loop: Adding Even Numbers
Iteration 1: arr[0] = 3 (odd, skip)
Iteration 2: arr[1] = 8 (even, add to result)
result becomes {8, 0, 0, 0, 0, 0, 0, 0, 0, 0}
index increments to 1
Iteration 3: arr[2] = 5 (odd, skip)
Iteration 4: arr[3] = 12 (even, add to result)
result becomes {8, 12, 0, 0, 0, 0, 0, 0, 0, 0}
index increments to 2
Iteration 5: arr[4] = 7 (odd, skip)
Iteration 6: arr[5] = 10 (even, add to result)
result becomes {8, 12, 10, 0, 0, 0, 0, 0, 0, 0}
index increments to 3
Iteration 7: arr[6] = 1 (odd, skip)
Iteration 8: arr[7] = 4 (even, add to result)
result becomes {8, 12, 10, 4, 0, 0, 0, 0, 0, 0}
index increments to 4
Iteration 9: arr[8] = 9 (odd, skip)
Iteration 10: arr[9] = 6 (even, add to result)
result becomes {8, 12, 10, 4, 6, 0, 0, 0, 0, 0}
index increments to 5
Second Loop: Adding Odd Numbers
Iteration 1: arr[0] = 3 (odd, add to result)
result becomes {8, 12, 10, 4, 6, 3, 0, 0, 0, 0}
index increments to 6
Iteration 2: arr[1] = 8 (even, skip)
Iteration 3: arr[2] = 5 (odd, add to result)
result becomes {8, 12, 10, 4, 6, 3, 5, 0, 0, 0}
index increments to 7
Iteration 4: arr[3] = 12 (even, skip)
Iteration 5: arr[4] = 7 (odd, add to result)
result becomes {8, 12, 10, 4, 6, 3, 5, 7, 0, 0}
index increments to 8
Iteration 6: arr[5] = 10 (even, skip)
Iteration 7: arr[6] = 1 (odd, add to result)
result becomes {8, 12, 10, 4, 6, 3, 5, 7, 1, 0}
index increments to 9
Iteration 8: arr[7] = 4 (even, skip)
Iteration 9: arr[8] = 9 (odd, add to result)
result becomes {8, 12, 10, 4, 6, 3, 5, 7, 1, 9}
index increments to 10
Iteration 10: arr[9] = 6 (even, skip)
Final Output
Final result array: {8, 12, 10, 4, 6, 3, 5, 7, 1, 9} */