import java.util.*;

public class ArrayInsertion {

    public static void main(String[] args)
    {
        System.out.println("Enter the size of Array= ");
        Scanner si=new Scanner(System.in);
        int s= si.nextInt();
        int[] a=new int[s];
        for(int i=0;i<s;i++)
        {
             Scanner sc=new Scanner(System.in);
             a[i]=sc.nextInt();
        }
        for(int i=0;i<s;i++)
        {
            System.out.println(a[i]);
        }
    }
}
