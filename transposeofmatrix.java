import java.util.*;
public class transposeofmatrix {
    public static void main(String[] args) {
        // transpose of a matrix 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of rows and columns in an array - ");
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] array=new int[rows][cols];
        System.out.print("Enter the numbers of rows and columns in an array- ");
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
              array[i][j]=scanner.nextInt(); 
            }
        }
         System.out.println("The matrix would be - ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
              System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
         System.out.println("Transpose of a matrix would be- ");
         for(int j=0;j<cols;j++){
            for(int i=0;i<rows;i++){
                 System.out.print(array[i][j]+" ");
            }
            System.out.println();
         }

    }
}
