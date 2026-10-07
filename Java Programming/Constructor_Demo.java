class Demo
{
    public Demo()
    {
        System.out.println("inside default constructor");
    }

    public Demo(int i, int j)
    {
        System.out.println("inside Parameterized constructor");
    }
}

class Constructors_Demo
{
    public static void main(String A[])
    {
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo(10,11);
    }
}