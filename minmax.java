import java.util.*;
public class minmax {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array- ");
        int size=sc.nextInt();
        System.out.println("Enter the numbers in an array- ");
        int array[]=new int[size];
        for(int i=0;i<array.length;i++){
          array[i]=sc.nextInt();
        }
        //to find minimum in an array
        int min=array[0];
        int max=array[0];
        for(int i=1;i<array.length;i++){
           if(min>array[i]){
            min=array[i];
          }
        }
        System.out.println("The minimum value from the array would be - "+min);
         //to find minimum in an array
        for(int i=1;i<array.length;i++){
          if(max<array[i]){
            max=array[i];
          }
        }
        System.out.println("The maximum value from the array would be - "+max); 
       }
}
