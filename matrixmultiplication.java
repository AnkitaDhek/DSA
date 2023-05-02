//In this code we calculated the matrix multiplication 
//i.e c[i][j] = a[i][k]*b[k][j]
/*
 * here the matrix 1 is of r1*c1 // matrix 2 is of r2* c2
 *  The matrix after multiplication should be of dimension(r1*c2)
 * 
 * The multiplication would not be performed in case of c1 != r2
 */
/*
 * for that we will use three loops -
 * 1. to iterate over the rows  i.e" i"
 * 2. to iterate over the columns  i.e "j"
 * 3. to compute no of dot operations/ or to calculate the no of computations i.e "k"
 * 
 * The no of computations are equal to c1 and r2
 * 
 */
import java.util.Scanner;
public class matrixmultiplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //to enter the dimension of matrix 1
        System.out.println("Enter the no of rows and columns in matrix 1:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        //to enter the dimensions of matrix 2
        System.out.println("Enter the no of rows and columns in matrix 2:");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

//reqirement check for matrix multiplication 
        if(c1 != r2){
            System.out.println("Multiplication is not possible");
            return;
        }

       int a[][] = new int[r1][c1];
       int b[][] = new int[r2][c2];
       int[][] c = new int[r1][c2];


        System.out.println("Enter the values of matrix1:");
        for(int i= 0 ; i<r1 ; i++){
         for(int j= 0; j<c1 ; j++){
               a[i][j] = sc.nextInt();
        
          }
        }

        System.out.println("Enter the values of matrix2:");
        for(int i= 0 ; i<r2 ; i++){
          for(int j= 0; j<c2 ; j++){
               b[i][j] = sc.nextInt();
        
          }
        }

    
//calculating matrix multiplication
  System.out.println("Matrix multiplication is:");{

    for(int i = 0 ; i<r1; i++){// to iterate over rows

        for(int j = 0 ; j<c2; j++){ // to iterate over columns

            for(int k = 0 ; k<c1 ; k++){   // to compute the dot product or the no of computation done
                c[i][j] = a[i][k] * b[k][j];
            }
            System.out.print(c[i][j]+ " ");
        }
        System.out.println();
    }
  }
             
    
    }
    

}
