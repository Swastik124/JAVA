import java.util.*;

public class LinearSearch {

    public static void Insert(int b[],int s)
    {
        System.out.println("Enter the Array= ");
        for(int i=0;i<s;i++)
        {
            Scanner sc=new Scanner(System.in);
            b[i]=sc.nextInt();
        }
    }

    public static void Display(int b[],int s)
    {
        for(int i=0;i<s;i++)
        {
            System.out.print(b[i]+" ");
        }
        System.out.println();
    }

    public static void Search(int b[],int s)
    {
        int c=0;
        System.out.println("Enter the value you want to Search= ");
        Scanner val=new Scanner(System.in);
        int v=val.nextInt();
        for(int i=0;i<s;i++)
        {
            if(b[i]==v)
            {
                System.out.println("Element found at index= "+i);
                c++;
            }
        }
        if(c==1)
        {
            System.out.println();
        }
        else{
            System.out.println("Element not Found in Array");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the Size of Array= ");
        Scanner si=new Scanner(System.in);
        int s=si.nextInt();
        int b[]=new int[s];
        Insert(b,s);
        Display(b,s);
        Search(b, s);
    }
    
}
