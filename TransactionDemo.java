interface Transaction{
    void deposit(int amount);
}

class A5 implements Transaction{
    public void deposit(int amount)
    {
        System.out.println("The deposited amount is= "+amount);
    }
}
public class TransactionDemo {
    public static void main(String[] args)
    {
        A5 obj=new A5();
        obj.deposit(2000);

    }
}
