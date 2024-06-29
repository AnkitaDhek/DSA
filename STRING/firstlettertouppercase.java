public class firstlettertouppercase {

    public static String to_UppperCase(String str) {
        StringBuilder sb = new StringBuilder(); // Create a StringBuilder object

        char ch = Character.toUpperCase(str.charAt(0)); // Convert the first character to uppercase
        sb.append(ch); // Append the uppercase first character

        for (int i = 1; i <= str.length() - 1; i++) {
    // checks if the current character is a space and ensures it's not the last character of the string
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i)); // Append the space
                i++; // Move to the next character
                sb.append(Character.toUpperCase(str.charAt(i))); // Convert the next character to uppercase and append
            } else {
                sb.append(str.charAt(i)); // Append the current character as is
            }
        }

        return sb.toString(); // Convert the StringBuilder to a string and return it
    }

    public static void main(String[] args) {
        String str = "i am Ankita"; // Input string
        System.out.println(to_UppperCase(str)); // Call the method and print the result
    }
}
                            //DRY RUN
                            
// Input string: "i am Ankita"
// StringBuilder sb = new StringBuilder(); initializes sb with no initial content.
// char ch = Character.toUpperCase(str.charAt(0)); converts the first character i to I.
// sb.append(ch); appends I to sb, so sb now contains: "I".
// For loop (for (int i = 1; i <= str.length() - 1; i++))
// Iteration 1 (i = 1):

// str.charAt(i) == ' ' (space).
// sb.append(str.charAt(i)); appends the space to sb.
// i++ increments i to 2.
// sb.append(Character.toUpperCase(str.charAt(i))); converts a to A and appends it.
// sb now contains: "I A".
// Iteration 2 (i = 2):

// i was incremented to 2 in the previous iteration, so we start with i = 3.
// str.charAt(i) == 'm' (not a space).
// sb.append(str.charAt(i)); appends m to sb.
// sb now contains: "I Am".
// Iteration 3 (i = 4):

// str.charAt(i) == ' ' (space).
// sb.append(str.charAt(i)); appends the space to sb.
// i++ increments i to 5.
// sb.append(Character.toUpperCase(str.charAt(i))); converts A to A (already uppercase) and appends it.
// sb now contains: "I Am A".
// Iteration 4 (i = 5):

// i was incremented to 5 in the previous iteration, so we start with i = 6.
// str.charAt(i) == 'n' (not a space).
// sb.append(str.charAt(i)); appends n to sb.
// sb now contains: "I Am An".
// Iteration 5 (i = 7):

// str.charAt(i) == 'k' (not a space).
// sb.append(str.charAt(i)); appends k to sb.
// sb now contains: "I Am Ank".
// Iteration 6 (i = 8):

// str.charAt(i) == 'i' (not a space).
// sb.append(str.charAt(i)); appends i to sb.
// sb now contains: "I Am Anki".
// Iteration 7 (i = 9):

// str.charAt(i) == 't' (not a space).
// sb.append(str.charAt(i)); appends t to sb.
// sb now contains: "I Am Ankit".
// Iteration 8 (i = 10):

// str.charAt(i) == 'a' (not a space).
// sb.append(str.charAt(i)); appends a to sb.
// sb now contains: "I Am Ankita".
// Return Statement
// return sb.toString(); converts sb to a string and returns it