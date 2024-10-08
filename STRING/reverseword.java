// We are given a  string s, we have to reverse the order of the words.A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
// Return a string of the words in reverse order concatenated by a single space.

// Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

// Example 1:
// Input: s = "the sky is blue"
// Output: "blue is sky the"
// Example 2:
// Input: s = "a good   example"
// Output: "example good a"
// Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

                              // Logic Behind the Code
// Splitting the String:The input string s is split into words using split("\\s+"), which splits the string based on one or more whitespace characters.
// Reversing the Words: A StringBuilder is used to efficiently build the reversed string.
// The for loop iterates over the words array from the last element to the first, appending each word to the StringBuilder.
// Spaces are appended between the words except after the last word to avoid an extra space at the end.
// Returning the Result:// The StringBuilder content is converted to a string and returned.

public class reverseword {
    public static String reverse(String s) {
        // Split the string by one or more whitespace characters
        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();

        // Iterate over the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]); // Append the current word
            sb.append(" "); // Append a space after each word
        }

        // Convert StringBuilder to String and trim leading/trailing spaces
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverse("the sky           is blue")); // Test the reverse method
    }
}
