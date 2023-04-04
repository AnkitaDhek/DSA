//SEARCHING AN ELEMENT IN A 2D MATRIX
/*2D array can be defined as an array of arrays. The 2D array is organized as matrices which can be represented as the collection of rows
 and columns. Each element of a multidimensional array is an array itself*/

 //The number of elements that can be present in a 2D array will always be equal to (number of rows * number of columns).
 //In the code below matrix.length is used to calculate the no of rows and matrix[0].length to calculate the no of columns respectively.

import java.util.*;
public class SearchTwoD{

  public static boolean Search(int matrix[][],int key){

// taking input
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
              if(matrix [i][j] == key){

                System.out.println("found atcell ("+i +", "+j+")");
                return true;

              }
      }
}

  System.out.println("key not found");
    return false;




  }
        public static void main(String[] args) {


                Scanner sc = new Scanner(System.in);
     
                int matrix[][] = new int[2][3];
                 int n = matrix.length, m = matrix[0].length;//matrix[0].length give the 0th index of row
           //LOOOP TO INPUT THE ELEMENTS OF THE MATRIX
               
          // for rows 
           for (int i = 0; i < n; i++) {
                  //for columns
                        for (int j = 0; j < m; j++) {
                             matrix[i][j] = sc.nextInt();//accesing the elements of matrix where i is row and j is column
                        }
                }

             //OUTPUT
                for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                                System.out.print(matrix[i][j] + " ");

                        }

                        System.out.println();
                }
                Search(matrix, 4);//calling search function
        }


      }
