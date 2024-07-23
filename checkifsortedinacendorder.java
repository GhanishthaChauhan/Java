import java.util.*;
public class checkifsortedinacendorder {
       public static void main(String[] args) {
        // Take an array of numbers as input and check if it is an array sorted in ascending order.
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array- ");
        int size=sc.nextInt();
        int[] array=new int[size];
        System.out.print("Enter the numbers in an array- ");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        
        boolean isAscending=true;
         for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){ 
                isAscending=false;
            }
         }
        if(isAscending){
            System.out.println("Array is  sorted in ascending order"); 

        }
        else{
            System.out.println("Array is not sorted in ascending order");
        }
        
       }
}
