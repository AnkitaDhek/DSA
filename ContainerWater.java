/*The container with most water problem involves finding the maximum amount of water that can be trapped between two vertical lines 
in a given array of non-negative integers representing the height of each line. The two vertical lines represent the left and right
boundaries of a container, and the goal is to find the maximum amount of water that can be trapped between these
boundaries by selecting two lines that are the farthest apart and have the highest possible height.
*/

/*This code starts with two pointers, one at the beginning of the array and the other at the end. It calculates the
 area between them and updates the maximum area seen so far. Then, it moves the pointer with the smaller height towards the 
 center of the array, since moving the pointer with the larger height would only decrease the area. This process continues until 
the two pointers meet in the middle. The time complexity of this approach is O(n), which is much faster than the brute force approach.
*/

import java.util.*;
public class ContainerWater {

public static int mostwater(int a[]){
 int i = 0;
 int j = a.length-1;
 int water = 0;
 while(i<j){
int  w = j-i;   //width by taking the difference of the indexes of height
int height = Math.min(a[i],a[j]);  //comparing height for minimum

water = Math.max(water,height*w);
  if(a[i]< a[j]){   //condition to check which pointer to increment
    i++;
  }
  else{
    j--;
 }
}
    return water;
    
}
public static void main(String[] args) {
    int a[] = {1,8,6,2,5,4,8,3,7};
    System.out.println(mostwater(a));
}

}