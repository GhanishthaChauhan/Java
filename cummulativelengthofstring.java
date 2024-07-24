import java.util.*;
public class cummulativelengthofstring {
    // Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of the string you want to add - ");
        int numberofstring=sc.nextInt();
        String[] strings=new String[numberofstring];
        System.out.println("Enter the strings you want to combine - ");
        int combined=0;
        for(int i=0;i<numberofstring;i++){
            strings[i]=sc.next();    //this do not include the space it only count the word 
            // strings[i]=sc.nextLine();   this includes the space too in your length count
            combined  += strings[i].length();
            
        }
        System.out.println(combined);
        // End.......
         

        // New Question start.....
        // Input a string and change the character in the string as change i in place of e 
        Scanner scanner=new Scanner(System.in);
        String changestring=scanner.nextLine();
        String result=" ";
        for(int i=0;i<changestring.length();i++){
        if(changestring.charAt(i)=='e'){
               result+='i';
        }
        else{
            result+=changestring.charAt(i);
        }
        }
        System.out.println(result);
    }
   

}
