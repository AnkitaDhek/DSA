

    import java .util .Scanner;
public class matrixadd {
//method to print the  output
    public static void print(int matrix[][]){
        for(int i = 0 ; i<matrix.length ; i++ ){

            for (int j = 0 ; j<matrix[i].length; j++){
                System.out.println(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
//method to add
public static void add(int a[][], int r1, int c1 ,int b[][], int r2, int c2){
    if (r1!=  r2 || c1!= c2){  //corner case for cases where the dimensions of matrix1 and matrix2 are not same
        System.out.println("Wrong  input");
        return;
    }
    int[][]c = new int[r1][c1];
    for(int i= 0 ; i<r1; i++){

        for(int j = 0 ; j< c1; j++ ){
        c[i][j] = a[i][j]+b[i][j];   //addition of two matrices
    }

}
System.out.println("sum of matrix1 and matrix 2");
    print(c);//calling print funcn
}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of rows and columns in matrix 1");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
//Taking input from user for matrix 1
        int a[][]= new int[r1][c1];
        System.out.println("Enter the no of elements in matrix 1");
        for(int i = 0 ; i<r1 ; i++){
            for (int j = 0 ; j<c1 ; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the no of rows and columns in matrix 2");
        int r2 = sc.nextInt();
        int c2= sc.nextInt();
//Taking input for matrix 2 from user
        int b[][] = new int[r2][c2];
          System.out.println("Enter the no of elements in matrix 2");  
        for(int i = 0 ; i<r2; i++){
            for (int j = 0 ; j<c2; j++){
                b[i][j] = sc.nextInt();
        }
    }
    System.out.println("matrix1");
    print(a);//calling method to print matrix 1

    System.out.println("matrix2");
    print(b);
 
 add(a, r1, c1, b, r2, c2); // calling add method to add the two matrix
    
}

  
}
    

