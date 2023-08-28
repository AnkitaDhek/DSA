/*The problem is to find the single element in a sorted array where all other elements appear twice. This means that all elements in the array 
occur in pairs except for one element which occurs only once. The goal is to find this single element efficiently without having to compare every
 element in the array. 
 The brute force approach would be to iterate through the entire array and compare each element with its adjacent elements until the single element
  is found. However, this approach has a time complexity of O(n) which can be very slow for large arrays.

The approach described below uses binary search to divide the array into two parts and eliminate half of the remaining elements with each iteration.
 This significantly reduces the number of comparisons needed to find the single element, resulting in a time complexity of O(log n). 
 This makes the approach much more efficient than the brute force approach for large arrays.
*/


public class singleelement {
    public static int singleNonDuplicate(int nums[]) {
        int n = nums.length;
       
     // Edge cases:
        if (n == 1)   //if the array has only one element
           return nums[0];
            
        if (nums[0] != nums[1])//the first elment is not equal to its next element
           return nums[0] ;     //so the first element is the single element
            
        if (nums[n-1] !=  nums[n - 2]) //the last element is not equal to its second last element
            return nums[n-1];

        int low = 1, high = n - 2;   //then we check for the elements between 1st index and second last index

        //using while loop to iterate through remaining elements
        while (low <= high) {
            int mid = (low + high) / 2;

            // If arr[mid] is the single element:
            if ((nums[mid]!=nums[mid + 1]) && (nums [mid]!= nums[mid - 1])) {
                return nums[mid];
            }

            // We are in the left:
            if ((mid % 2 == 1 && nums[mid-1] == nums[mid])|| (mid% 2 == 0 && nums[mid] == nums[mid+1]) ){
                // Eliminate the left half:
                low = mid + 1;
            }
            
            // We are in the right:
            else {
                // Eliminate the right half:
                high = mid - 1;
            }
        }

        // Dummy return statement:
        return -1;
    }

    public static void main(String[] args) {
      int nums[] = {1,1,2,2,3,3,4,5,5,6,6};
        int ans = singleNonDuplicate(nums);
        System.out.println("The single element is: " + ans);
    }
}

