class Student {
        int regdno;
        String name;
        static String cname="Silicon";
        Student(int regdno,String name)
        {
            this.regdno=regdno;
            this.name=name;
        }
        void show()
        {
            System.out.println(regdno+" "+name);
            System.out.println(cname);
        }
}

class StaticExample1
{
    public static void main(String[] args)
    {
        Student s1= new Student(101,"John");
        Student s2= new Student(102,"Mike");
        s1.show();
        s2.show();
    }
}
