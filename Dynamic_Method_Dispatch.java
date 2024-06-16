import java.util.Scanner;

class A        // Parent or Super class
{
    public A()                  // Default Constructor
    {
        System.out.println("This is constructor of a class A");
    }
    public A(int n)            // Parameterise Constructor
    {
        this();
        System.out.println("This is the constructor of class A and value of N : " + n);
    }
    public void show(int n)
    {
        System.out.println("In class A Value of N : " + n);
    }
}
class B extends A       // Child or Sub-class of Class A
{
    public B()                             // Default Constructor
    {
        this(0);
        System.out.println("This is constructor of class B");
    }
    public B(int n)                       // Parameterise Constructor
    {
        super(n);
        System.out.println("This is the constructor of class B and value of N :" + n);
    }
}

class Dynamic_Method_Dispatch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        A ob = new B();                       //super or parent class Reference variable refer to sub-class object.
        ob.show(n1);
    }
}
// Dynamic Method Dispatch in Java is the process by which a call to an overridden method is resolved at runtime (during the code execution).
// This is also known as upcasting.
// Java uses this fact to resolve calls to overridden methods at run time.
