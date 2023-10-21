import java.util.regex.*;


class RegexDemo {
    public static void main(String[] args)
    {
        int count=0;
        Pattern p= Pattern.compile("ab");
        Matcher m= p.matcher("ababbaba");
        while(m.find())
        {
            count++;
            System.out.println(m.start()+"......."+m.end()+"........"+m.group());
        }
        System.out.print("The number of occurances is "+count);
    }
    
}
