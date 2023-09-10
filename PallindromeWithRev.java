import java.util.*;

class PallindromeWithRev {
    public static void main(String[] args)
    {
        String rev="",str="";
        int i,j;
        Scanner p = new Scanner(System.in);
        str = p.nextLine();
        i=str.length();
        for(j=i-1;j>=0;j--)
        {
            rev=rev+str.charAt(j);
        }
        System.out.print("The reverse is"+" "+rev);
    }
}


