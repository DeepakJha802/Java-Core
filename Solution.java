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
        this(5);
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
        this(3);
        System.err.println("This is Default Constructor of Class C");
    }
    public C(int n)
    {
        super(5);
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

// Java can not allowed multi - Inheritance.
// Java can allowed to multi - level Inheritance.
// By the use of super we can call the constructor of the super or parent call from sub or child class.
// By the use of this keyword we can call the method or constructor in the same class.
// When we call the constructor of the child class first executes the defalut constructor of the parent class.
// But only if we don't use the this keyword in the constructor.
