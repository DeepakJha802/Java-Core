class A                        // This is Parent Class
{
    public A()
    {
        // this(5);
        System.out.println("This is Default Constructor of Class A");
    }
    public A(int n)
    {
        System.out.println("This is Parameterise Constructor of Class A");
    }
}
class B extends A            // This is Sub-Class
{
    public B()
    {
        // this(5);
        System.out.println("This is Default constructor of Class B");
    }

    public B(int n)
    {
        System.out.println("This is Parameterise Constructor of Class B");
    }

    public void print()
    {
        System.out.println("This is Method of the class B");
    }
}

class C extends B
{
    public C()
    {
        System.err.println("This is Default Constructor of Class C");
    }
    public C(int n)
    {
        System.out.println("This is Parameterise Constructor of Class C");
    }
}

class Solution
{
    public static void main(String[] args)
    {
        B ob = new B();
        ob.print();
        // B obj = new B(5);
    }
}
