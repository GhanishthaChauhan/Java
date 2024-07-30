import java.util.*;
public class extractingdigitsinanumber {
// using array list method 
    static ArrayList<Integer> digits(int N){
        ArrayList<Integer> ans=new ArrayList<>();
        while(N>0){
          int lastdigit=N%10;
          ans.add(lastdigit);
          N=N/10;
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the numberN= ");
     int numberN=sc.nextInt();
     ArrayList<Integer> digits_in_number;
      digits_in_number=digits(numberN);
      System.out.println("Extracted digits: ");
      int numb=0;
      for(int num:digits_in_number){
        System.out.println(num+" ");
        numb++;
      }
      System.out.println();
      System.out.println("Number of digits in numberN would be- "+numb);
      int numbers=(int) (Math.log10(numberN)+1);
      System.out.println(numbers);
    }
   
}


