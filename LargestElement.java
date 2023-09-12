import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args){
        int largest=0;
        System.out.println("Enter the size of Array= ");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a[]=new int[s];
        System.out.println("Enter the values of array= ");
        Scanner arr = new Scanner(System.in);
        for(int i=0;i<s;i++)
        {
            a[i]=arr.nextInt();
        }
        for(int i=0;i<s;i++)
        {
            if(largest<=a[i])
            {
                largest=a[i];
                a[i]=largest;
            }
        }
        System.out.println("The Largest Element in Array is: "+largest);
    }
    
}
