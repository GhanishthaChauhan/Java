import java.util.*;
public class patternproblem3striver {

// Pattern
// 1
// 1 2
// 1 2 3
// 1 2 3 4 
// 1 2 3 4 5
    public static void main(String[] args) {
        
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the no. of rows in your pattern- ");
            int rows=sc.nextInt();
            System.out.print("Enter the number of cols in your pattern- ");
            int cols=sc.nextInt();
            for(int i=0;i<rows;i++){
                for(int j=0;j<=i;j++){
                    System.out.print(j+1+" ");
                }
                System.out.println();
            }
        
    }
}
