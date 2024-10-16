import java.util.Scanner;

public class BinarySearch {

    public static int BS(int num[],int key)
    {
        int start=0,end=num.length-1;
        
        while(key<=end)
        {
            
            int mid=start+end/2;
            if(num[mid]==key)
            {
                return mid;
            }
            if(num[mid]<key)
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int num[]= new int[5];
        Scanner c=new Scanner(System.in);
        System.out.println("Enter the Array= ");
        for(int i=0;i<5;i++)
        {
            num[i]=c.nextInt();
        }
        System.out.println("Enter the Key value to Search= ");
        int key=c.nextInt();
        System.out.println("The index of the key is: "+BS(num, key));
    }
    
}
