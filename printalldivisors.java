import java.util.*;
public class printalldivisors {
     static int printdivisors(int number){
         int result=0;
        for(int i=1;i<=number;i++){
            for(int j=1;j<=i;j++){
                if(i%j==0){
                  System.out.print(j+" ");
                  result+=j;
                
                }
            }
            System.out.println();
        }
        System.out.print("Total sum of all the divisors = "+result);
      return result;
    }
    public static void main(String args[]){
         Scanner scan=new Scanner(System.in);
         System.out.print("Enter the number till you want to print the divisor- ");
         int number=scan.nextInt();
        int result=printdivisors(number);
    }
}
// Read its optimised soltuion - on gfg not yeh solved properly with optimization on gfg platform
// class Solution{
//     static long sumOfDivisors(int N){
//         int sum=0;
//         for(int i=1;i<=N;i++){
//            for(int j=1;j<=i;j++){
//             if(i%j==0){
//                 sum+=j;
//             }
            
//            }
//         }
//         return sum;
//     }
// }
// some cases still not passed completely 
