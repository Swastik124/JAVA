class A {
    static int x;
    static void get()
    {
        x=100;
        System.out.println("x="+x);
    }
}
class StaticExample2
{
    public static void main (String[] args)
    {
        A.get();
    }
}