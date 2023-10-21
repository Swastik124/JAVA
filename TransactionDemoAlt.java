interface Transaction
{
    void deposit(int amount);
}
class TransactionDemoAlt {
    public static void main(String[] args)
    {
        Transaction obj=new Transaction() {
            public void deposit(int amount)
            {
                System.out.println("The deposited amount is= "+amount);
            }
        };
        obj.deposit(2000);
    }
    
}
