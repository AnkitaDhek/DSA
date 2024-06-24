//in this code we had to find the largest odd no in the string
// LOGIC: checking each digit from the end. Once an odd digit is found, the method returns the substring from the start to that digit, ensuring it's 
//the largest possible odd-ending substring. If no odd digit is found, it returns an empty string.



public class largestoddsubstring {

    public static String largestOdd(String num){
      
        int n = num.length();
      // the loop starts from the end of the string and move towards the last character 0;
        for(int i = n-1; i>=0; i--){
     // num.charAt(i) gets the character at index i.
     // num.charAt(i) - '0' converts the character to its corresponding integer value.
    // This works because in the ASCII table, the character '0' is 48, '1' is 49, ..., and '9' is 57. Subtracting '0' from any digit character gives its integer value.
    // The expression ((num.charAt(i) - '0') % 2 != 0) checks if this integer value is odd. If it is odd, it means the character at index i is an odd digit.
            if((num.charAt(i) -'0') % 2!=0 ){
   
    //if an odd digit is found, the method returns the substring from the start of the string to the
    // current index i (inclusive). i + 1 is used because the substring method's second parameter is exclusive.

                return num.substring(0,i+1); //i.e 3427 for this

            }
        }
        return "";//if no odd digit is found it returns a empty string   
    }
   public static void main(String[] args) {
    String num = "342786";
    System.out.println(largestOdd(num));
   } 
}

