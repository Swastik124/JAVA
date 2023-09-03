import java.util.*;

public class FunctionsExample {

    public static void PrintName(String name)
    {
        System.out.println(name);
    }
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        String name= n.next();
        PrintName(name);
    }
}
