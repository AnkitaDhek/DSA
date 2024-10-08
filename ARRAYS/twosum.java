/*TWO SUM PROBLEM
 * 
 * 
 Given an array of integers nums and an integer target, return the indices of the two numbers such that they add up to the target.
 */


public class twosum {
    
        public static int[] twoSum(int[] nums, int target) {
             int sum = 0;
            for(int i = 0 ; i<= nums.length-1; i++){
                 for(int j =i+1 ; j<nums.length-1; j++){
                    
                    sum = nums[i] +nums[j];
                    if(sum == target){
                        return new int[] {i,j};
                    }
                    
                 }
            }
            return new int[] {};
            
        }



        public static void main(String[] args) {
            int nums[] = {2,3,4,5,6};
            int target = 10;
            System.out.println(twoSum(nums,target));
        }
}
    
    


    /*Given an array of integers nums and an integer target, return the indices of the two numbers such that they add up to the target. */return new int[] {i, j};

// This line is executed when the function finds two indices i and j such that the sum of the elements at these indices equals the target.
// new int[] {i, j} creates and returns a new array containing the indices i and j.
// Example:
// Suppose i = 1 and j = 3, and these indices satisfy the condition nums[i] + nums[j] == target.
// The function would return [1, 3].