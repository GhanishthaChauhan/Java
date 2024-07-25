import java.util.*;
public class patternproblem5striver {
    // Revise it properly!!
    // pattern
    // *****
    // ****
    // ***
    // **
    // *
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of rows in your pattern- ");
        int rows=sc.nextInt();
        System.out.print("Enter the number of cols in your pattern- ");
        int cols=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=cols-1;j>=i;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
