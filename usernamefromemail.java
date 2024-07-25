import java.util.*;
public class usernamefromemail {
//     Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
// Example : 
// email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
// email = “helloWorld123@gmail.com”; username = “helloWorld123”

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the email id= ");
    String email_id=sc.nextLine();
    String username=" ";
    for(int i=0;i<email_id.length();i++){
        if(email_id.charAt(i)=='@'){
            break;
        }
        else{
            username +=email_id.charAt(i);
        }
        
    }
    System.out.println(username);
}


}
