class A                        // This is Parent Class
{
    public A()
    {
        System.out.println("This is Default Constructor of Class A");
    }
    public A(int n)
    {
        System.out.println("This is Parameterise Constructor of Class A");
    }
}
class B extends A             // This is Sub-Class
{
    public B()
    {
        System.out.println("This is Default constructor of Class B");
    }
    public B(int n)
    {
        this();
        System.out.println("This is Parameterise Constructor of Class B");
    }
}

class Solution
{
    public static void main(String[] args)
    {
        B ob = new B(10);
    }
}
