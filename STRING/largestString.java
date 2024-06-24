//The code finds the lexicographically largest string in an array of strings.
//Lexicographically means in dictionary order. It is the order in which words or strings are arranged in a dictionary. In lexicographical order, strings are compared character by character based on their ASCII values.

//ex:Compare "apple" and "banana":Compare the first characters: 'a' vs 'b'
//Since 'a' comes before 'b' in the alphabet, "apple" is considered smaller than "banana".

/* compareTo Method:
str1.compareTo(str2) returns:
A negative integer if str1 is lexicographically less than str2.
Zero if str1 is equal to str2.
A positive integer if str1 is lexicographically greater than str2.*/
public class largestString {
    public static void main(String[] args) {
        // Initialize an array of fruits
        String Fruits[] = {"apple", "mango", "banana"};
        
        // Assume the first fruit is the largest initially
        String largest = Fruits[0]; // largest = "apple"
        
        // Loop through each fruit in the array
        for(int i = 0; i < Fruits.length; i++) {
            // Compare the current largest with the current fruit
            // If the current fruit is larger, update the largest
            if(largest.compareTo(Fruits[i]) < 0) {
                largest = Fruits[i];
            }
        }
        
        // Print the largest fruit found
        System.out.println(largest); // Expected output: "mango"
    }
}
