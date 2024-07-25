import java.util.*;
import java.util.regex.Pattern;
public class patternproblem2striver {
    // Pattern
    // *
    // **
    // ***
    // ****
    // *****
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of rows in your pattern- ");
        int rows=sc.nextInt();
        System.out.print("Enter the number of cols in your pattern- ");
        int cols=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
