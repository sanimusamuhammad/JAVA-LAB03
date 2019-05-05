import java.util.Scanner;
/**
 * Lab03 Assignment2.
 *
 * @author (Sani Musa Muhammad u15/fns/csc/005)
 * @version (a version number or a date)
 */
public class Assignment2
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Email" );
        String Email = input.nextLine();
        
        int i = Email.indexOf("@");
        String UserName = Email.substring(0, i);
        String DomainName = Email.substring(i);
        
        
        
        //String initials_Two =
        //Email.substring(13,22);
        
        //String UserName = i.toLowerCase(0, i);
        System.out.println("The User name is  " +UserName);
       //String DomainName = initials_Two.toLowerCase();
        System.out.println("the Domian name is  " +DomainName);
        
       
    }
  
}
