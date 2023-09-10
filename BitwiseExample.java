public class BitwiseExample {
    public static void main(String[] args)
    {
        int x=5,y=3;
        int result1,result2,result3,result4;
        result1=x&y;
        System.out.println("result="+result1);
        result2=x|y;
        System.out.println("result="+result2);
        result3=x^y;
        System.out.println("result="+result3);
        result4=~x;
        System.out.println("result="+result4);
    }
}
