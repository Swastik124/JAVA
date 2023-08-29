public class PatternExample2 {
    public static void main(String[] args)
    {
        int r=4,c=3;
        for(int i=0;i<=r;i++)
        {
            for(int j=0;j<=c;j++)
            {
                if(i==0 || j==0 || i==r || j==c)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
        }

    }
}
