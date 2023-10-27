import java.util.Scanner;
import java.util.regex.*;

class EmailValidation {
    public static void main(String[] args)
    {
        System.out.println("Enter the Mailid= ");
        try (Scanner sc = new Scanner(System.in)) {
            String str= sc.nextLine();
            Pattern p= Pattern.compile("[A-Za-z0-9_.]*[@][A-Za-z]+[[.][A-Za-z]+]+");
            Matcher m= p.matcher(str);
            if(m.find() && m.group().equals(str))
            {
                System.out.println("Valid Mailid");
            }
            else
            {
                System.out.println("Invalid Mailid");
            }
        }
    }
    
}
