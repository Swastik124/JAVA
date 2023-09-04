import java.util.*;

public class LoopExample {
    public static void main(String[] args)
    {
        int i=5;
        //For LOOP
        for(i=0;i<5;i++)
        {
            System.out.println("For LOOP");
        }
        
        int j=0;
        while(j<5)
        {
            System.out.println("While LOOP");
            j++;
            if(j==6)           //Break Statement Execution
            break;
            else {
                continue;            //Continue Statement Execution
            }
        }
        int k=0;
        do
        {
            ++k;
            System.out.println("Do While LOOP");
        }
        while(k<5);

        //Switch Statement Execution
        System.out.println("Enter number to display the day=\n1:Monday\n2:Tuesday\n3:Wednesday\n4:Thursday\n5:Friday\n6:Saturday\n7:Sunday");
        try (Scanner sc = new Scanner(System.in)) {
            int ch = sc.nextInt();
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
                default:
                    System.out.println("Enter valid Input");
            }
        }
        
    }
}
