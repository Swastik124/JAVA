//Without a rev checking pallindrome

import java.util.Scanner;

public class PallindromeWithoutRev
{
        public static void main(String[] args)
        {
            String str;
        try (Scanner p = new Scanner(System.in)) {
            str = p.nextLine();
        }
        int s,j,i=0,count=0;
        s=str.length();
        for(i=0,j=s-1;i<s;i++,j--)
        {
           if(i<j)
           {
            if(str.charAt(i) == str.charAt(j))
            {
                count++;
            }
           }
           else
           {
            break;
           }
        }
        if(count==s/2)
        {
            System.out.println("Given String is a Pallindrome");
        }
        else{
            System.out.println("Given String is not a Pallindrome");
        }
    }
}
        
