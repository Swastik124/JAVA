import java.util.Scanner;

public class TakingStringInput {
    public static void main(String[] args)
    {
        System.out.println("Enter Your Name: ");
        Scanner sc= new Scanner(System.in);
        String ch;
        ch=sc.nextLine();
        System.out.println(ch);
    }
}
