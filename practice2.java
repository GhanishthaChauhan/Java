 import java.util.*;
 public class practice2 {
     public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      Scanner sc=new Scanner(System.in);

      System.out.println("Enter the number how many names you want to print- ");
      int numofname=sc.nextInt();
      String array[]=new String[numofname];
      System.out.println("Enter the names to print in the array- ");
      for(int i=0;i<numofname;i++){
          array[i]=scanner.nextLine();
          System.out.println(array[i]+" ");
          // System.out.println("name " + (i+1) +" is : " + array[i]);
      }
           
          
      
     }
     
}
     