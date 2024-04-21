/* This method takes an array of integers as input and increments the number represented by the array by 1.
It starts from the least significant digit (last element of the array) and iterates towards the most significant
 digit (first element of the array)
 
Input: digits = [4,3,2,1] Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].

Example 3:
Input: digits = [9] Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].


THIS PROBLEM HAS TWO CASES -
I-> IF NO IS BETWEEN 0 TO 8 THEN INCREMENT THE LAST ELEMENT BY ONE AND RETURN 
2->IF THE LAST ELEMENT IS 9 THEN BY +1 WE GET 10 S0 ONE IS CARRY AND TO STORE IT WE WILL MAKE AN 
ADDITIONAL ARRAY WITH SIZE ONE LARGER THAN THE ORIGINAL ARRAY AND PUT THE ONE IN AT THE Oth INDEX OF THE NEW ARRAY
 */
// both the time and space complexity of the plus method are O(n), 
//The main loop iterates through each element of the array exactly once, from right to left.
public class plusone {
    public static int[]plus(int nums[ ]){
    int n = nums.length;
      for(int i = n-1; i>=0 ;i--){
//If the current digit is not 9, it increments it by 1 and exits the loop.

        if(nums[i] != 9){
            nums[i]++;
            break;
        }else{//If the current digit is 9, it sets it to 0 and continues to the next higher digit.

            nums[i] =0;
        }

      }
      //After the loop, if the most significant digit is 0 (indicating a carry-over), it creates a new array with one extra digit and sets the most significant digit to 1, effectively handling the carry-over.

      if(nums[0] == 0) {
//new array named res is created with a length one more than the original array nums. This is done by initializing
// res with n + 1 elements.So, res is initialized as {0, 0, 0, 0, 0, 0}.
        int []res = new int[n+1];
        res[0] =1;
        return res;
      }   
       
        return nums;

    }
public static void main(String[] args) {
    int nums[] = {9,9,9,9,9};

    int[] plus = plus(nums);//It calls the plus method with the nums array and stores the returned array in plus.
    for(int i = 0 ; i<nums.length;i++){
    System.out.println(plus[i]+"");
   }
  }
}
/* Here's a breakdown of the space complexity:

When there's no carry-over:
In this case, no additional space is required beyond the original input array nums. The space complexity 
remains O(n), where n is the length of nums.
When there's a carry-over:
In this case, an additional array res of length n+1 is created to accommodate the carry-over. This additional 
trespace is required temporarily.
However, as soon as the res array is returned from the method, the original array nums gets replaced by res. So, the additional space is not permanent.
Therefore, the space complexity, considering the worst-case scenario (with carry-over), is O(n+1), which simplifies to O(n).*/