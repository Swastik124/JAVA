import java.util.Scanner;
public class ArrayPairs {
    public static void input(int a[],int s)
    {
        System.out.println("Enter the Array values= ");
        Scanner p= new Scanner(System.in);
        for(int i=0;i<s;i++)
        {
            a[i]= p.nextInt();
        }
    }
    public static void display(int a[],int s)
    {
        int j,count=0;
        while(count!=s-1)
        {
            for(j=count;j<s-1;j++)
            {
                if(a[j]!=a[s-1])
                    System.out.println(a[j]+" "+a[j+1]);
            }
            ++count;
        }
    }
    public static void main(String[] args)
    {
        int s;
        System.out.println("Enter the size of Array= ");
        Scanner sc= new Scanner(System.in);
        s=sc.nextInt();
        int a[]= new int[s];
        input(a,s);
        System.out.println("Array Pairs are: ");
        display(a,s);
    }
}
