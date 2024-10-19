import java.util.Scanner;

public class BubbleSort {
    public static void Display(int arr[],int s){
        System.out.println("Displaying the Elements= ");
        for(int j=0;j<s;j++)
        {
            System.out.print(arr[j]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int count=0,small,large;
        System.out.println("Enter The size of Array= ");
        Scanner size=new Scanner(System.in);
        int s=size.nextInt();
        int arr[]=new int[s];
        System.out.println("Enter the Elements= ");
        for(int i=0;i<s;i++)
        {
            int a=size.nextInt();
            arr[i]=a;
        }
        Display(arr,s);
        large=arr[0];
        for(int j=0;j<s;j++){
            for(int i=0;i<s-1-j;i++)
            {
                if(arr[i]>arr[i+1])
                {
                    large=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=large;
                }
            }
        }
        Display(arr, s);
    }
    
}
