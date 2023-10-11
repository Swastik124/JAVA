public class TernaryExample {
    public static void main(String[] args)
    {
        int x=5,y=3;
        //Exp1 ? Exp2(True):Exp3(False)
        int result;
        result=x>y? x+y:y-x;
        System.out.println("result="+result);
    }
}
