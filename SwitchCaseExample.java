import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args)
    {
        int ch;
        System.out.println("Enter the Number to Know the Day");
        Scanner c= new Scanner(System.in);
        ch=c.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
    
}
