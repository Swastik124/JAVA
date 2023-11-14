import java.util.*;

public class ArrayUsingFunctions {
    public static void Insert(int a[],int s)
    {
        for(int i=0;i<s;i++)
        {
             Scanner sc=new Scanner(System.in);
             a[i]=sc.nextInt();
        }
    }
    public static void Display(int a[],int s)
    {
        for(int i=0;i<s;i++)
        {
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the size of Array= ");
        Scanner si=new Scanner(System.in);
        int s= si.nextInt();
        int[] a=new int[s];
        Insert(a,s);
        Display(a,s);
    }
}
